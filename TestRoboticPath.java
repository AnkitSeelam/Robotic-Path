

import org.junit.jupiter.api.Test;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.FileNotFoundException;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class TestRoboticPath {
    
    CS400Graph<String> graph = UniversityMap.createGraph();
     
    /*
     * Checks if insertVertex() method works and tests if buildings can be searched
     * using containsVertex() method.
     */
    @Test
    public void testInsertandSearch()
    {
        graph.insertVertex("The James");
        assertTrue(graph.containsVertex("The James"));
    }
    
    /**
     * Tests if the algorithm is efficiently able to find the shortest path between
     * the source and the destination.
     */
    @Test
    public void testShortestDistance()
    {
        //Case 1
        assertTrue(graph.shortestPath("Sellery Residence Hall", "Ingraham Hall").toString().
            equals("[Sellery Residence Hall, Grainger Hall, Rheta's Market, Ingraham Hall]"));
        
        //Case 2
        assertTrue(graph.shortestPath("Memorial Union", "Union South").toString().
            equals("[Memorial Union, Sellery Residence Hall, Union South]"));
       
    }
    
    /**
     * Tests the functionality of the Robotic Path App using Printstream
     */
    @Test
    public void testMenu() throws FileNotFoundException
    {
      ByteArrayOutputStream x = new ByteArrayOutputStream();
      PrintStream y = new PrintStream(x);
      PrintStream old = System.out; // Saves the old values
      System.setOut(y); // makes sure Java  uses the special stream
      File file = new File("input.txt"); // This file represents the users input
        
      RoboticPathApp.sc = new Scanner(file);
      RoboticPathApp.runApp(); 
      System.out.flush(); // gets the output
      System.setOut(old);
      System.out.println(x.toString());
        String expected = "MAIN COMMAND MENU:\n"
                          +  "[1] CHOOSE THE DORM/BUILDING YOU WISH TO DELIVER TO\n"
                          +  "[2] EXIT\n"
                          +  "Please select your current dorm/building -\n"
                          +  "ADDITIONAL COMMAND MENU:\n"
                          +  "[1] CHOOSE THE DINING HALL YOU WISH TO EAT AT\n"
                          +  "[2] GO BACK TO MAIN COMMAND MENU\n"
                          +  "Please select one of the dining halls -\n" 
                          +  "ETA COMMAND MENU:\n"
                          +  "[1] VIEW ETA\n"
                          +  "[2] GO BACK TO MAIN COMMAND MENU\n"
                          +  "The ETA is 60 minutes\n"
                          +  "MAIN COMMAND MENU:\n"
                          +  "[1] CHOOSE THE DORM/BUILDING YOU WISH TO DELIVER TO\n"
                          +  "[2] EXIT\n"
                          +  "MAIN COMMAND MENU:\n"
                          +  "[1] CHOOSE THE DORM/BUILDING YOU WISH TO DELIVER TO\n"
                          +  "[2] EXIT\n";
                          
        if (!x.toString().equals(expected))
        {
            fail("Not correctly implemented");
        }
    }}

