package linked.list;

public class LinkedList {
  private Node head;

  public LinkedList() {
    this.head = null;
  }

  public Node getHead() {
    return head;
  }

  public void insert(String value) {
    Node newNode = new Node(value);
    if (head != null)
      newNode.setNext(head);
    head = newNode;
  }

  public boolean includes(String value) {
    Node current = head;

    while (current != null) {
      if (current.getData() == value)
        return true;
      current = current.getNext();
    }

    return false;
  }

  @Override
  public String toString() {
    return formattedOutput();
  }

  private String formattedOutput() {
    String formattedOutput = "Head -> ";
    Node current = head;

    while (current != null) {
      formattedOutput += current.getData() + " -> ";
      current = current.getNext();
    }
    return formattedOutput + "NULL";
  }
}
