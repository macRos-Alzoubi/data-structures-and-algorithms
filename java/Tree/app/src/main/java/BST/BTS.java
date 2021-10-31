package BST;

import Node.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BTS<T extends Comparable<T>> {
  Node<T> root;

  public BTS() {
    root = null;
  }

  public Node<T> getRoot() {
    return root;
  }

  public boolean isEmpty() {
    return root == null;
  }

  public void add(T data) {
    if (isEmpty())
      root = new Node<T>(data);
    else
      add(data, root);
  }

  private void add(T data, Node<T> root) {

    if (data.compareTo(root.getData()) > 0)
      if (root.getRight() != null)
        add(data, root.getRight());
      else
        root.setRight(new Node<T>(data));
    if (data.compareTo(root.getData()) < 0)
      if (root.getLeft() != null)
        add(data, root.getLeft());
      else
        root.setLeft(new Node<T>(data));
  }

  public boolean contains(T data) {
    if (isEmpty())
      return false;
    return contains(data, root);
  }

  private boolean contains(T data, Node<T> root) {

    if (root == null)
      return false;
    if (data.compareTo(root.getData()) == 0)
      return true;
    else if (data.compareTo(root.getData()) > 0)
      return contains(data, root.getRight());
    else
      return contains(data, root.getLeft());
  }

  public T findMax() throws Exception {
    if (isEmpty())
      throw new Exception("Tree is empty!");
    else
      return findMax(root);
  }

  private T findMax(Node<T> root) {
    if (root.getRight() != null)
      return findMax(root.getRight());
    else
      return root.getData();
  }

  public static List<Node<Integer>> breadthFirst(BTS<Integer> tree) throws Exception {
    if (tree.isEmpty())
      throw new Exception("Tree is empty!");
    return breadthFirst(tree.getRoot());
  }

  private static List<Node<Integer>> breadthFirst(Node<Integer> node) {
    Queue<Node<Integer>> queue = new LinkedList<>();
    List<Node<Integer>> list = new ArrayList<>();
    queue.add(node);

    while (!queue.isEmpty()) {

      node = queue.remove();
      list.add(node);

      if (node.getLeft() != null)
        queue.add(node.getLeft());

      if (node.getRight() != null)
        queue.add(node.getRight());
    }

    return list;
  }

  public int oddNumSum() {
    int sum = 0;
    if (isEmpty())
      return -1;
    else {
      try {
        List<Node<Integer>> nodeList = breadthFirst((BTS<Integer>) this);

        for(Node<Integer> node : nodeList)
          if(node.getData() % 2 != 0)
            sum += node.getData();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return sum;
  }

}
