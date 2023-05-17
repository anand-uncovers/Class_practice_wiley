package data_structures;


//Tree Traversal in java

class Node{
	int item;
	Node left,right;
	
	public Node(int key) {
		item=key;
		left=right=null;
	}
}
public class BinaryTree {
   
	//Root of the Binary Tree
	Node root;
	
	public BinaryTree() {
		root=null;
	}
	
	//Postorder traversal
	void postOrder(Node node) {
		if(node==null)return;
		
		//traverse left
		postOrder(node.left);
		//traverse right
		postOrder(node.right);
		//traverse root
	     System.out.println(node.item+"-->");
	}
	//Inorder traversal
	void inOrder(Node node) {
		if(node==null)return;
	

		//traverse left
		inOrder(node.left);
		//traverse root
	     System.out.println(node.item+"-->");
	 	
	     //traverse right
			inOrder(node.right);
	 
	}
	
	//preOdre
	void preOrder(Node node) {
		if(node==null)return;
	
		
		//traverse root
	     System.out.println(node.item+"-->");
	 	
			//traverse left
			preOrder(node.left);
	     //traverse right
			preOrder(node.right);
	 
	}
	
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.root=new Node(1);
		tree.root.left=new Node(12);
		tree.root.right=new Node(9);
		
		tree.root.left.left=new Node(5);
		tree.root.left.right=new Node(6);
		
		System.out.println("INORDER TRAVERSAL-");
		tree.inOrder(tree.root);
		
		System.out.println("PREORDER TRAVERSAL-");
		tree.preOrder(tree.root);
		
		System.out.println("POSTORDER TRAVERSAL-");
		tree.postOrder(tree.root);
	}
}
