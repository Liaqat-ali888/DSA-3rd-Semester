class Node {
	int data ;
	Node left ;
	Node right;
	Node(int data){
		this.data = data;
	}
}
class Myqueue{
	Node  array[] = new Node[100];
	int front =0;
	int rear =-1;
	void enqueue(Node data){
		array[++rear] = data;

	}
	Node dequeue(){
		return array[front++];
	}
	boolean isEmpty(){
		return front>rear;
	}
}


class bst{
	Myqueue q = new Myqueue();
	Node root;
	void insert(int data){
		root = insertNode(root , data);
	}
	Node insertNode(Node root, int val){
		if(root == null){
			return new Node(val);
		}
		if(root.data == val){
			return root;
		}
		if(val<root.data){
			root.left = insertNode(root.left, val);
		}
		else {
			root.right = insertNode(root.right,val);
		}
		return root;
	}

	void PrintInorder(){
		inorder(root);
	}
	void inorder(Node root){
		if(root == null){
			return;
		}
		//inorder(root.left);
		inorder(root.right);
		System.out.print(root.data +" ");
		inorder(root.left);
		//inorder(root.right);
	}
	void levelOrdertraversal(){
		levelOrder(root);
	}
	void levelOrder(Node root){
		if(root ==null){
			return;
		}
	
		q.enqueue(root);
		q.enqueue(null);
		while(!q.isEmpty()){
			Node cur = q.dequeue();
			if(cur == null){
				System.out.println();
			if(q.isEmpty()){
				break;
			}
			else{
				q.enqueue(null);
			}
			}
			else{
				System.out.print(cur.data +" ");
				if(cur.left!=null){
					q.enqueue(cur.left);
				}
				if(cur.right!=null){
					q.enqueue(cur.right);
				}
			}
		}
	}
}
class Main{
	public static void main(String arg[]){
		bst b = new bst();
		b.insert(7);
		b.insert(2);
		b.insert(10);
		b.insert(4);
		b.insert(11);
		b.insert(1);
		b.PrintInorder();
		//b.levelOrdertraversal();
		b.levelOrdertraversal();

	}
}