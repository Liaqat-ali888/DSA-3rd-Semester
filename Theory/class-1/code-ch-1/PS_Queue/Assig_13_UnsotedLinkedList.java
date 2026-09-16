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
	 rear.next = newStu;
	 rear = newStu;


	 }
	 Student dequeue(){
	 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
	 	Student stu = front.student;
	 front = front.next;
	  return stu;
	 }
	 Student getMin(){
			 	if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
		Node cur = front;
		Student minGpa = front.student;
		double mingpa = front.student.studentCGPA;
		while(cur!=null){
			if(cur.student.studentCGPA<mingpa){
              minGpa = cur.student;
			}
			cur = cur.next;
		}
		return minGpa;
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
	      Node current = front;
        Node previous = null;

        Node maxNode = front;
        Node maxPrev = null;
        while (current != null) {

            if (current.student.studentCGPA > maxNode.student.studentCGPA) {
                maxNode = current;
                maxPrev = previous;
            }

            previous = current;
            current = current.next;
        }

        if (maxPrev == null)
            front = front.next;
        else
            maxPrev.next = maxNode.next;

        return maxNode.student;
}

Student extractMin(){
		 if(front== null){
	 		 throw new RuntimeException("Empty!!");
	 		
	 	}
	      Node current = front;
        Node previous = null;

        Node minNode = front;
        Node minPrev = null;
        while (current != null) {

            if (current.student.studentCGPA < minNode.student.studentCGPA) {
                minNode = current;
                minPrev = previous;
            }

            previous = current;
            current = current.next;
        }

        if (minPrev == null)
            front = front.next;
        else
            minPrev.next = minNode.next;

        return minNode.student;
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
		Student s3 = new Student(3,"musa",23,3.8,91);
		Student s4 = new Student(4,"mushu",28,3.4,79);
		Student s5 = new Student(5,"ali",22,4,89);
    queue.enqueue(s1);
    queue.enqueue(s2);
     queue.enqueue(s3);
    queue.enqueue(s5);
 

       queue.display();
      System.out.println("\n\n dequeue Student\n");
    Student deStu=queue.dequeue();
    deStu.displays();

     System.out.println("\n\n  Minimum cgpa\n");
     Student s_min = queue.getMin();
     s_min.displays();

 System.out.println("\n\n  Maximum cgpa\n");
     Student s = queue.getMax();
     s.displays();

      System.out.println("\n\n  Extract Maximum Cgpa\n");
     Student extractMaxStudent = queue.extractMax();
    extractMaxStudent.displays();

    System.out.println("\nStudents record in queue\n");
     queue.display();
  
      System.out.println("\n\n  Extract Minimum Cgpa\n");
     Student extractMinStudent = queue.extractMin();
    extractMinStudent.displays();
    System.out.println("\nStudents record in queue\n");
     queue.display();
    




  
   

}}