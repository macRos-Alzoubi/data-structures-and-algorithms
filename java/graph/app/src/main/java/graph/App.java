/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import graph.structure.Graph;

import java.util.Map;

public class App {

    public static void main(String[] args) {
      Graph<String> graph = new Graph<>();
      graph.addNode("A");
      graph.addNode("B");
      graph.addNode("C");
      graph.addNode("D");

      graph.addEdge("A", "B", 25);
      graph.addEdge("A", "C", 15);
      graph.addEdge("C", "D", 35);

      System.out.println(graph);
      System.out.println("\n");
      System.out.println(graph.breadthFirstSearch("F"));

//      Map<String, Integer> neighbors = graph.getNeighbors("A");
//      System.out.println(neighbors);
//      Map<String, Integer> neighbors2 = graph.getNeighbors("C");
//      System.out.println(neighbors2);
//      System.out.println(graph.size());
//      System.out.println(graph);
//      System.out.println(graph.getNodes());
    }
}
