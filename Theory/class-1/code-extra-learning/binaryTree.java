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

class binarytree{
     Node root;
       void insert(int data){
       root =	insertNode(root ,data);
       }
	Node insertNode(Node root , int data){
		if(root ==null){
			return new Node (data);
		}
		if(data == root.data){
			return root;

		}
		if(data<root.data){
			root.left = insertNode(root.left, data);
		}
		else{
			root.right = insertNode(root.right, data);
		}
		return root;
	}

	void inorderPrint(){
       inorder(root);
	}
	 void inorder(Node root){
		if(root == null){
			return ;

		}
		
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);

	}
	void delete(int key){
		root =delelteNode(root,key);
	}
	Node delelteNode(Node root, int key){
		if(root == null){
			return root;
		}
		if(key<root.data){
			root.left = delelteNode(root.left, key);
		}
	   else if(key>root.data){
		root.right = delelteNode(root.right,key);
	}
	else{

	 if(root.left==null){
	 	return root.right;

	 }
	 if(root.right ==null){
	 	return root.left;
	 }

	  Node suc = getsuc(root);
	  root.data = suc.data;
	  root.right =delelteNode(root.right, suc.data);
	}
	return root;
}
Node getsuc(Node root){
	Node cur = root.right;
	while(cur!=null && cur.left!=null){
		cur = cur.left;
	}
	return cur;
}

     }
class Main{
	public static void main(String arg[]){
		binarytree b = new binarytree();
		b.insert(12);
		b.insert(23);
		b.insert(1);
		b.insert(65);
		b.insert(33);
		b.insert(54);
		b.inorderPrint();
		b.delete(65);
		b.inorderPrint();
	}
}