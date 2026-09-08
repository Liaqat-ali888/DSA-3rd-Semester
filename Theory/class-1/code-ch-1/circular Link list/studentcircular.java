// Name: Liaqat Ali
// CMS-Id: 053-25-0015
// Section: SE (A)


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
    Node tail;

    Node(Student student){
        this.student = student;
        this.next = null;
        this.tail = null;
    }
}
class Studentlinklist{
    Node head;
    Node tail;
    // Node tail;
    Studentlinklist(){
        head = null;
        tail = null;
    }
    void addstudentFront(Student student){
        Node newNode = new Node(student);
        if(head==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;
        }
        
            newNode.next = head;
            head = newNode;
            tail.next = head;
        

    }
    void addstudentBack(Student student){

        Node newNode = new Node(student);
        if(head==null){
            head = newNode;
            tail = newNode;
            tail.next = head;
            return;

        }
        newNode.next =head;
        tail.next = newNode;
        tail=newNode;

    }
    void deleteStudentFront(){
        if(head == tail){
            head = null;
            tail=null;
            return;
        }
        if(head == null){
            head = null;
            tail=null;
            System.out.println("empty file");
            return;
        }
        head = head.next;
        tail.next = head;
        System.out.println("Delete Front successfull!!!");
        System.out.println("_______________________");
    }

    void deleteStudentBack(){

        if(head == null){
            System.out.println("empty file");
            return;
        }
          if(head == tail){
            head = null;
            tail=null;
            return;
        }
        Node current = head;
        while(current.next!=tail){
            current = current.next;
        }
        current.next = head;
        tail = current;
        tail.next = head;
        System.out.println("Delete  Back  successfull!!!");
        System.out.println("_______________________");
   

    }

    void seachStudent(int id){
        if(head ==null){
            System.out.println("list empty");
            return;
        }
        if(head.student.studentId == id){
            head.student.displayStudent();
            return;
        }
        Node newNode = head;
        boolean search =false;
        while(newNode!=null){

            if(newNode.student.studentId==id){
                search = true;
                System.out.println(   "ID:"+newNode.student.studentId +
                        "\nname: "+ newNode.student.name +
                        "\ndepartment: "+newNode.student.department +
                        "\ncgpa: "+ newNode.student.cgpa
                );
                return;

            }

            newNode = newNode.next;
        }
        if(!search){
            System.out.println("ID: "+id+" not found");
        }

    }

    void deleteStudent(int id)
    {
        if(head == null){
            System.out.println("list empty");
            return;
        }
         if(head.student.studentId==id){
            deleteStudentFront();
        }
        if(tail.student.studentId==id){
            deleteStudentBack();
            return;
        }
        
            Node current = head;
            while(current.next!=head){
                if(current.next.student.studentId == id){

                    current.next = current.next.next;
                    return;
                }
                current =current.next;
        }
       System.out.println("Delete  successfull!!!");
        System.out.println("_______________________");
   
    }
    void addStudentAfter(int id,Student s){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(id==tail.student.studentId){
            addstudentBack(s);
            return;

        }
        Node newNode = new Node(s);
        if(head.student.studentId == id){
          newNode.next = head.next;
          head.next = newNode;
          return;
        }

      
        Node current = head;
        while(current.next!=head){
            if(current.student.studentId==id){
                newNode.next=current.next;
                current.next= newNode;
                return;

            }
            current = current.next;
        }
        System.out.println("ID: "+id+"ID Not fount");


    }
    void addStudentBefore(int id,Student s){

        if(head == null){
            System.out.println("List Empty");
            return;
        }
        if(head.student.studentId==id){
            addstudentFront(s);
            return;
        }
        // if(id == tail.student.studentId){
        //     addstudentBack(s);
        //     return;
        // }
        Node current = head;

        Node newNode = new Node(s);
        while(current.next!=head){
            if(current.next.student.studentId==id){
                newNode.next=current.next;
                current.next=newNode;
                return;

            }
            current = current.next;
        }
        System.out.println("ID: "+id +"not found");
    }
    void update(int id, String name, String department,String semester, double cgpa){
        if(head == null){
            System.out.println("list empty");
            return;
        }
        if(head.student.studentId==id){
            head.student.name = name;
            head.student.department = department;
            head.student.semester = semester;
            head.student.cgpa = cgpa;
            System.out.println("updated student record");
            return;
        }
            if(tail.student.studentId==id){
            tail.student.name = name;
            tail.student.department = department;
            tail.student.semester = semester;
            tail.student.cgpa = cgpa;
            System.out.println("updated student record");
            return;
        }

        Node newNode = head;
        while(newNode!=tail){
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
        System.out.println("SID " + id + " not found");
    }

    void displayStudents(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head.student.displayStudent();
        System.out.println("_______________________");
        Node current = head.next;
        while(current!=head){
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
        Student s2 = new Student(2,"musa","media","2rd",3.9);
        Student s3 = new Student(3,"ayaz","ac","2rd",3.2);
        Student s4 = new Student(4,"mushu","se","2rd",3.2);
        Student s5 = new Student(5," karim","bba","2rd",3.9);
        Student s6 = new Student(6,"krmt","se","2rd",3.2);
        list.addstudentFront(s4);
        list.addstudentFront(s3);
        list.addstudentFront(s2);
        list.addstudentFront(s1);
        list.addstudentBack(s5);
        //list.addStudentBefore(2,s3);

        list.displayStudents();

        System.out.println("delete at front");
        list.deleteStudentFront();
        list.displayStudents();

       System.out.println("delete at end");
       list.deleteStudentBack();
       list.displayStudents();

       // System.out.println("search by id");
       // list.seachStudent(3);
      
       System.out.println("\nDelete by id\n");
       list.deleteStudent(2);
        list.displayStudents();
        System.out.println("Adding  After!! ");
       list.addStudentAfter(3,s6);
       list.displayStudents();
      
        
        System.out.println("Adding Before!! ");
        list.addStudentBefore(6,s1);
        list.displayStudents();

        
        System.out.println("\n\nupdate ");
        list.update(6,"musa","health","3rd",4);
        list.displayStudents();



    }
}
