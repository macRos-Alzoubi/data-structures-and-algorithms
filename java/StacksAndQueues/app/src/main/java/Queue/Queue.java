package Queue;

import Node.Node;

public class Queue<T> {

  private Node<T> front;
  private Node<T> back;

  public Queue() {
    front = back = null;
  }

  public void enqueue(T data) {
    Node<T> node = new Node<>(data);
    if (isEmpty())
      front = node;
    else {
      back.setNext(node);
    }
    back = node;
  }

  public T dequeue() throws Exception {
    T data;
    if(isEmpty())
      throw new Exception("Can't remove from empty Queue!");
    else{
      data = front.getData();
      front = front.getNext();
    }
    return data;
  }

  public T peek() throws Exception {
    if(isEmpty())
      throw new Exception("Can't peek empty Queue!");
    else
      return front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }

  @Override
  public String toString() {
    String queueStr = getQueueString();
    return String.format("back <- %s <- front",queueStr);
  }

  private String getQueueString() {
    StringBuilder queueStr = new StringBuilder();
    if(!isEmpty()){
      Node<T> current = front;
      while(current != null){
        queueStr.append(current.getData());
        if(current.getNext() != null)
          queueStr.append(" <- ");
        current = current.getNext();
      }
    }
    return queueStr.toString();
  }
}
