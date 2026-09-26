//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)
class Stack{
	int arr[] = new int[5];
	int top;
	int size;
	Stack(){
		this.top = -1;
	}
	void push(int data){
		if(isFull()){
			System.out.println("is empty");
			return;
		}
		arr[++top] = data;
		size++;
	}
	int pop(){
		if(isEmpty()){
			System.out.println("is empty");
			return -1;

		}
		int data = arr[top];
		top--;
		size--;
		return data;
	}
	boolean isFull(){
		return size==5;
	}
	boolean isEmpty(){
		return top==-1;
	}

}
class QueueUsingStacks{
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	void enqueue(int data){
		s1.push(data);

	}
	int dequeue(){
		if(s1.isEmpty() && s2.isEmpty()){
			System.out.println("emtpy");
			return -1;
		}
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}

	boolean isEmpty(){
		return s1.isEmpty() && s2.isEmpty();
	}
	int peek(){
 
 if(s1.isEmpty() && s2.isEmpty()){
 	System.out.println("emptoy");
 	return -1;
 }
 return s2.arr[s2.top];
	}

}
class main{
	public static void main(String arg[]){
		QueueUsingStacks q = new QueueUsingStacks();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		System.out.println("Dequeue: "+q.dequeue());
		System.out.println("Peek: " + q.peek());
	}
}