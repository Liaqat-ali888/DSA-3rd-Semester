//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)
class stack{
	int arr[]=new int[5];;
	int top;
	
	stack(){
	
		this.top =-1;

	}

void push(int data){
	if(top==4){
		System.out.println("full");
		return;
	}
	arr[++top]= data;
}
 int pop(){
 	if(top==-1){
 		System.out.println("stack empty");
 		return -1;
 	}
 	int data = arr[top];
 	top--;
 	return data;
 }
}
class queue{
	int arr[] = new int[5];
	int front ;
	int rear;
	int size; 
queue(){
	front =-1;
	rear = -1;
	size =0;
}
void enqueue(int data){
	if(size == arr.length){
		System.out.println("full");
		return;
	}
	if(front ==-1){
		front = 0;
	}
	rear++;
	arr[rear] = data;
	size ++;}
	    int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int data = arr[front];
        front++;
        size--;

        if (size == 0) {
            front = -1;
            rear = -1;
        }

        return data;
    }
    void display() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
class main{

	static void reverseQueue(queue q){

	 	stack s = new stack();
	 	while(q.size>0){
	 		s.push(q.dequeue());

	 	}
	 	while(s.top!=-1){
	 		q.enqueue(s.pop());
	 	}
	 }
	 public static void main(String arg[]){
	 	queue q = new queue();
	 	q.enqueue(1);
	 	q.enqueue(2);
	 	q.enqueue(3);
	 	q.enqueue(4);
	 	q.enqueue(5);
	 	q.enqueue(6);
	 	System.out.println("original queue");
	 	q.display();
	 	reverseQueue(q);
	 	System.out.println("reverse ");
	 	q.display();
	 }
}




