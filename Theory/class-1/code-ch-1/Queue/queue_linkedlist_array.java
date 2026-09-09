class Queue {
    int[] arr;
    int front;
    int rear;
    Queue(int size) {
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int data) {
        if (rear == arr.length - 1) {
            System.out.println("full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = data;
    }
    int dequeue() {
       if (front == -1 || front > rear) {
            System.out.println("empty");
            return -1;
        }
        int value = arr[front];
        front++;
        return value;
    }
    int peek() {

        if (front == -1 || front > rear) {
            System.out.println("empty");
            return -1;
        }

        return arr[front];
    }

    boolean isEmpty() {
        return front == -1 || front > rear;
    }

    void display() {

        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
System.out.println();
    }
}
class main {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.display();
      System.out.println("Removed: " + q.dequeue());
        System.out.println("Front: " + q.peek());
    q.display();
    }
}