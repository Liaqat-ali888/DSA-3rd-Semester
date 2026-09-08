// // Name: Liaqat Ali
// // CMS-Id: 053-25-0015
// // Section: SE (A)


class Student{
    int studentId;
    String name;
    String department;
    String semester;
    double cgpa;
    Student (int sId , String name, String department,String semester, double cgpa){
        this.studentId =sId;
        this.name = name;
        this.department = department;
        this.semester = semester;
        this.cgpa = cgpa;

    }
    void displayStudent(){
        System.out.println(   "ID:"+studentId +
                "\nname: "+ name +
                "\ndepartment: "+department +
                "\nSemester: "+semester+
                "\ncgpa: "+ cgpa
        );
    }
}
class Node{
    Student student;
    Node next;
    Node prev;

    Node(Student student){
        this.student = student;
        this.next = null;
      
    }
}
class Studentlinklist{
    Node head;
    Node tail;
    Node prev;
    Studentlinklist(){
        head = null;
        prev = null;
    }
    void addstudentFront(Student student){
        Node newNode = new Node(student);
        if(head == null){
            head = newNode;
            tail = newNode;
           tail.prev=head;
            head.prev = null;
            head.next = null;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;

    }
    void addstudentBack(Student student){

     Node newNode = new Node(student);
     if(head == null){
            head = newNode;
            tail = newNode;
            tail.prev=head;
            head.prev = null;
            head.next = null;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    
    }
    void deleteStudentFront(){
        if(head == null){
        System.out.println("Empty lsit!!");
        return;
    }

    head.prev = null;
    head = head.next;

   
  }

    void deleteStudentBack(){
    
      if(head == null){
        System.out.println("Empty lsit!!");
        return;
    }
    if(tail.prev == head){
        head=null;
        tail=null;
        return;

    }
     tail = tail.prev;
     tail.next =null;

   
  }

    void seachStudentid(int id){
        Node cur = head;
    if(head.student.studentId == id){
        head.student.displayStudent();
        return;
    }
    while(cur.next!=null){
       cur = cur.next;
        if(cur.student.studentId == id){
            cur.student.displayStudent();
            return;
        }
       
    }
    System.out.println("\nNot fount node!!");
  }

    void deleteStudent(int id)
    {
        if(head == null){
            System.out.println("list empty");
        }
        else if(head.student.studentId==id){
            deleteStudentFront();
        }
        else if(tail.student.studentId==id){
            deleteStudentBack();
            return;
        }
        else{
            Node current = head;
            while(current!=tail){
                if(current.student.studentId == id){
                    current.prev.next = current.next;
                    current.next.prev = current.prev.next;
                    return;
                }
                current =current.next;
            }

         }
     }


    void addStudentAfter(int id,Student s){
      Node newNode = new Node(s);
    if(head==null){
        System.out.println("Empty list Nothing to delete!!");
        return;
    }
      if(head.student.studentId == id){
         newNode.next = head.next;
         head.next.prev = newNode;
         head.next = newNode;
         newNode.prev = head;
         return;

    }
    if(tail.student.studentId == id){
         addstudentBack(s);
         return;

    }
    Node current = head;
    while(current!=tail){
     
        if(current.student.studentId ==id){
          newNode.next = current.next;
          current.next.prev = newNode;
          newNode.prev =  current;
          current.next = newNode;
            return ;
        }
        current = current.next;
       
       
    }}
    void addStudentBefore(int id,Student s){

     Node newNode = new Node(s);
    if(head==null){
        System.out.println("Empty list Nothing to delete!!");
        return;
    }
    Node cur = head;
    if(head.student.studentId == id){
       addstudentFront(s);
         return;    
    }
    while(cur!=null){
        if(cur.student.studentId== id){
            newNode.next = cur;
            cur.prev.next = newNode;
            newNode.prev = cur.prev;
            cur.prev = newNode;
              return;

        }
        cur = cur.next;
    }

}
    void update(int id, String name, String department,String semester, double cgpa){
        if(head == null){
            System.out.println("list empty");
            return;
        }

        Node newNode = head;
        while(newNode!=tail.next){
            if(newNode.student.studentId==id){
                newNode.student.name = name;
                newNode.student.department = department;
                newNode.student.semester = semester;
                newNode.student.cgpa = cgpa;
                System.out.println("updated student record");
                return;

            }
            newNode  = newNode.next;
        }
        System.out.println("SID  " + id + " not found");
    }

    void displayStudents(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node current = head;
        while(current!=null){
            current.student.displayStudent();
            System.out.println("_______________________");
            current = current.next;


        }


    }


}
class main{
    public static void main(String[] arg){
        Studentlinklist list = new Studentlinklist();
        Student s1 = new Student(1,"liaqt","se","2rd",2.2);
        Student s2 = new Student(2,"anis","media","2rd",3.9);
        Student s3 = new Student(3,"ayaz","ac","2rd",3.2);
        Student s4 = new Student(4,"mushu","se","2rd",3.2);
        Student s5 = new Student(5,"karim","bba","2rd",3.9);
        Student s6 = new Student(6,"krmt","se","2rd",3.2);
       list.addstudentFront(s3);
        list.addstudentFront(s2);
        list.addstudentFront(s1);
       
       list.addstudentBack(s4);
      list.addStudentBefore(2,s6);

        list.displayStudents();

         System.out.println("delete at front");
        list.deleteStudentFront();
        list.displayStudents();
         
       System.out.println("delete at end");
       list.deleteStudentBack();
       list.displayStudents();

       

       System.out.println("search by id");
       list.seachStudentid(4);
        System.out.println("Delete By id");
        list.deleteStudent(1);
        list.displayStudents();

       list.addStudentAfter(2,s6);
       list.displayStudents();
       
       System.out.println("Add Before");
        list.addStudentBefore(1,s6);
        list.displayStudents();

// //          System.out.println("delete at any student");
// //          list.deleteStudent(4);
// //          list.displayStudents();



        System.out.println("\n\nupdate ");
        list.update(5,"musa","health","3rd",4);
        list.displayStudents();



    }
}
