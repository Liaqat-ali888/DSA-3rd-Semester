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
boolean palindrome(String str){
  for(int i = 0 ;i<str.length(); i++){
    push(str.charAt(i));
  }
  for(int i =0; i<str.length(); i++){
    if(str.charAt(i)!= pop()){
      return false;
    }
  } 
  return true; 

}
}

class Main{
  public static void main(String arg[]){
    String str1 = "MADAM";
    Stack s1 = new Stack(str1.length());

    System.out.println("Input: "+str1);
    System.out.println("Palindrome " + s1.palindrome(str1));

    

   } 
    
  }
