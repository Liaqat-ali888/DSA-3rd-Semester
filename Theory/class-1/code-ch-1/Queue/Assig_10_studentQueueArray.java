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

class StudentQueue{
	Student[] queue;
	int front;
	int rear;
	int count;
	int capacity;
	 StudentQueue(int capacity){
    this.capacity = capacity;
     queue = new Student[capacity];
     this.rear = 0;
     this.count = 0;
     this.front =0;
	 
	 }
	 void enqueue(Student student){
	 	if(isFull()){
	 		throw new RuntimeException("queue full");
	 	}
	 	queue[rear] = student;
	 	rear = (rear+1)% capacity;
	 	count++;
	 }
	 Student dequeue(){
	 	if(isEmpty()){
         throw new RuntimeException("Queue Empty");	 		
	 	}
	 	Student s = queue[front];
	 	queue[front]=null;
	 	front = (front+1)%capacity;
	 	count--;
	 	return s;
	 }

Student peek(){
	if(isEmpty()){

         throw new RuntimeException("Queue Empty");
     }
	Student peek ;
	peek = queue[front];
	return peek;
}
boolean isFull(){
	return count == capacity;

}
int size(){
	return count;
}


	 boolean isEmpty(){
	 	return count == 0;
	 }
	 int capacity(){
	 	return capacity;
	 }
	 void display(){
	 	
	 if(isEmpty()){
	 System.out.println("Queue  Empty");
	 return;
	 }
	 int index = front;
	 for(int i = 0 ; i<count; i++ ){
	 	queue[index].displays();
	 	index = (index + 1 )%capacity;
	 }

	 }

}
class main{
	public static void main(String arg[]){
		StudentQueue queue = new StudentQueue(5);
		Student s1 = new Student(1,"liaqat",18,2.3,99);
		Student s2 = new Student(2,"ibrahim",34,3.3,56);
		Student s3 = new Student(3,"musa",23,2.8,91);
		Student s4 = new Student(4,"mushu",28,3.4,79);
		Student s5 = new Student(5,"ali",22,3.3,89);
    queue.enqueue(s1);
    queue.enqueue(s2);
    queue.enqueue(s3);
    queue.enqueue(s4);
    queue.enqueue(s5);
    //queue.enqueue(s2);
    queue.dequeue();
     queue.dequeue();
     queue.enqueue(s2);

      queue.display();
      queue.capacity();
      queue.size();
       System.out.println("\nlist Empty: "+queue.isEmpty());
        System.out.println("\nsize of queue: "+queue.size());
        System.out.println("\ncapacity of queue: "+queue.capacity());
      Student sp = queue.peek();
      System.out.println("\nPeek Student");
     sp.displays();
}}