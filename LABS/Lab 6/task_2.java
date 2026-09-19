// liaqat ali
// 053-25-0015
class Node{
	int data;
	Node next;
	Node (int data){
		this.data = data;
		this.next = null; 	
	}
}
class Stack{	
Node top;
     Stack(){
     	this.top = null;
     }
     void push(int data){
     	Node newData = new Node(data);
     	newData.next = top;
     	top = newData;

     }
     int pop(){
     	if(isEmpty()){
     		System.out.println("Empty");
     		return -1;
     	}
     	int data = top.data;
     	top = top.next;

       return data;
     }
 int peek(){
 	return top.data;
 }
 boolean isEmpty(){
 	return top == null;
 }
 void display(){
Node cur = top;
while(cur!=null){
	System.out.println(cur.data);
	cur = cur.next;

} 
 }

}
class main{
	public static void main(String ar[]){
    Stack list = new Stack();
    list.push(1);
     list.push(2);
      list.push(3);
       list.push(4);
        list.push(5);
        list.display();
        System.out.println(list.pop() +"  Removed!!");
        System.out.println("Peek:  "+list.peek());
        list.display();
	}
}