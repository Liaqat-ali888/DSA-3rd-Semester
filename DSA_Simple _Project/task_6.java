

class Node{
	String url;
	Node goForward;
	Node goBackward;
	Node (String url){
		this.url = url;
		this.goForward = null;
		this.goBackward = null;
	}
}
class Stack{
  Node top;
  Node cur;
  Stack(){
  	this.top = null;
  	this.cur = null;
  }
  void visitPage(String url){
  	Node newurl = new Node (url);
  	if(top == null){
  		top = newurl;
  		cur = newurl;
  		top.goForward = null;
  		top.goBackward= null;
  		return;

  	}
  	newurl.goBackward = top;
  	top.goForward =newurl;
  	top = newurl;
  	cur = top;
  }

void goBack(){
	if(cur.goBackward == null){
		System.out.println("Home page");
		return;
	}
	
    String back = cur.goBackward.url;
    cur = cur.goBackward;
    System.out.println("back:  "+back);

}
void goForward(){
	if(cur.goForward == null){
		System.out.println("[ ]");
		return;
	}
	String forward = cur.goForward.url;
	cur = cur.goForward;
	System.out.println("forward: "+ forward);
}
void currrentPage(){
	if(top == null){
		System.out.println("current homepage");
		return;
	}
	System.out.println("current page: " + cur.url);
}

}
class main{
	public static void main(String arg[]){
		Stack s = new Stack();
		s.visitPage("ali");
		s.visitPage("mushu");
		s.goBack();
		s.goForward();
			s.visitPage("musa");
		s.currrentPage();
			s.goBack();
				s.goBack();
	s.goForward();
	s.goForward();
	s.goForward();
	s.goForward();

			
	}
}