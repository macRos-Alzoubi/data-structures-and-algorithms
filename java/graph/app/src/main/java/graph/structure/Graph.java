package graph.structure;

import graph.data.Node;

import java.util.*;


public class Graph<K> {

  private final Map<K, Node<K>> nodes;

  private int vertices;

  public Graph() {
    this.nodes = new TreeMap<>();
    vertices = 0;
  }

  public Node<K> addNode(K value) {
    Node<K> node = new Node<K>(value);
    nodes.put(value, node);
    vertices++;
    return node;
  }

  public void addEdge(K srcNode, K disNode, int wight) {
    if (!nodes.isEmpty() && (nodes.containsKey(srcNode) && nodes.containsKey(disNode))) {
      Map<K, Integer> srcMap = nodes.get(srcNode).getEdges().get(srcNode);
      srcMap.put(disNode, wight);
      Map<K, Integer> disMap = nodes.get(disNode).getEdges().get(disNode);
      disMap.put(srcNode, wight);
    }
  }

  public Map<K, Node<K>> getNodes() {
    if(!nodes.isEmpty())
      return nodes;
    return null;
  }

  public Map<K, Integer> getNeighbors(K value) {
    if(!nodes.isEmpty() && nodes.containsKey(value)){
      return nodes.get(value).getEdges().get(value);
    }
    return null;
  }

  public int size() {
    return vertices;
  }

  @Override
  public String toString() {
    return "Graph{" +
      "nodes=" + nodes +
      '}';
  }
}
