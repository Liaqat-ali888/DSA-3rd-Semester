class ll {
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

        Node temp = a;
       while(temp!=null){
        System.out.print(temp.data+" ");

             temp = temp.next;
        }
        }
    
}