class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        top = -1;
    }

    void push(int data) {
        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " pushed into stack.");
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return -1;
        }

        return arr[top--];
    }

    // Peek: Return top without removing
    int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }

        return arr[top];
    }

    // Check if empty
    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top == capacity - 1;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("Stack elements (Top to Bottom):");

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
 boolean search(int value) {
        boolean found = false;
        // int[] temp = new int[capacity];
        // int tempTop = -1;
        while (!isEmpty()) {
            int element = pop();

            if (element == value) {
                found = true;
            }

            // temp[++tempTop] = element;
        }
        // while (tempTop >= 0) {
        //     push(temp[tempTop--]);
        // }
        if(found){
            return true;
        }

        return false;
    }
}

class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        // stack.display();


        // System.out.println("Top element: " + stack.peek());

        // System.out.println("Popped element: " + stack.pop());

        // stack.display();

        // System.out.println("Is stack empty? " + stack.isEmpty());
        // System.out.println("Is stack full? " + stack.isFull());

        stack.push(40);
       

        stack.display();
       System.out.println( stack.search(30));
    }
}