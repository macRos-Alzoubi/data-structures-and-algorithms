/**
 * Written by Mohammad Alzoubi
 */
package linked.list;

public class LinkedList {
  private Node head;

  /**
   * Default constructor
   */
  public LinkedList() {
    this.head = null;
  }

  /**
   * Getting the head reference pinter
   *
   * @return head Node reference pinter
   */
  public Node getHead() {
    return head;
  }

  /**
   * Insert a Node into the beginning of the linked list
   *
   * @param value String value to be inserted at the beginning of the linked list
   */
  public void insert(String value) {
    Node newNode = new Node(value);
    if (head != null)
      newNode.setNext(head);
    head = newNode;
  }

  /**
   * Checks if a specific value exist in the liked list
   *
   * @param value String value to be checked whether it exist in the linked list
   * @return Boolean value if the passed value do exist in the linked list
   */
  public boolean includes(String value) {
    Node current = head;

    while (current != null) {
      if (current.getData().equals(value))
        return true;
      current = current.getNext();
    }

    return false;
  }

  /**
   * Append the passed value to the end of the linked list
   *
   * @param value String value to be inserted at the end of the linked list
   */
  public void append(String value) {
    Node newNode = new Node(value);

    if (head == null)
      head = newNode;
    else {
      Node current = head;
      while (current.getNext() != null)
        current = current.getNext();
      current.setNext(newNode);
    }
  }

  /**
   * Insert a passed value before a given value if exist
   * @param value    String value to be used to insert another given value before it
   * @param newValue String value to be inserted before another given value
   * @return Boolean value whether the passed value is inserted successfully or not
   */
  public boolean insertBefore(String value, String newValue) {
    Node newNode = new Node(newValue);
    if (head == null)
      return false;
    else if (head.getData().equals(value)) {
      newNode.setNext(head);
      head = newNode;
      return true;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        if (current.getNext().getData().equals(value)) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          return true;
        }
        current = current.getNext();
      }
      return false;
    }
  }

  /**
   * Insert a passed value before a given value if exist
   * @param value    String value to be used to insert another given value after it
   * @param newValue String value to be inserted before another given value
   * @return Boolean value whether the passed value is inserted successfully or not
   */
  public boolean insertAfter(String value, String newValue) {
    Node newNode = new Node(newValue);
    if (head == null)
      return false;
    else if (head.getData().equals(value)) {
      newNode.setNext(head.getNext());
      head.setNext(newNode);
      return true;
    } else {
      Node current = head;
      while (current != null) {
        if (current.getData().equals(value)) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          return true;
        }
        current = current.getNext();
      }
      return false;
    }
  }

  /**
   * Delete a given value from the linked list
   * @param value String value to be deleted from the linked list
   * @return Boolean value indicates whether the value is successfully deleted or not
   */
  public boolean delete(String value) {
    if (head == null)
      return false;
    else if (head.getData().equals(value))
      head = null;
    else {
      Node traceCurrent = head;
      Node current = head.getNext();

      while (current.getNext() != null) {
        if (current.getData().equals(value)) {
          traceCurrent.setNext(current.getNext());
          current.setNext(null);
          return true;
        }
        traceCurrent = current;
        current = current.getNext();
      }
      if(current.getData().equals(value)) {
        traceCurrent.setNext(null);
        return true;
      }
    }
    return false;
  }

  /**
   * Print to the console all the nodes in side the linked list
   *
   * @return Formatted String contains all the nodes in side the linked list
   */
  @Override
  public String toString() {
    return formattedOutput();
  }

  private String formattedOutput() {
    StringBuilder formattedOutput = new StringBuilder("Head -> ");
    Node current = head;

    while (current != null) {
      formattedOutput.append(current.getData()).append(" -> ");
      current = current.getNext();
    }
    return formattedOutput + "NULL";
  }
}
