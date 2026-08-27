class  reverse{
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    static int size(Node head){
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        return count;

    }
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }}
    public static void main(String arg[]){
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next =e;
        display(a);
        System.out.print("\n");


        System.out.println("Size of link list: "+ size(a));

    }

}