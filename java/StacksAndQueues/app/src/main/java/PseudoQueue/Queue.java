package PseudoQueue;

public interface Queue<T> {
  void enqueue(T data);
  T dequeue() throws Exception;
}
