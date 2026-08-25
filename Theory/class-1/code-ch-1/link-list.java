class LL {
    Node head;
    class Node{
    String date;
    Node next;
    Node(String data){
        this.data = data;
        this.next = null;
    }
}

// add - first, last
 public void addFirst(String date){
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return ;
    }
    newNode.next = head;
    head = newNode;
 }

public void addLast(String data){
    Nodde newNode = new Node(data){
         if(head == null){
        head = newNode;
        return ;
    }
    Node currNode = head;
     while(currNode.next!=null){
        currNode = currNode.next;
     }
     currNode.next = newNode;

    }
    //print
    public void printList(){
        if(head == null){
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

}
    public static void main(String args[]){
    LL List = new LL();
    list.addFirst("a");
    list.addLast("is");
    list.printList();

    }
}