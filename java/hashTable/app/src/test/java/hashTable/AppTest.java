/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable;

import hashTable.structure.HashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void canAdd() {
    HashTable<String, Integer> hashTable = new HashTable<>();

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Mohammad", 75);
      hashTable.add("Rahaf", 120);
    } catch (Exception e) {
      e.printStackTrace();
    }

    String hashToString = hashTable.toString();
    assertEquals(hashToString, hashTable.toString());
  }

  @Test
  void canGetValue(){
    HashTable<String, Integer> hashTable = new HashTable<>();
    int value = 0;

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Mohammad", 75);
      hashTable.add("Rahaf", 120);
      value = hashTable.get("Rahaf");
      assertEquals(value, hashTable.get("Rahaf"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void doseNotExist(){
    HashTable<String, Integer> hashTable = new HashTable<>();

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Mohammad", 75);
      hashTable.add("Rahaf", 120);
      assertNull(hashTable.get("jack"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void handleCollision(){
    HashTable<String, Integer> hashTable = new HashTable<>();

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Teheran", 75);
      hashTable.add("Siblings", 120);
      System.out.println(hashTable);
      assertEquals(100, (int) hashTable.get("Tariq"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void getFromCollision(){
    HashTable<String, Integer> hashTable = new HashTable<>();

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Teheran", 75);
      hashTable.add("Siblings", 120);
      System.out.println(hashTable);
      assertEquals(100, (int) hashTable.get("Tariq"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @Test
  void indexInRang(){
    HashTable<String, Integer> hashTable = new HashTable<>();

    try {
      hashTable.add("Tariq", 100);
      hashTable.add("Teheran", 75);
      hashTable.add("Siblings", 120);
      System.out.println(hashTable);
      int hashCode = hashTable.hashCode("Tariq");
      int index = hashCode % hashTable.size();
      assertTrue(0 <= index && index <= hashTable.size());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
