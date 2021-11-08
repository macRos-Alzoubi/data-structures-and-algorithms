package hashTable.structure;

import hashTable.data.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HashTable<K, V> {

  private List<Node<K, V>> bucketArray;
  private int size;
  private int bucketSize;

  public HashTable(){
    bucketArray = new ArrayList<>();
    size = 0;
    bucketSize = 10;

    listInit();
  }

  private void listInit() {
    for(int i = 0; i < bucketSize; i++)
      bucketArray.add(null);
  }

  public V get(K key) throws Exception {
    if(isEmpty())
      throw  new Exception("Can't get from empty table");
    else{
      int index = hash(key);
      int hashCode = hashCode(key);
      Node<K, V> head = bucketArray.get(index);

      while (head != null){
        if(key.equals(head.getKey()) && hashCode == head.getHashCode())
          return head.getValue();
        head = head.getNext();
      }
      return null;
    }
  }

  public void add(K key, V value) {
    int index = hash(key);
    int hashCode = hashCode(key);
    Node<K, V> head = bucketArray.get(index);

    while (head != null) {
      if (head.getKey().equals(key) && head.getHashCode() == hashCode) {
        head.setValue(value);
        return;
      }
      head = head.getNext();
    }

    size++;
    Node<K, V> newNode = new Node<>(key, value, hashCode);
    head = bucketArray.get(index);

    newNode.setNext(head);
    bucketArray.set(index, newNode);

    if ((1.0 * size) / bucketSize >= 0.7) {
      List<Node<K, V> > temp = bucketArray;
      bucketArray = new ArrayList<>();
      bucketSize = 2 * bucketSize;
      size = 0;
      for (int i = 0; i < bucketSize; i++)
        bucketArray.add(null);

      for (Node<K, V> headNode : temp) {
        while (headNode != null) {
          add(headNode.getKey(), headNode.getValue());
          headNode = headNode.getNext();
        }
      }
    }

  }

  public boolean contains(K key) throws Exception {
    if(isEmpty())
      return false;
    else
      return get(key) != null;
  }

  private int hash(K key){
    int hashCode = Objects.hashCode(key);
    hashCode = hashCode < 0 ? hashCode * -1 : hashCode;
    return hashCode % bucketSize;
  }

  public final int hashCode (K key) {
    return Objects.hashCode(key);
  }

  public int size(){ return size;}

  public boolean isEmpty(){ return size() == 0;}

  @Override
  public String toString() {
    return "HashTable{" +
      "bucketArray=" + bucketArray +
      '}';
  }
}
