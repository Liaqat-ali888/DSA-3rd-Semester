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

void rangOfLow(Node head){
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

class listLow{
	
	Node head;
	Node tail;
	Node next;
	listLow(){
		head = null;
		next= null;
	}
	void insertLow(){
		Node cur = list.head;
		while(cur!=null){
			if(cur.data<30){
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

class listMid{
	
	Node head;
	Node tail;
	Node next;
	listMid(){
		head = null;
		next= null;
	}
	void insertMid(){
		Node cur = list.head;
		while(cur!=null){
			if(cur.data>=30 && cur.data <=70){
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
	
		listLow low = new listLow();
		low.insertLow();
		System.out.print("Low list: ");
		l.display(low.head);
		System.out.print("\nrang of low: ");
		l.rangOfLow(low.head);

       listMid mid = new listMid();
		mid.insertMid();
		System.out.print("Mid list: ");
		l.display(mid.head);
		System.out.print("\nrang of mid: ");
		l.rangOfLow(mid.head);

	}
}