//Liaqat Ali

class RecordData{
    int data;

    RecordData(int data){
        this.data = data;
    }
    void displayall(){
        System.out.println(data);
    }

    
}
class Node {
    RecordData student;
    Node next;
   
    Node (RecordData student){
        this.student = student;
        this.next = null;
    }

}
class linkedlist{

Node head;

    linkedlist(){
        this.head = null;
     
    }
 void addBack(RecordData s){
    Node newdata = new Node(s);
    if(head == null){
        head = newdata;
        newdata.next = head;
      
        return;

    }
    Node cur = head;
    while(cur.next!= head){
        cur= cur.next;
    }
    cur.next = newdata;
    newdata.next = head;

 }

  void addFront(RecordData s){
    Node newNode = new Node(s);
   if(head ==null){
    head = newNode;
    newNode.next = head;
    return;
   }
    Node cur = head;
    while(cur.next!=head){
        cur =cur.next;
    }
    cur.next = newNode;
    newNode.next = head;
    head = newNode;

  }

  void deleteFront(){
    Node cur = head;
    while(cur.next!=head){
        cur = cur.next;
    }
    cur.next = head.next;        
     head = head.next;
  }
  void deleteBack(){
    Node cur = head;
    while(cur.next.next !=head){
        cur = cur.next;
    }
    cur.next = head;
  }
  void searchNode(RecordData d){
   
    Node cur = head;
    if(head.student.data == d.data){
        head.student.displayall();
        return;
    }
    while(cur.next !=head){
       cur = cur.next;
        if(cur.student.data ==  d.data){
            cur.student.displayall();
            return;
        }
       
    }
    System.out.println("\nNot fount node!!");
  }
  void deleteNode(int data){
    if(head==null){
        System.out.println("Empty list Nothing to delete");
        return;
    }
    Node cur = head;
    if(head.student.data == data){
     
        while(cur.next!=head){
            cur = cur.next;

        }
        cur.next = head.next;
        head = cur;
        return;
    }
  
    while(cur.next!=head){
        
        if(cur.next.student.data==data){
          cur.next = cur.next.next;
          return;
        }
        cur = cur.next;
    }
  }
  void addAfter(int targetData, RecordData data){
    Node newNode = new Node(data);
    if(head==null){
        System.out.println("Empty list Nothing to delete!!");
        return;
    }
    if(head.student.data == targetData){
         newNode.next = head.next;
         head.next = newNode;
         return;

    }
    Node cur = head;
    while(cur.next!=head){
         cur = cur.next;
        if(cur.student.data ==targetData){
            newNode.next = cur.next;
            cur.next = newNode;
            return ;
        }
       
    }}
 void addBefore (int targetData, RecordData data){
    Node newNode = new Node(data);
    if(head==null){
        System.out.println("Empty list Nothing to delete!!");
        return;
    }
    Node cur = head;
    if(head.student.data == targetData){
        while(cur.next!= head){
          cur = cur.next;
        }
         newNode.next = head;
         head = newNode;
         cur.next = head;
         return;  
      
    }
    while(cur.next!=head){
        if(cur.next.student.data== targetData){
              newNode.next =cur.next;
              cur.next = newNode;
              return;

        }
        cur = cur.next;
    }

}
 void updateNode(RecordData d , int data){
   
    Node cur = head;
    if(cur.student.data == d.data){
       cur.student.data = data;
        return;
    }
    while(cur.next !=head){
       cur = cur.next;
        if(cur.student.data ==  d.data){
            cur.student.data= data;
            return;
        }
      
    }
    System.out.println("\nNot fount node!!");
  }

   void display() {

        // Check empty list
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node cur = head.next;
        System.out.print(head.student.data+"->");
        while(cur!=head){
            System.out.print(cur.student.data+"->");
            cur = cur.next;
        }
}
}

class main{
    public static void main(String arg[]){
    linkedlist list = new linkedlist();
     RecordData s1 = new RecordData(1);
     RecordData s2 = new RecordData(2);
     RecordData s3 = new RecordData(3);
     RecordData s4 = new RecordData(4);
     RecordData s5 = new RecordData(5);
     RecordData s6 = new RecordData(6);
     RecordData s7 = new RecordData(7);
     System.out.println("\nAdding at Back");
     list.addBack(s1);
      list.addBack(s2);
       list.addBack(s3);
        list.addBack(s4);
        list.addBack(s6);
         list.display();
         System.out.println("\nAdding at Front");
         list.addFront(s5);
          list.display();
        System.out.println("\nDeleting at Front");
         list.deleteFront();
          list.display();
       
         System.out.println("\nDeleting at Back");
         list.deleteBack();
          list.display();
          System.out.println("\nSearching ");
         list.searchNode(s2);
         // list.display();
       System.out.println("\nDeleting ");
         list.deleteNode(2);
         list.display();
       System.out.println("\nAdd After!!! ");
        list.addAfter(4, s7);
        list.display();
        System.out.println("\nAdd Before!!! ");

         list.addBefore (3,s6);
         list.display();
       
         System.out.println("\nUpdata Node !!! ");
      
        list.updateNode(s3,99);
  list.display();

    }
}