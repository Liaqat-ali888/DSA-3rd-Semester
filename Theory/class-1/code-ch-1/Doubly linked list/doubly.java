// Name: Liaqat Ali
// CMS-Id: 053-25-0015
// Section: SE (A)

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
    Node prev;
   
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
        head.next = null;
        head.prev = null;
       return;
  }
  Node cur = head;
  while(cur.next!=null)
{
    cur = cur.next;
}    
cur.next =newdata;
newdata.prev = cur;
  

 }

  void addFront(RecordData s){
    Node newNode = new Node(s);
   if(head ==null){
    head = newNode;
     head.next = null;
     head.prev = null;
      return;
   }
   newNode.next = head;
    head.prev = newNode;
    head = newNode;

  }

  void deleteFront(){
    if(head == null){
        System.out.println("Empty lsit!!");
        return;
    }
    head = head.next;
    head.prev = null;
  }
  void deleteBack(){
     if(head == null){
        System.out.println("Empty lsit!!");
        return;
    }
    Node cur = head;
    while(cur.next.next!=null){
        cur = cur.next;
    }
    cur.next = null;
   
  }
  void searchNode(RecordData d){
   
    Node cur = head;
    if(head.student.data == d.data){
        head.student.displayall();
        return;
    }
    while(cur.next!=null){
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
  
    if(head.student.data == data){
     
        head = head.next;
        head.prev =null;
        return;
        }
          Node cur = head;
          while(cur!=null){
            if(cur.student.data ==data){
               cur.prev.next = cur.prev;
               cur.prev.next = cur.next;
                return;
                 }
            cur= cur.next;
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
         head.next.prev = newNode;
         head.next = newNode;
         return;

    }
    Node cur = head;
    while(cur!=null){
          cur = cur.next;
          if(cur.next ==null){
            addBack(data);
            return;
          }
        if(cur.student.data ==targetData){
            newNode.next = cur.next;
            cur.next.prev = newNode;
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
        addFront(data);
         return;    
    }
    while(cur!=null){
        if(cur.student.data== targetData){
              newNode.next = cur;
              cur.prev.next= newNode;
              newNode.prev= cur.prev;
              cur.prev= newNode;
              return;

        }
        cur = cur.next;
    }

}
  void updateNode(RecordData d , int data){ 
    Node cur = head;
    if(head.student.data == d.data){
       head.student.data = data;
        return;
    }
    boolean found = false;
    while(cur!=null){
        found =false ;
    
        if(cur.student.data ==  d.data){
            found = true;
            cur.student.data= data;
            return;
        }
           cur = cur.next;
      
    }
    if(!found){
    System.out.println("\nNot fount node!!");
  }}

   void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

         Node cur = head;
        while(cur.next!=null){
            System.out.print(cur.student.data+"->");
            cur = cur.next;
        }
 System.out.print(cur.student.data+"->");

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
         list.searchNode(s4);
         list.display();
       System.out.println("\nDeleting ");
         list.deleteNode(5);
         list.display();

       System.out.println("\nAdd After!!! ");
        list.addAfter(4, s7);
        list.display();
        System.out.println("\nAdd Before!!! ");
         list.addBefore (3,s7);
         list.display();
       
    System.out.println("\nUpdata Node !!! ");
    list.updateNode(s5,99);
    list.display();

    }
}