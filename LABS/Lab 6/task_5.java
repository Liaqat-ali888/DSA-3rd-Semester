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
boolean balance(String expression){
  for(int i = 0 ;i<expression.length(); i++){
    char ch = expression.charAt(i);

    if(ch == '(' || ch== '{' || ch=='['){
      push(ch);
    }
   else if(ch==')' || ch == '}' || ch== ']'){
    if(isEmpty()){
      return false;
    }
    char open = pop();
    if(ch == ')' && open !='('){
      return false;
    }
    if(ch == '}' && open !='{' ){
      return false;
    }
    if(ch == ']' && open != '['){
      return false;

    }
   }
 
  }
  return isEmpty();


}
}

class Main{
  public static void main(String arg[]){
    String str1 = "[{()}]";
    Stack s1 = new Stack(str1.length());

    System.out.println("Input: "+str1);
    System.out.println("balance " + s1.balance(str1));



   } 
    
  }
