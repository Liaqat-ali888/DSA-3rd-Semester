class Node {
	int data ;
	Node next;
	Node(int data){
		this.data =  data;
		this.next = null;
	}
}
class Queue{
	Node front;
	Node rear;
	Queue(){
	front = null;
	rear = null;
	}
	void enqueue(int data){
	  Node newNode = new Node(data);
	  if(front == null){
	  	front = newNode ;
	  	rear = newNode;
	  	return;
	  }	
	  rear.next =  newNode;
	  rear = newNode;
	}
	void dequeue(){
		if(front== null){
			System.out.print("Empty");
			return;
		}
		System.out.println("removed: "+front.data);
		front = front.next;
		if(front == null){
			rear = null;
		}
	}
		void peek(){
			if(front==null){
			System.out.println("empty");
			return;
		}
		System.out.println("Front element: "+front.data);
	}

boolean isEmpty(){
	return front == null;
}
void display(){
	if(front ==null){
		System.out.println("empty");
		return;
	}
	Node current = front;
	while(current!= null){
		System.out.print(current.data +"->");
		current = current.next;
	}
	System.out.println("null");
}    
}
class main{
	public static void main(String argh[]){
	Queue q = new Queue();
	q.enqueue(10);
	q.enqueue(20);
	q.enqueue(30);
	q.enqueue(40);
	q.enqueue(50);
	q.enqueue(60);
	q.display();
	q.peek();
	q.dequeue();
}

}


