// --== CS400 File Header Information ==--
// Name: Ankit Reddy Seelam
// Email: aseelam@wisc.edu
// Team: LC
// Role: Front End Developer
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: NONE

/**
 * This class runs the Robotic Path application to make use of Dijkstra's algorithm to find the
 * shortest path to deliver the package (food) in a minimum amount of time between the user given
 * source and destination
 * 
 * @author AnkitReddySeelam
 */

import java.util.Scanner;

public class RoboticPathApp {
  
  private final static String WELCOME_MESSAGE =
          "==================== Welcome to the Robotic Path App ===================";
  private final static String GOODBYE_MESSAGE =
          "=============== Thank You for using the Robotic Path App ===============";
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    runApp();    
  }
  
  
  static void runApp() {

    CS400Graph<String> graph = UniversityMap.createGraph(); // implements the graph from UniversityMap
    System.out.println("\n" + WELCOME_MESSAGE + "\n"); // Displaying the welcome message

    int userInput = chooseOption(); // asking the user to enter an option


    while (userInput != 2) {
      if (userInput == 1) {


        System.out.println("Please select your current dorm/building - ");
        // Asking the user to enter the dorm they live in
        String dorm = sc.nextLine();
        if (graph.containsVertex(dorm)) {
          int userInput2 = subMenu();
          while (userInput2 != 2) {
            if (userInput2 == 1) {
              System.out.println("Please select one of the dining halls - ");
           // asks user to type the name of the hall
              String diningHall = sc.nextLine();
              if (graph.containsVertex(diningHall)) {
                userInput2 = ETAMenu();
                while (userInput2 != 2) {
                  if (userInput2 == 1) {
                    int ETA = (5 * graph.getPathCost(dorm, diningHall)) + 10; // 10 minutes for food prep and a
                    System.out.println("The ETA is " + ETA + " minutes");     // simple linear equation to
                    userInput2 = chooseOption();                              // translate path cost to time taken
                    break;
                  } else if (userInput2 == 2) {
                    userInput2 = chooseOption();
                  } else {
                    System.out.println("Please select from options 1 or 2 \n");
                    userInput2 = ETAMenu(); // looping back to the menu in order for a new search.
                  }
                }

              } else if (!graph.containsVertex(diningHall)) { // If the user has entered an
                                                              // invalid dining hall
                System.out.println("Invalid Dining Hall name. Please try again\n");
                userInput2 = subMenu();
              }
            } else if (userInput2 == 2) {
              break;
            } else {
              System.out.println("Please select from options 1 or 2 \n");
              userInput2 = subMenu(); // looping back to the menu in order for a new search.
            }

          }
        } else if (!graph.containsVertex(dorm)) { // If the user has entered an invalid location
          System.out.println("Invalid dorm/building name. Please try again\n");

        }
      } else if (userInput == 2) {
        break; // exit the application
      } else { // The user selected an incorrect option
        System.out.println("Please select from options 1 or 2 \n");
      }
      userInput = chooseOption();
    }
    System.out.println(GOODBYE_MESSAGE); // display the goodbye message
  }


  /**
   * Display options for the main menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   **/
  public static int chooseOption() {
    Scanner sc = new Scanner(System.in);
    System.out.println("MAIN COMMAND MENU:"); // Displaying the options of the main menu
    System.out.println("[1] CHOOSE THE DORM/BUILDING YOU WISH TO DELIVER TO");
    System.out.println("[2] EXIT");

    int userInput = sc.nextInt();
    return userInput; // returning the users option
  }



  /**
   * Display the options of the additional menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   */
  public static int subMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("ADDITIONAL COMMAND MENU:");// Displaying the options of the additional menu
    System.out.println("[1] CHOOSE THE DINING HALL YOU WISH TO EAT AT");
    System.out.println("[2] GO BACK TO MAIN COMMAND MENU");
    int userInput = sc.nextInt();// Storing the users option
    return userInput; // returning the users option
  }

  /**
   * Display the options of the ETA menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   */
  public static int ETAMenu() {
    Scanner sc = new Scanner(System.in);
    System.out.println("ETA COMMAND MENU:");// Displaying the options of the ETA menu
    System.out.println("[1] VIEW ETA");
    System.out.println("[2] GO BACK TO MAIN COMMAND MENU");
    int userInput = sc.nextInt();// Storing the users option
    return userInput; // returning the users option
  }

}


