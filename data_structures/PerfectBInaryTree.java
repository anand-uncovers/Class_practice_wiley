package data_structures;


public class PerfectBInaryTree {

	static class Node{
		int key;
		Node left,right;
	}
	
	//Calculate the depth
	static int  depth(Node node) {
		int d=0;
		while(node !=null) {
			d++;
			node =node.left;
		}
		return d;
	
}
	
	//check if the given tree is perfect binary tree or not
	static boolean isPerfect(Node root,int d,int level) {
		
		//check if the tree is empty or not
		if(root==null)return true;
		
		//check for the childrens
		if(root.left==null && root.right==null)return (d==level+1);
		
		if(root.left==null |root.right==null)return false;
		
		return isPerfect(root.left,d,level+1)&&isPerfect(root.right,d,level+1);
		
		
	}
	
	//wrapper function
static boolean isPerfect(Node root) {
		
		int d=depth(root);
		return isPerfect(root,d,0);
		
		
	}
//create a new node
static Node newNode(int k) {
	Node node = new Node();
	node.key=k;
	node.left=null;
	node.right=null;
	
	return node;
}
	public static void main(String[] args) {
		Node root = null;
		root=newNode(1);
		root.left=newNode(2);
		root.right=newNode(3);
		root.left.left=newNode(4);
		root.left.right=newNode(5);
		root.right.left=newNode(6);
		root.right.right=newNode(7);
		
		if(isPerfect(root)==true)System.out.println("The given tree is perfect binary tree");
		else
			System.out.println("The given tree is not perfect binary tree");
		
		

	}

}
