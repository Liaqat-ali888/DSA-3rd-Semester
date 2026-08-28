class implementation{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head == null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAtStart(int data){
            Node temp = new Node(data);
            if(head==null){
                head = tail =temp;
            }
            else{
                temp.next = head;
                head = temp;

            }
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
        int size(){
            int count = 0;
            Node temp =head;
            while(temp!=null){
                count++;
                temp = temp.next;

            }
            return count;
        }
    }
    public static void main(String ar[]){
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        System.out.println("Before insert at end");
        ll.display();
        System.out.println("After insert at end");
        ll.insertAtEnd(6);
        ll.display();
        System.out.println("Size:  "+ll.size());
        System.out.println("After insert at first");
        ll.insertAtStart(345);
        ll.display();

    }
}