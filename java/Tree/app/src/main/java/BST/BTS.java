package BST;

import Node.Node;

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
    if(root.getRight() != null)
      return findMax(root.getRight());
    else
      return root.getData();
  }

}
