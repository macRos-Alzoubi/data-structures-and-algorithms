package Stack;

import Node.Node;

public class Stack<T> {
  private Node<T> top;

  public Stack() {
    top = null;
  }

  public Node<T> getTop() {
    return top;
  }

  public void push(T data) {
    Node<T> node = new Node<>(data);
    if (!isEmpty())
      node.setNext(top);
    top = node;
  }

  public T pop() throws Exception {
    T data;
    if(isEmpty())
      throw new Exception("Can't remove from empty Stack!");
    else{
      data = top.getData();
      top = top.getNext();
    }
    return data;
  }

  public T peek() throws Exception {
    if(isEmpty())
      throw new Exception("Can't peek empty Stack!");
    else
      return top.getData();
  }

  public boolean isEmpty() {
    return top == null;
  }

  @Override
  public String toString() {
    String stackStr = getStackString();
    return String.format("Top -> %s -> NULL",stackStr);
  }

  private String getStackString() {
    StringBuilder StackStr = new StringBuilder();
    if(!isEmpty()){
      Node<T> current = top;
      while(current != null){
        StackStr.append(current.getData());
        if(current.getNext() != null)
          StackStr.append(" -> ");
        current = current.getNext();
      }
    }
    return StackStr.toString();
  }
}
