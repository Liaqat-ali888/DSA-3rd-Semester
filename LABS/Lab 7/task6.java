//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)

class Queue{
String arr[];
int front ;
int rear;
int capacity;
int size;
Queue(int capacity){
this.capacity = capacity;
arr = new String[capacity];
this.front =-1;
this.rear = -1;
this.size =0;
}
void addProcess(String processName){
	if(front==-1){
		front =0;
	}
	rear = (rear+1)%capacity;
	arr[rear]= processName;
	size++;

}
String executeProcess(){
	if(isEmpty()){
		System.out.println("is empty");
		return null;
	}
	String process = arr[front];
	front = (front+1)%capacity;
	size--;
	if(size ==0){
		front =-1;
		rear =-1;

	}
	return process;

}
void displayProcess(){
	if(isEmpty()){
		System.out.println("is empty");
		return;
	}
	int index = front;
	for(int i = front; i<=size;i++){
		System.out.print(arr[i]);
		if(i!= size){
			System.out.print("->");
		}
	}
}
boolean isEmpty(){
	return size ==0;
}

}
class main{
	public static void main(String arg[]){
		Queue q = new Queue(5);
		q.addProcess("P1");
		q.addProcess("P2");
		q.addProcess("P3");
		q.addProcess("P4");
System.out.println("\n before execution:");
		q.displayProcess();
		q.executeProcess();
		System.out.println("\nafter execution; ");
		q.displayProcess();
		
	}
}