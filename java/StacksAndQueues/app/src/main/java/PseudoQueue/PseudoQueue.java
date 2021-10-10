package PseudoQueue;

import Node.Node;
import Stack.Stack;

public class PseudoQueue<T> implements Queue<T> {
  private Stack<T> stackOne;
  private Stack<T> stackTwo;

  public PseudoQueue() {
    stackOne = new Stack<T>();
    stackTwo = new Stack<T>();
  }

  @Override
  public void enqueue(T data) {
    Node<T> node = new Node<T>(data);
    if (stackOne.isEmpty()) {
      stackOne.setTop(node);
    } else {
      stackTwo.getTop().setNext(node);
    }
    stackTwo.setTop(node);
  }

  @Override
  public T dequeue() throws Exception {
    T data = stackOne.getTop().getData();
    Node<T> current = stackOne.getTop().getNext();
    if (stackOne.isEmpty())
      throw new Exception("Can't dequeue from empty Queue!");
    else
      stackOne.setTop(current);
    return data;
  }

  @Override
  public String toString() {
    return String.format("Front <- %s <- Back",
      getQueueData());
  }

  private String getQueueData() {
    StringBuilder queueStr = new StringBuilder();
    if(!stackOne.isEmpty()){
      Node<T> current = stackOne.getTop();
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
