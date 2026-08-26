class basicsll {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;

        }
    }


    public static void main(String arg[]) {
        //basicsll a = new basicsll();
        // basicsll.Node x = a.new Node(10);
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        System.out.print(a.data);
        System.out.print(b.data);
        System.out.print(c.data);
        System.out.print(d.data);
        System.out.print(e.data);
        System.out.print(f.data);
    }
}