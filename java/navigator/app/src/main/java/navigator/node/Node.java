package navigator.node;

public class Node<T> {
  private T data;
  private Node<T> next;
  private Node<T> back;

  public Node(T data) {
    this.data = data;
    next = null;
    back = null;
  }


  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public Node<T> getBack() {
    return back;
  }

  public void setBack(Node<T> back) {
    this.back = back;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + data +
      '}';
  }
}
