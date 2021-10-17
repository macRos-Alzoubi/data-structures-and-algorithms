package BST;

import Node.Node;

public class BTS<T extends Comparable<T>> {
  Node<T> top;

  public BTS() {
    top = null;
  }

  public void add(T data) {
    if (isEmpty())
      top = new Node<T>(data);
    else
      add(data, top);
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
    return contains(data, top);
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

  public Node<T> getTop() {
    return top;
  }

  public boolean isEmpty() {
    return top == null;
  }

}
