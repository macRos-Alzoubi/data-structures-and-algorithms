package hashTable.data;

public class Node<K, V> {
  private K key;
  private V value;

  private Node<K, V> next;

  private int hashCode;

  public Node(K key, V value, int hashCode ){
    this.key = key;
    this.value = value;
    this.hashCode = hashCode;
    next = null;
  }

  public K getKey() {
    return key;
  }

  public void setKey(K key) {
    this.key = key;
  }

  public V getValue() {
    return value;
  }

  public void setValue(V value) {
    this.value = value;
  }

  public int getHashCode() {
    return hashCode;
  }

  public void setHashCode(int hashCode) {
    this.hashCode = hashCode;
  }

  public Node<K, V> getNext() {
    return next;
  }

  public void setNext(Node<K, V> next) {
    this.next = next;
  }

  @Override
  public String toString() {
    return "Node{" +
            "key=" + key +
            ", value=" + value +
            ", next=" + next +
            ", hashCode=" + hashCode +
            '}';
  }
}
