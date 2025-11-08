public class Linkedlist {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;

  // add first node
  public void addFirst(int data) {
    // Step1-create new node
    Node newNode = new Node(data);

    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step2-newNode next = head;
    newNode.next = head; // link

    // step3
    head = newNode;
  }

  public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();
    ll.addFirst(2);
    ll.addFirst(1);
  }
}
