package Node;

public class Node<T>{
  T data;
  Node<T> left;
  Node<T> right;

  public Node(){}

  public Node(T data){
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }

  public Node<T> getLeft() {
    return left;
  }

  public void setLeft(Node<T> left) {
    this.left = left;
  }

  public Node<T> getRight() {
    return right;
  }

  public void setRight(Node<T> right) {
    this.right = right;
  }

  @Override
  public String toString() {
    return "Node{" +
      "data=" + data +
      '}';
  }
}
