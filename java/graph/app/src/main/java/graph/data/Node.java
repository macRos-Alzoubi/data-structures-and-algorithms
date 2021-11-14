package graph.data;

import java.util.*;

public class Node<K> {
  private final Map<K, Map<K, Integer>> edges;

  public Node(K value) {
    edges = new TreeMap<>();
    edges.put(value, new TreeMap<>());
  }

  public Map<K, Map<K, Integer>> getEdges() {
    return edges;
  }

  private StringBuilder getAllEdges() {
    StringBuilder edges = new StringBuilder();
    for (Map.Entry<K, Map<K, Integer>> entry : getEdges().entrySet())
      for (Map.Entry<K, Integer> innerEntry : entry.getValue().entrySet())
        edges.append(" {").append(innerEntry.getKey()).append(", ").append(innerEntry.getValue()).append("}");

    return edges;
  }

  public K getLiable(){
    for(K key: edges.keySet()){
      return key;
    }
    return null;
  }

  @Override
  public String toString() {
    StringBuilder stringBuilder = getAllEdges();
    return String.format("%s", stringBuilder);
  }
}
