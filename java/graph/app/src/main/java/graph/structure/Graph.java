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
    Node<K> node = new Node<>(value);
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

  public Integer getEdgeWight(K from, K to) {
    if (!nodes.isEmpty() && (nodes.containsKey(from) && nodes.containsKey(to))) {
      return nodes.get(from).getEdges().get(from).get(to);
    }
    return 0;
  }

  public Map<K, Node<K>> getNodes() {
    if (!nodes.isEmpty())
      return nodes;
    return null;
  }

  public Map<K, Integer> getNeighbors(K value) {
    if (!nodes.isEmpty() && nodes.containsKey(value)) {
      return nodes.get(value).getEdges().get(value);
    }
    return null;
  }

  public int size() {
    return vertices;
  }

  public Set<K> breadthFirstSearch(K root) {
    if (size() > 0) {
      Set<K> visited = new LinkedHashSet<>();
      Queue<K> queue = new ArrayDeque<>();

      if (nodes.get(root) != null) {
        queue.add(root);

        while (!queue.isEmpty()) {
          K node = queue.remove();

          if (!visited.contains(node)) {
            visited.add(node);
            for (Map.Entry<K, Integer> neighbour : getNeighbors(node).entrySet()) {
              K current = neighbour.getKey();
              if (!visited.contains(current))
                queue.add(current);
            }
          }
        }
        return visited;
      }
    }
    return new HashSet<>();
  }

  public Set<K> depthFirstSearch(K root) {
    if (size() > 0) {
      Set<K> visited = new LinkedHashSet<>();
      Stack<K> stack = new Stack<>();

      if (nodes.get(root) != null) {
        stack.push(root);

        while (!stack.isEmpty()) {
          K node = stack.pop();

          if (!visited.contains(node)) {
            visited.add(node);
            for (Map.Entry<K, Integer> neighbors : getNeighbors(node).entrySet()) {
              K current = neighbors.getKey();
              if (!visited.contains(current))
                stack.push(current);
            }
          }
        }
        return visited;
      }
    }
    return new HashSet<>();
  }

  @Override
  public String toString() {
    return "Graph{" +
      "nodes=" + nodes +
      '}';
  }
}
