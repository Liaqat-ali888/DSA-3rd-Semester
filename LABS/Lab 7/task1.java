//liaqat ali
//cms-id: 053-25-0015
// dept: SE(A)

class Queue{
  int[] arr = new int[10];
  int front;
  int rear;
  int size;
  Queue(){
    this.front = -1;
    this.rear = -1;
    this.size = 0;
  }
  void enqueue(int data){
    if(isFull()){
      System.out.println("Is full!!!");
      return;
    }
    if(front == -1){
    front = 0;
    }
    arr[++rear] = data;
    size++;
  }
  int dequeue(){
    if(isEmpty()){
      System.out.println("is empty");
      return -1;
    }
    int data = arr[front];
    front++;
    size--;
    return data;
  }
  int peek(){
    if(isEmpty()){
      System.out.println("is empty");
      return -1;
    }
    if(front == rear){
      front=-1;
      rear = -1;
      return -1;
    }
    return arr[front];
  }
  boolean isEmpty(){
    return size==0;
  }
  boolean isFull(){
    return size == arr.length;
  }
void display(){
for(int i=front ; i<rear; i++){
  System.out.println(arr[i]+" ");
}
}

}

class main {
  public static void main(String arg[]){
    Queue arr = new Queue();
    arr.enqueue(1);
    arr.enqueue(2);
      arr.enqueue(3);
    arr.enqueue(4);
      arr.enqueue(5);
    arr.enqueue(6);
    System.out.println("dequeue: "+arr.dequeue());
    System.out.println("Peek: "+arr.peek());
    System.out.println("history: ");
    arr.display();
  }

}