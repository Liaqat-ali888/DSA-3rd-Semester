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

        ll.insertAtEnd(6);
        ll.display();
        System.out.print("Size:  "+ll.size());

    }
}
