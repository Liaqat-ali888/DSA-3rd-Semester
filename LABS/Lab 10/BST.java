
// Task 1
class Node{
	int data;
	Node left;
	Node right;
	Node (int data){
		this.data = data;
	}
}
class Bst{
	Node root;
	void insert(int value){
	 root = insertNode(root , value);

	}
	Node insertNode(Node root, int value){
		if(root == null){
			return new Node(value);
		}
		if(value<root.data){
			root.left = insertNode(root.left, value);
		}
		else if(value >root.data){
			root.right = insertNode(root.right, value);
		}
		return root;
	}
	
	boolean search(int value){
		return searchNode(root ,  value);
	}
	boolean searchNode(Node root, int value){
		if(root == null){
			return false;
		}
		if(root.data== value){
			return true;

		}

		if(value<root.data){
			return searchNode(root.left, value);
		}
	
			return searchNode(root.right, value);
		
	}
	void delete(int value){
		root = deleteNode(root , value);
	}
    Node deleteNode(Node root , int value){
    	if(root== null){
    		return null;
    	}
    	if(value< root.data){
    	root.left = deleteNode(root.left,value);	
    	}
    	else if(value>root.data){
    		root.right = deleteNode(root.right, value);
    	}
    	else {
    		if(root.left == null && root.right==null){
    			return null;
    		}
    		if(root.left ==null){
    			return root.right;
    		}
    		if(root.right == null){
    			return root.left;
    		}

    		Node IS = inorderSuccesssor(root.right);
    		root.data = IS.data;
    		root.right = deleteNode(root.right, IS.data);
    	}
    	return root;
    }


    	Node inorderSuccesssor(Node root){
    	
    		while(root.left!=null){	
    			root = root.left;
    		}
    		return root;

    	}
    
    void inorder(Node root){
		if(root==null){
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	void preorder(Node root){
		if(root == null){
			return ;
		}
		System.out.print(root.data +" ");
		preorder(root.left);
		preorder(root.right);
	}
	void postorder(Node root){
		if(root == null){
			return ;
		}
		preorder(root.left);
		preorder(root.right);
        System.out.print(root.data + " ");
	}
 // Task 2
	int findMin(){
    Node minnode = min(root.left);
    return minnode.data;
	}
	Node min(Node root){
		if(root == null){
			return null;
		}
		min(root.left);
		return root;
	}
	int findMax(){
		Node maxNode = max(root.right);
		return maxNode.data;
	}
	Node max(Node root){
		if(root == null){
			return null;
		}
		max(root.right);
		return root;
	}
	// Task 3
	boolean isValide(){
		return checkvalid(root, null, null);

	}
	boolean checkvalid(Node root, Node min, Node max){
		if(root == null){
			return true;

		}
		if(min!=null && root.data<=min.data){
			return false;
		}
		if(max!=null && root.data>= max.data){
			return false;
		}
		return checkvalid(root.left, min, root) && checkvalid(root.right,root,max );

	}



	// Task 4
	void printRange(int low, int high){
		RangePrint(root,low , high );
	}
	void RangePrint(Node root , int x, int y){
		if(root == null){
			return;
		}
		if(root.data>= x && root.data<=y){
			RangePrint(root.left,x , y);
			System.out.print(root.data+" ");
			RangePrint(root.right,x,y);

		}
		else if(root.data >=y){
			RangePrint(root.left,x,y);
		}
		else{
			RangePrint(root.right, x , y);
		}
	}

}

class Main {
	public static void main(String arg[]){
		Bst b = new Bst();
		// Task 1 
        b.insert(50);
		b.insert(30);
		b.insert(70);
		b.insert(20);
		b.insert(40);
		b.insert(60);
		b.insert(80);
        System.out.println("Inorder Traversal: ");
		b.inorder(b.root);
		System.out.println("\nPreorder Traversal: ");
		b.preorder(b.root);
		System.out.println("\nPostorder Traversal: ");
		b.postorder(b.root);
		System.out.println("\nfound: " + b.search(3));
		System.out.println("found: "+b.search(30));
        System.out.println("\nDelete 20");
		b.delete(20);
		b.inorder(b.root);
		// Task 2
		System.out.println("\n Minimum Value: "+ b.findMin());
		System.out.println(" Maximum Value: "+ b.findMax());
       // Task 3
		System.out.println("Valide BST: "+b.isValide());
		// Task 4
		System.out.println("\nRange 40 to 70: ");
		b.printRange(40,70);
	}
} 