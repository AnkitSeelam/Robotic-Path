public class UniversityMap {

  private static CS400Graph<String> graph;

  /**
   * Instantiate graph for the University of Wisconsin-Madison Map
   */
  public static CS400Graph<String> createGraph() {
    graph = new CS400Graph<>();
    insertVertices();
    insertEdges();
    return graph;
  }

  public static void insertEdges() {
    graph.insertEdge("Red Gym", "Book Store", 1);
    graph.insertEdge("Book Store", "Red Gym", 1);
    graph.insertEdge("Red Gym", "Memorial Union", 1);
    graph.insertEdge("Memorial Union", "Red Gym", 1);
    graph.insertEdge("Memorial Union", "Book Store", 2);
    graph.insertEdge("Book Store", "Memorial Union", 2);
    graph.insertEdge("Book Store", "Gordon Dining Event Center", 4);
    graph.insertEdge("Gordon Dining Event Center", "Book Store", 4);
    graph.insertEdge("Witte Residence Hall", "Gordon Dining Event Center", 1);
    graph.insertEdge("Gordon Dining Event Center", "Witte Residence Hall", 1);
    graph.insertEdge("Sellery Residence Hall", "Gordon Dining Event Center", 1);
    graph.insertEdge("Gordon Dining Event Center", "Sellery Residence Hall", 1);
    graph.insertEdge("Ogg Residence Hall", "Gordon Dining Event Center", 1);
    graph.insertEdge("Gordon Dining Event Center", "Ogg Residence Hall", 1);
    graph.insertEdge("Smith Residence Hall", "Gordon Dining Event Center", 2);
    graph.insertEdge("Gordon Dining Event Center", "Smith Residence Hall", 2);
    graph.insertEdge("Sellery Residence Hall", "Memorial Union", 3);
    graph.insertEdge("Memorial Union", "Sellery Residence Hall", 3);
    graph.insertEdge("Sellery Residence Hall", "Grainger Hall", 1);
    graph.insertEdge("Grainger Hall", "Sellery Residence Hall", 1);
    graph.insertEdge("Sellery Residence Hall", "Smith Residence Hall", 2);
    graph.insertEdge("Smith Residence Hall", "Sellery Residence Hall", 2);
    graph.insertEdge("Memorial Union", "Grainger Hall", 3);
    graph.insertEdge("Grainger Hall", "Memorial Union", 3);
    graph.insertEdge("Rheta's Market", "Grainger Hall", 1);
    graph.insertEdge("Grainger Hall", "Rheta's Market", 1);
    graph.insertEdge("Grainger Hall", "Chadbourne & Barnard Residence Hall", 0);
    graph.insertEdge("Chadbourne & Barnard Residence Hall", "Grainger Hall", 0);
    graph.insertEdge("Rheta's Market", "Chadbourne & Barnard Residence Hall", 0);
    graph.insertEdge("Chadbourne & Barnard Residence Hall", "Rheta's Market", 0);
    graph.insertEdge("Rheta's Market", "Ingraham Hall", 2);
    graph.insertEdge("Ingraham Hall", "Rheta's Market", 2);
    graph.insertEdge("Chemistry Building", "Grainger Hall", 1);
    graph.insertEdge("Grainger Hall", "Chemistry Building", 1);
    graph.insertEdge("Sellery Residence Hall", "Union South", 4);
    graph.insertEdge("Union South", "Sellery Residence Hall", 4);
    graph.insertEdge("Engineering Hall", "Union South", 1);
    graph.insertEdge("Union South", "Engineering Hall", 1);
    graph.insertEdge("Engineering Hall", "Camp Randall Stadium", 1);
    graph.insertEdge("Camp Randall Stadium", "Engineering Hall", 1);
    graph.insertEdge("Chemistry Building", "Van Vleck", 2);
    graph.insertEdge("Van Vleck", "Chemistry Building", 2);
    graph.insertEdge("Chemistry Building", "Union South", 2);
    graph.insertEdge("Union South", "Chemistry Building", 2);
    graph.insertEdge("Ingraham Hall", "Van Vleck", 1);
    graph.insertEdge("Van Vleck", "Ingraham Hall", 1);
    graph.insertEdge("Ingraham Hall", "Water's Residence Hall", 1);
    graph.insertEdge("Water's Residence Hall", "Ingraham Hall", 1);
    graph.insertEdge("Ingraham Hall", "Memorial Union", 3);
    graph.insertEdge("Memorial Union", "Ingraham Hall", 3);
    graph.insertEdge("Adam's Residence Hall", "Water's Residence Hall", 1);
    graph.insertEdge("Water's Residence Hall", "Adam's Residence Hall", 1);
    graph.insertEdge("Chemistry Building", "Water's Residence Hall", 4);
    graph.insertEdge("Water's Residence Hall", "Chemistry Building", 4);
    graph.insertEdge("Chemistry Building", "Engineering Hall", 3);
    graph.insertEdge("Engineering Hall", "Chemistry Building", 3);
    graph.insertEdge("Chemistry Building", "Babcock", 5);
    graph.insertEdge("Babcock", "Chemistry Building", 5);
    graph.insertEdge("Adam's Residence Hall", "Babcock", 3);
    graph.insertEdge("Babcock", "Adam's Residence Hall", 3);
    graph.insertEdge("Adam's Residence Hall", "Dejope Residence Hall", 3);
    graph.insertEdge("Dejope Residence Hall", "Adam's Residence Hall", 3);
    graph.insertEdge("Four Lake's Market", "Dejope Residence Hall", 0);
    graph.insertEdge("Dejope Residence Hall", "Four Lake's Market", 0);
    graph.insertEdge("The Natatorium", "Dejope Residence Hall", 1);
    graph.insertEdge("Dejope Residence Hall", "The Natatorium", 1);
    graph.insertEdge("The Natatorium", "Babcock", 5);
    graph.insertEdge("Babcock", "The Natatorium", 5);
    graph.insertEdge("Babcock", "Dejope Residence Hall", 4);
    graph.insertEdge("Dejope Residence Hall", "Babcock", 4);
    graph.insertEdge("Engineering Hall", "Babcock", 4);
    graph.insertEdge("Babcock", "Engineering Hall", 4);
  }

  public static void insertVertices() {
    graph.insertVertex("Red Gym");
    graph.insertVertex("Book Store");
    graph.insertVertex("Memorial Union");
    graph.insertVertex("Witte Residence Hall");
    graph.insertVertex("Gordon Dining Event Center");
    graph.insertVertex("Sellery Residence Hall");
    graph.insertVertex("Ogg Residence Hall");
    graph.insertVertex("Smith Residence Hall");
    graph.insertVertex("Computer Science Building");
    graph.insertVertex("Union South");
    graph.insertVertex("Engineering Hall");
    graph.insertVertex("Camp Randall Stadium");
    graph.insertVertex("Camp Randall Memorial Park");
    graph.insertVertex("Grainger Hall");
    graph.insertVertex("Rheta's Market");
    graph.insertVertex("Chadbourne & Barnard Residence Hall");
    graph.insertVertex("Chemistry Building");
    graph.insertVertex("Van Vleck");
    graph.insertVertex("Ingraham Hall");
    graph.insertVertex("Van Hise");
    graph.insertVertex("Psychology Building");
    graph.insertVertex("Water's Residence Hall");
    graph.insertVertex("Adam's Residence Hall");
    graph.insertVertex("Cole Residence Hall");
    graph.insertVertex("Slichter Residence Hall");
    graph.insertVertex("Tripp Residence Hall");
    graph.insertVertex("Dejope Residence Hall");
    graph.insertVertex("Four Lake's Market");
    graph.insertVertex("Babcock");
    graph.insertVertex("The Natatorium");
  }
}
