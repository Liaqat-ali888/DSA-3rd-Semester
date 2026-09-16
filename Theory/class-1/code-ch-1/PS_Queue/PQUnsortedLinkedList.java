class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class PQUnsortedLinkedList {

    private Node head;

    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
    }

    public int getMax() {

        if (head == null)
            throw new RuntimeException("Queue is empty");

        int max = head.data;

        Node temp = head;

        while (temp != null) {
            if (temp.data > max)
                max = temp.data;

            temp = temp.next;
        }

        return max;
    }

    public int extractMax() {

        if (head == null)
            throw new RuntimeException("Queue is empty");

        Node current = head;
        Node previous = null;

        Node maxNode = head;
        Node maxPrev = null;

        while (current != null) {

            if (current.data > maxNode.data) {
                maxNode = current;
                maxPrev = previous;
            }

            previous = current;
            current = current.next;
        }

        if (maxPrev == null)
            head = head.next;
        else
            maxPrev.next = maxNode.next;

        return maxNode.data;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        PQUnsortedLinkedList pq = new PQUnsortedLinkedList();

        pq.insert(5);
        pq.insert(7);
        pq.insert(1);
        pq.insert(4);

        System.out.print("Queue: ");
        pq.display();

        System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
           System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
  System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
          System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
          System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
          System.out.println("Max: " + pq.getMax());
        System.out.println("Extracted: " + pq.extractMax());

        pq.display();
        

    }
}