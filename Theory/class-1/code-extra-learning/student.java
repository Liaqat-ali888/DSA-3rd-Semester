class Student{
    int sId;
    String name;
    String department;
    double cgpa;
    Student (int sId , String name, String department, double cgpa){
        this.sId =sId;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;

    }
    void displayStudent(){
        System.out.println(   "ID:"+sId +
                "\nname: "+ name +
                "\ndepartment: "+department +
                "\ncgpa: "+ cgpa
        );
    }
}
class Node{
    Student student;
    Node next;
    Node(Student student){
        this.student = student;
        this.next = null;
    }
}
class Studentlinklist{
    Node head;
    // Node tail;
    Studentlinklist(){
        head = null;
    }
    void addstudentFront(Student student){
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;

    }
    void addstudentEnd(Student student){   
        Node newNode = new Node(student);
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = newNode;


    }
    void deleteStudentFront(){
     if(head == null){
     	System.out.println("empty file");
     	return;
     }
     head = head.next;
    }

    void deleteStudentEnd(){
    	Node current = head;
    	while(current.next.next!=null){
             current = current.next;

    	}
    	current.next = null;
 
    }
    void deleteAT(Student s)
{
	Node current = head;
	while(current.next!=null){
		if(current.next.student == s){
			current.next = current.next.next;
			return;
		}
	}
	current = current.next;

}  
    void seachStudentId(int id){
    	if(head ==null){
    		System.out.println("list empty");
    		return;
    	}
    	Node newNode = head;

    	while(newNode!=null){
    		if(newNode.student.sId==id){
    			 System.out.println(   "ID:"+newNode.student.sId +
                "\nname: "+ newNode.student.name +
                "\ndepartment: "+newNode.student.department +
                "\ncgpa: "+ newNode.student.cgpa
        );
    			return;

    		}
    		
    		newNode = newNode.next;
    	}

    }

    void update(Student s1 ,Student s){
    	if(head == null){
    		System.out.println("list empty");
    		return;
    	}

    	Node newNode = head;
    	while(newNode!=null){
    		if(newNode.student==s1){
    			newNode.student=s;
    			return;
    		}
    		newNode  = newNode.next;
    	}
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
class mainClassStudent{
    public static void main(String[] arg){
        Studentlinklist list = new Studentlinklist();
        Student s1 = new Student(1,"liaqt","se",2.2);
        Student s2 = new Student(2,"anis","media",3.9);
        Student s3 = new Student(3,"ali","se",3.2);
        Student s4 = new Student(4,"mushu","se",3.2);
        Student s5 = new Student(5,"krmt","se",3.2);
        list.addstudentFront(s1);
        list.displayStudents();


        //System.out.println("add end");
        list.addstudentEnd(s2);
        list.addstudentEnd(s3);
        list.addstudentEnd(s4);

        list.displayStudents();

        // System.out.println("delete at front");
        // list.deleteStudentFront();
        // list.displayStudents();

        // System.out.println("delete at end");
        // list.deleteStudentEnd();
        // list.displayStudents();

        // System.out.println("delete at any student");
        // list.deleteAT(s2);
        // list.displayStudents();

        // System.out.println("search by id");
        // list.seachStudentId(1);
        // list.seachStudentId(4);

        System.out.println("\n\nupdate ");
        list.update(s1,s4);
        list.displayStudents();





    }
}
