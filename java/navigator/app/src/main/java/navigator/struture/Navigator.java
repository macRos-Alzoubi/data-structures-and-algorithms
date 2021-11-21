package navigator.struture;

import navigator.node.Node;

public class Navigator<T> {
  Node<T> front;
  Node<T> back;
  Node<T> current;
  int size;

  public Navigator() {
    front = null;
    back = null;
    current = null;
    size = 0;
  }

  public void add(T data) {
    Node<T> node = new Node<>(data);
    if (isEmpty()) {
      front = node;
      back = node;
      current = node;
    } else {
     node.setBack(back);
     back.setNext(node);
     back = node;
    }
    size++;
  }

  public boolean remove(T data){
    if(!isEmpty()){
      Node<T> temp = front;
      Node<T> traceTemp = front;
      while(temp != null){
        if(temp.getData().equals(data)){
          traceTemp.setNext(temp.getNext());
          temp.getNext().setBack(traceTemp);
          size--;
          return true;
        }
        traceTemp = temp;
        temp = temp.getNext();
      }
      return false;
    }
    return false;
  }

  public void go(T data){
    add(data);
    if(current.getNext() != null)
      current = current.getNext();
  }

  public T forward(){
    if(current.getNext() == null)
      return null;
    else{
      current = current.getNext();
      return current.getData();
    }
  }

  public T back(){
    if(current.getBack() == null)
      return null;
    else{
      current = current.getBack();
      return current.getData();
    }
  }

  public boolean isEmpty() {
    return front == null;
  }

  public int size(){
    return size;
  }
}
