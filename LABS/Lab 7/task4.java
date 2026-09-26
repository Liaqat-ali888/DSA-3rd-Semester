//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)
class circularQueue{
	int arr[];
	int front;
	int rear;
	int size;
	int capacity;
	circularQueue(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size =0;

	}	

void enqueue(int data){
	if(isFull()){
		System.out.println("full");
		return;
	}
	if(front ==-1){
		front =0;
	}
	rear =(rear +1)%capacity;
	arr[rear] = data;
	size++;

}
int dequeue(){

	int data =arr[front];
	front = (front +1)%capacity;
	size--;
	if(isEmpty()){
		front = rear = -1;
	}
    
     return data;
}
int peek(){
	if(isEmpty()){
		System.out.println("emtpy");
		return -1;
	}
	return arr[front];
}
boolean isEmpty(){
	return size==0;
}
boolean isFull(){
	return size == capacity;
}
void display(){
	if(isEmpty()){
		System.out.println("emtpy");
		return;
	}
	int index = front;
	for (int i =0;i<size ; i++){
		System.out.print(arr[index]+" ");
		index = (index+1)%capacity;

	}
	System.out.println();

}
}
class main{
	public static void main(String arg[]){
		circularQueue q = new circularQueue(5);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(5);
		 System.out.println(q.dequeue());
		 	 System.out.println(q.dequeue());
		 System.out.println("display:");
		 q.display();
		 q.enqueue(4);
		q.enqueue(5);
			 System.out.println("display:");
		 q.display();



	}
}