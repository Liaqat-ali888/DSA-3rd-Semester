class Node {
	int data;
	Node next;
	Node (int data){
		this.data = data;
		this.next = null;
	}
}
 class list {
	static Node head;
	static Node tail;
	list(){
		head = null;
		tail= null;
	}
    static void insert(int data){
    	Node newdata = new Node(data); 
    	if(head == null){
    		head = newdata;
    		tail = newdata;
    		return;
    	}
    	tail.next = newdata;
    	tail = newdata;
    }
    void display(Node head){
       Node cur = head;
		while(cur!=null){
			System.out.print(cur.data);
			if(cur.next !=null){
				System.out.print("->");
			}
			cur = cur.next;

		}
	}

void rang(Node head){
		int max = head.data;
		int min = head.data;
		Node cur = head;
		while(cur!=null){
			if(min>cur.data){
				min = cur.data;
			}
			if(max<cur.data){
				max = cur.data;
			}
       cur = cur.next;
		}
		System.out.println(max +" - "+ min +" = " +(max- min));
	}



}

class listA{
	
	Node head;
	Node tail;
	Node next;
	listA(){
		head = null;
		next= null;
	}
	void insertA(){
		Node cur = list.head;
		while(cur!=null){
			if(cur.data%3==0){
				Node newNode = new Node(cur.data);
				if(head==null){
				head=newNode;
				tail =newNode;
				
              }
              else{
              tail.next = newNode;
              tail = newNode;
			}
		}
			cur = cur.next;
		}

	}

	

	
}

class listB{
	
	Node head;
	Node tail;
	Node next;
	listB(){
		head = null;
		next= null;
	}
	void insertB(){
		Node cur = list.head;
		while(cur!=null){
			if((cur.data)%5 == 0 && (cur.data)%3 != 0){
				Node newNode = new Node(cur.data);
				if(head==null){
				head=newNode;
				tail =newNode;
				
              }
              else{
              tail.next = newNode;
              tail = newNode;
			}
		}
			cur = cur.next;
		}

	}

	}

	class listC{
	
	Node head;
	Node tail;
	Node next;
	listC(){
		head = null;
		next= null;
	}
	void insertC(){
		Node cur = list.head;
		while(cur!=null){
			if((cur.data)%3 !=0  && (cur.data)%5 !=0){
				Node newNode = new Node(cur.data);
				if(head==null){
				head=newNode;
				tail =newNode;
				
              }
              else{
              tail.next = newNode;
              tail = newNode;
			}
		}
			cur = cur.next;
		}

	}

	

	
}





class main{
	public static void main(String arg[]){
		list l = new list();
		l.insert(15);
		l.insert(45);
		l.insert(82);
		l.insert(28);
		l.insert(67);
		l.insert(91);
		l.insert(33);
		l.insert(55);
		l.insert(10);
		l.insert(75);
	System.out.print("\noriginal list: ");
       l.display(l.head);
       System.out.print("\n\n\n");
	
		listA a = new listA();
		a.insertA();
		System.out.print("List: divisible by 3:\t");
		l.display(a.head);
		System.out.print("\nrang of A: ");
		l.rang(a.head);

       listB b = new listB();
		b.insertB();
		System.out.print("List: divisible by 5 (but not by 3):\t");
		l.display(b.head);
		System.out.print("\nrang of B: ");
		l.rang(b.head);

		  listC c = new listC();
		c.insertC();
		System.out.print("List C(others):\t ");
		l.display(c.head);
		System.out.print("\nrang of C: ");
		l.rang(c.head);

	}
}