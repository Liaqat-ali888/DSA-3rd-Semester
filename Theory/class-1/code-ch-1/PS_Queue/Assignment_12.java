// Liaqat Ali
//dept: SE(A)
// CMS-ID: 053-25-015

class Student{
	int studentId;
	String studentName;
	int studentAge;
	double studentCGPA;
	double studentInterPercentage;
	Student(int studentId, String studentName, int studentAge,double studentCGPA,double studentInterPercentage){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentCGPA = studentCGPA;
		this.studentInterPercentage = studentInterPercentage;

	}
	void displays(){
       System.out.println("student Id: "+ studentId +
                          "  student Name: "+ studentName+
                          "  student Age: "+ studentAge+
                          "  student CGPA: "+studentCGPA+
                          "  student Inter Percentage: "+studentInterPercentage);
	}
}
class Node{
	Student student;
	Node next;
	Node (Student student){
		this.student = student;
		this.next = null;

	}
}

class StudentQueue{
	Node rear;
	Node front;
	StudentQueue (){
		this.rear = null;
		this.front = null;
	}
	 
	 void enqueue(Student student){
	 	Node newStu = new Node(student);
	 if(rear== null){
	 	front = newStu;
	 	rear = newStu;
	 	return;
	 }	
	 if(front.student.studentCGPA>newStu.student.studentCGPA){
	 	newStu.next = front;
	 	front = newStu;
	 	return;
	 }
	 if(rear.student.studentCGPA<newStu.student.studentCGPA){
	 	rear.next = newStu;
	 	rear = newStu;
	 	return;
	 }
	 Node cur = front;
	 while(cur.next!=null){
         if(cur.next.student.studentCGPA>newStu.student.studentCGPA){
         	newStu.next = cur.next;
         	cur.next = newStu;
         	return;
         }
         cur = cur.next;
	 }


	 }
	 Student dequeue(){
	 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
	 	Student stu = front.student;
	 front = front.next;
	  return stu;
	 }
	
	Student getMax(){
			 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
		Node cur = front;
		Student maxGpa = front.student;
		double maxgpa = front.student.studentCGPA;
		while(cur!=null){
			if(cur.student.studentCGPA>maxgpa){
              maxGpa = cur.student;
			}
			cur = cur.next;
		}
		return maxGpa;
}
Student extractMax(){
		 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
	Node cur = front;
	Student exmax;
	while(cur.next.next!=null){
		cur = cur.next;
	}
	exmax = cur.next.student;
    cur.next = null;
    rear = cur;
    return exmax;
}

Student extractMin(){
		 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
	Student exmin;
	exmin = front.student;
	front = front.next;
    return exmin;
}



 void display(){
   Node cur = front;
 	 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
   while(cur!=null){
   	cur.student.displays();
   	cur = cur.next;
   }	

	 }

}	 

class main{
	public static void main(String arg[]){
		StudentQueue queue = new StudentQueue();
		Student s1 = new Student(1,"liaqat",18,3.2,99);
		Student s2 = new Student(2,"ibrahim",34,3.3,56);
		Student s3 = new Student(3,"musa",23,2.8,91);
		Student s4 = new Student(4,"mushu",28,3.4,79);
		Student s5 = new Student(5,"ali",22,4,89);
    queue.enqueue(s1);
    queue.enqueue(s2);
     queue.enqueue(s3);
    queue.enqueue(s5);
 

      queue.display();
      System.out.println("\n\n after dequeue");
    Student deStu=queue.dequeue();
    deStu.displays();
    

      queue.enqueue(s5);
    System.out.println("\n\n after equeue");
     queue.display();

 System.out.println("\n\n  Maximum cgpa");
     Student s = queue.getMax();
     s.displays();

      System.out.println("\n\n  Extract Maximum Cgpa");
     Student extractMaxStudent = queue.extractMax();
    extractMaxStudent.displays();

    System.out.println("\nStudents record in queue");
     queue.display();

      System.out.println("\n\n  Extract Minimum Cgpa");
     Student extractMinStudent = queue.extractMin();
    extractMinStudent.displays();
    System.out.println("\nStudents record in queue");
     queue.display();
    




  
   

}}