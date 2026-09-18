// liaqat ali
// cms-id: 053-25-0015
class Stack{
	int arr[];
	int capacity;
	int top;
	Stack(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		top = -1;
	}
	void push(int data){
		if(isFull()){
			System.out.println("Stack full!!");
			return;
		}
		arr[++top] = data; 
	}
 int pop(){
if(isEmpty()){
	System.out.println("Empty");
	return -1;
}


return arr[top--];
}
int peek(){
	return arr[top];
}
boolean isEmpty(){
	return top==-1;
}
boolean isFull(){
	return top==capacity-1;
}
void display(){
	if(isEmpty()){
		System.out.println("is empty");
		return;
	}
	for(int i = top; i>=0; i--){
		System.out.print(arr[i]);
		if(i!=0){
			System.out.print("->");
		}
	}
	System.out.println("\n");

	
}
}

class Main{
	public static void main(String arg[]){
		Stack s = new Stack(3);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(3);
		s.display();
		s.pop();
	   s.display();
		
	}
}
