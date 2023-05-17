package data_structures;


//Checking if the binary tree is a complete binary tree or not

//Node creation
class NodeTwo{
	int data;
	NodeTwo left,right;
	
	public NodeTwo(int item) {
		data= item;
		left=right=null;
		
	}
}
public class CompleteBinaryTree {

	NodeTwo root;
	
	//count the number of nodes
      int countNumNodes(NodeTwo root) {
    	  if(root==null)return (0);
    	  
    	  return (1+ countNumNodes(root.left)+countNumNodes(root.right));
    	  
      }
      
      //Check for the complete binary tree
      boolean checkComplete(NodeTwo root, int index, int numberNodes) {
    	  //check tree is empty
    	  if(root==null)
    		  return true;
    	  
    	  if(index>=numberNodes)return false;
    	  
    	  return (checkComplete(root.left,2*index+1,numberNodes)&&
    			  checkComplete(root.right,2*index+2,numberNodes));
      }
	
	public static void main(String[] args) {
		CompleteBinaryTree tree = new CompleteBinaryTree();
		tree.root = new NodeTwo(1);
		tree.root.left = new NodeTwo(2);
		tree.root.right = new NodeTwo(3);
		tree.root.left.left = new NodeTwo(4);
		tree.root.left.right = new NodeTwo(5);
		tree.root.right.left = new NodeTwo(6);
		
		int node_count=tree.countNumNodes(tree.root);
		int index=0;
		
		if(tree.checkComplete(tree.root,index,node_count))
				System.out.println("Tree is complete binary tree ");
		else
			System.out.println("Tree is not complete binary tree");
		

	}

}
