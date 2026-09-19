// liaqat ali
// cms-id: 053-25-0015
import java.util.*;
class Stack{
  char arr[];
  int capacity;
  int top;
  Stack(int capacity){
    this.capacity = capacity;
    arr = new char[capacity];
    top = -1;
  }
  void push(char data){
    if(isFull()){
      System.out.println("Stack full!!");
      return;
    }
    arr[++top] = data; 
  }
 char pop(){
if(isEmpty()){
  System.out.println("Empty");
return '\0';
}

return arr[top--];
}

char peek(){
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
   Scanner input = new Scanner(System.in);
   System.out.println("Enter String");
   String str = input.nextLine();
   Stack s = new Stack(str.length());
   for(int i = 0;i<str.length(); i++){
    s.push(str.charAt(i));
   }
 System.out.println("Input: "+ str );
   System.out.print("Reverse : ");
   while(!s.isEmpty()){
    System.out.print(s.pop());
   } 
    
  }
}