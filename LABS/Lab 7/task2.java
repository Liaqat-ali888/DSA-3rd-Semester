//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)
class Node{
	int data;
	Node next;
	Node (int data){
		this.data = data;
		this.next =null;
	}
}
class Queue{
	Node front ;
	Node rear;
	Queue(){
		this.front = null;
		this.rear = null;
	}
void enqueue(int data){
		Node newdata = new Node(data);
		if(isEmpty()){
			 front = newdata;
			 rear = newdata;
		
			 return;
		}
		rear.next = newdata;
		rear = newdata;
	}
int dequeue(){
	if(isEmpty()){
		System.out.println("is empty");
		return -1;
	}
	int data = front.data;
	front = front.next;
	return data;
}
int peek(){
	return front.data;
}
boolean isEmpty(){
return front==null;
}
void display(){
	if(isEmpty()){
		System.out.print("is empty");
		return;
	}
	Node cur= front;
	while(cur!=null){
		System.out.println(cur.data+" ");
		cur = cur.next;
	}
}
}
class main {
	public static void main(String arg[]){
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
 q.display();
		System.out.println("Dequeue: "+q.dequeue());
		
		System.out.println("Dequeue: "+q.dequeue());
   System.out.println("Peek: "+q.peek());
		System.out.println("\ndisplay: ");

		 q.display();
	}
}