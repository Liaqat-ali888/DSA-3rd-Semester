// Liaqat Ali 
// CMS_ID: 053-25-0015
// Section: A
import java.util.Scanner;
class Node {
	int data;
	Node left;
	Node right;
	Node (int data){
		this.data = data;
		left = null;
		right = null;
	}
}
class BinaryTree{
	Node root;
	void setLeft(Node parent, int value){
		if(root== null){
			 root = new Node (value);
			return;
		}
		if(parent.left==null){
			parent.left = new Node(value);
			return;
		}
		setLeft(parent.left,value);

	}
	void setRight(Node parent, int value){
		if(root == null){
			root = new Node (value);
			return;
		}
		if(parent.right== null){
			parent.right = new Node(value);
			return;

		}
		setRight(parent.right,value);
	}
	
	void display(Node root){
		if(root == null ){
			return;

		}
		System.out.print(root.data + " ");
		display(root.left);
		display(root.right);
	}

         //Task 2

	void inorder(Node node){
		if(node== null){
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}
	// task 3
	void preorder(Node node){
		if(node== null){
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);

	}

// Task 4
	void postorder(Node root){
		if(root == null){
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data + " ");
	}
	// Task 5
	int countNode(Node root){
		if(root== null){
			return 0;
		}
		return 1 +countNode(root.left) + countNode(root.right);
	}
	// Task 6
	int height(Node root){
		if(root == null){
			return 0;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		if(leftheight>rightheight){
			return 1 + leftheight;
		}
		else{
			return 1 + rightheight;
		}
	}

	// Task 7
	boolean search(Node root , int key){
		if(root == null){
			return false;

		}
		if(root.data == key){
			return true;
		}
		return search(root.left,key) || search(root.right,key);

	}


}
class main{
	public static void main(String arg[]){
		BinaryTree t = new BinaryTree();
		//Task 1
		System.out.println("\n\t Task 1\n ");
		t.setLeft(t.root,10);
		t.setLeft(t.root,5);
		t.setRight(t.root,20);

		t.setLeft(t.root.left,3);
		t.setRight(t.root.left,7);

        t.setLeft(t.root.right,15);
		t.setRight(t.root.right,25);
          t.display(t.root);

		// Task 2
    	System.out.println("\n\t Task 2");
       System.out.print("Inorder: ");
       t.inorder(t.root);

       // Task 3
       	System.out.println("\n\t Task 3");
       System.out.print("\n preOrder: ");
       t.preorder(t.root);

       //Task4
		System.out.println("\n\t Task 4 ");
		System.out.print("\n PostOrder: ");
		t.postorder(t.root);
		

		// Task 5
		System.out.println("\n\t Task 5");
		System.out.print("\n total nodes: "+t.countNode(t.root));

		//Task 6

		System.out.print("\n\t Task 6");
		 System.out.print("\n height: "+t.height(t.root));
		
		// Task 7

		 System.out.print("\n\t Task 7");
		 Scanner input = new Scanner(System.in);
		 System.out.print("\n Enter element : ");
		 int key = input.nextInt();

		 if(t.search(t.root,key)){
		 	System.out.println("Element found");

		 }
		 else {
		 	System.out.println("Not found");
		 }
	}
}