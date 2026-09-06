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
Node tail;
    linkedlist(){
        this.head = null;
        this.tail = null;
     
    }
 void addBack(RecordData s){
    Node newdata = new Node(s);
    if(head == null){
        head = newdata;
        tail = newdata;
       // tail.next = head;
        return;
    }
    newdata.next = head;
    tail.next = newdata;
     tail = newdata;
 }

  void addFront(RecordData s){
    Node newNode = new Node(s);
   if(head ==null){
    head = newNode;
    tail = newNode;
    return;
   }
    newNode.next = head;
    head = newNode;
    tail.next = newNode;


  }

  void deleteFront(){
   if(head == null){
    System.out.println("list empty nothing to delete");
    return;
   }
   if(head == tail){
    head = null;
    tail=null;
    return;
   }
   head = head.next;
   tail.next = head;

  }
  void deleteBack(){
   if(head == null){
    System.out.println("list empty nothing to delete");
    return;
   }
   if(head==tail){
    head = null;
    tail = null;
    return;
   }
   Node cur = head;
   while(cur.next!=tail){
        cur = cur.next;
   }
   cur.next = head;
   tail = cur;
  }


  void searchNode(RecordData d){
    Node cur = head;
    if(head.student.data == d.data){
        head.student.displayall();
        return;
    }
    if(tail.student.data==d.data){
        tail.student.displayall();
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
     head = head.next;
     tail.next = head;
     return;
    }
       if(tail.student.data == data){
        while(cur.next!=tail){
            cur = cur.next;
        }
        cur.next = head;
        tail = cur;
        return;
       }

       while(cur.next!=head){
       
        if(cur.next.student.data == data){
            cur.next = cur.next.next;
            return;
        }
         cur = cur.next;
        
       }
        System.out.println(data+" Not found!");
   
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

    if(tail.student.data == targetData){
        addBack(data);
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
       
    }
 System.out.println(targetData +" Not found");
}
 void addBefore (int targetData, RecordData data){
    Node newNode = new Node(data);
    if(head==null){
        System.out.println("Empty list Nothing to delete!!");
        return;
    }
    Node cur = head;
    if(head.student.data == targetData){
         addFront(data);
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
   System.out.println(targetData +" Not found");
}
 void updateNode(RecordData d , int data){
    if(head.student.data == d.data){
       head.student.data = data;
        return;
    }
     if(tail.student.data == d.data){
       tail.student.data = data;
        return;
    }
    Node cur = head;
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
         System.out.print("head");
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
          list.addFront(s6);
          list.display();
        System.out.println("\nDeleting at Front");
         list.deleteFront();
          list.display();
         System.out.println("\nDeleting at Back");
         list.deleteBack();
          list.display();
          System.out.println("\nSearching ");
         list.searchNode(s5);
  //        // list.display();
       System.out.println("\nDeleting ");
         list.deleteNode(3);
         list.display();
       System.out.println("\nAdd After!!! ");
        list.addAfter(1, s7);
        list.display();
        System.out.println("\nAdd Before!!! ");
         list.addBefore (4,s6);
         list.display();
       
         System.out.println("\nUpdata Node !!! ");
        list.updateNode(s7,99);
          list.display();

    }
}