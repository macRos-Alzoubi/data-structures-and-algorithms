/**
 * Written by Mohammad Alzoubi
 */
package linked.list;

public class LinkedList {
  private Node head;
  private int size;

  /**
   * Default constructor
   */
  public LinkedList() {
    this.head = null;
    size = 0;
  }

  /**
   * Getting the head reference pinter
   *
   * @return head Node reference pinter
   */
  public Node getHead() {
    return head;
  }

  public int getSize() {
    return size;
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
    size++;
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
    size++;
  }

  /**
   * Insert a passed value before a given value if exist
   *
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
      size++;
      return true;
    } else {
      Node current = head;
      while (current.getNext() != null) {
        if (current.getNext().getData().equals(value)) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          size++;
          return true;
        }
        current = current.getNext();
      }
      return false;
    }
  }

  /**
   * Insert a passed value before a given value if exist
   *
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
      size++;
      return true;
    } else {
      Node current = head;
      while (current != null) {
        if (current.getData().equals(value)) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          size++;
          return true;
        }
        current = current.getNext();
      }
      return false;
    }
  }

  public boolean insertAfter(int index, String data) {
    Node newNode = new Node(data);
    if (head == null)
      return false;
    else if (index > getSize() - 1 || index < 0)
      return false;
    else if (index == 0) {
      newNode.setNext(head.getNext());
      head.setNext(newNode);
      size++;
      return true;
    } else {
      Node current = head;
      int counter = 0;
      while (current != null) {
        if (counter == index) {
          newNode.setNext(current.getNext());
          current.setNext(newNode);
          size++;
          return true;
        }
        current = current.getNext();
        counter++;
      }
      return false;
    }
  }

  /**
   * Delete a given value from the linked list
   *
   * @param value String value to be deleted from the linked list
   * @return Boolean value indicates whether the value is successfully deleted or not
   */
  public boolean delete(String value) {
    if (head == null)
      return false;
    else if (head.getData().equals(value)) {
      head = null;
      size--;
      return true;
    } else {
      Node traceCurrent = head;
      Node current = head.getNext();

      while (current.getNext() != null) {
        if (current.getData().equals(value)) {
          traceCurrent.setNext(current.getNext());
          current.setNext(null);
          size--;
          return true;
        }
        traceCurrent = current;
        current = current.getNext();
      }
      if (current.getData().equals(value)) {
        traceCurrent.setNext(null);
        size--;
        return true;
      }
    }
    return false;
  }


  /**
   * Return th Kth element in the list
   *
   * @param k Integer value represents a kth index in the linked list
   * @return String value in the specified Kth index if exist
   */
  public String kthFromEnd(int k) {
    if (size == 0)
      return "The list is empty";
    if (k > size - 1 || k < 0)
      return String.format("%s is out of the list range (0 - %d)", k, size - 1);
    else {
      int numOfSteps = size - 1 - k;
      int counter = 0;
      Node current = head;

      while (counter < numOfSteps) {
        current = current.getNext();
        counter++;
      }

      return current.getData();
    }
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

  /**
   * formattedOutput a method that returns a formatted string that contains all the liked list info.
   *
   * @return String all linked list info.
   */
  private String formattedOutput() {
    StringBuilder formattedOutput = new StringBuilder("Head -> ");
    Node current = head;

    while (current != null) {
      formattedOutput.append(current.getData()).append(" -> ");
      current = current.getNext();
    }
    return formattedOutput + "NULL";
  }


  public static LinkedList zipLists(LinkedList list1, LinkedList list2) throws Exception {
    if (list1.size == 0 && list2.size == 0) {
      throw new Exception("You can't zip two empty lists");
    } else if (list1.size == 0)
      return list2;
    else if (list2.size == 0)
      return list1;
    else {
      Node current = list1.head;
      Node current2 = list2.head;
      int length1 = list1.getSize();
      int length2 = list2.getSize();
      int index = 0;

      while (current.getNext() != null) {
        list1.insertAfter(index, current2.getData());
        if (current2.getNext() == null)
          break;
        else {
          current2 = current2.getNext();
          current = current.getNext().getNext();
          index += 2;
        }
      }

      if (length2 >= length1)
        while (current2 != null) {
          list1.append(current2.getData());
          current2 = current2.getNext();
        }

      return list1;
    }
  }

  private LinkedList ListCloner(LinkedList list) {
    if (list.size == 0)
      return list;
    else {
      LinkedList listClone = new LinkedList();
      Node current = this.head;

      while (current != null) {
        listClone.append(current.getData());
        current = current.getNext();
      }
      return listClone;
    }
  }

}
