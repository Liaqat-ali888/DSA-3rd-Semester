class Node {
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
		left =null;
		right = null;
	}
}
class tree{
	Node root;

	void setleft(Node parent, int data){
		if(root== null){
			root = new Node(data);
			return;

		}
		if(parent.left== null){
			parent.left = new Node (data);
			return;
		}
		setleft(parent.left, data);
	}

    void setright(Node parent, int data){
		if(root== null){
			root = new Node(data);
			return;

		}
		if(parent.right== null){
			parent.right = new Node (data);
			return;
		}
		setleft(parent.left, data);
	}
	void inorder(Node node){
		if(node== null){
			return;
		}
		inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

    void display(Node root) {
    if (root == null) {
        return;
    }

    System.out.println(root.data);
    display(root.left);
    display(root.right);
}


}
class main {
public static void main(String arg[]) {
tree t = new tree();

    t.setleft(t.root, 10);
    t.setleft(t.root, 5);
    t.setright(t.root, 20);

    t.setleft(t.root.left, 3);
    t.setright(t.root.left, 7);

    t.setright(t.root.right,25);
     t.setleft(t.root.right,15);

    t.display(t.root);
    System.out.print("Inorder: ");
    t.inorder(t.root);
}
}