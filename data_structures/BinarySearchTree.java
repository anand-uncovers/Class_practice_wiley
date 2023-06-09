package data_structures;

//Binary search trr operations

//class BST{
//	boolean search(Node root,int x) {
		
	//	if(root==null)return false;
		
	//	if(root.data==x)return true;
		
	//	if(root.data>x) {
	//		return search(root.left,x);
//		}
//		return search(root.right,x);
//	}
//}

public class BinarySearchTree{
	
static class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}

// Root of BST
Node root;

// Constructor
BinarySearchTree() { root = null; }

BinarySearchTree(int value) { root = new Node(value); }

// This method mainly calls insertRec()
void insert(int key) { root = insertRec(root, key); }

// A recursive function to
// insert a new key in BST
Node insertRec(Node root, int key)
{
    // If the tree is empty return a new node
    if (root == null) {
        root = new Node(key);
        return root;
    }

    // Otherwise, recur down the tree
    if (key < root.key)
        root.left = insertRec(root.left, key);
    else if (key > root.key)
        root.right = insertRec(root.right, key);

    // return the (unchanged) node pointer
    return root;
}

// This method mainly calls InorderRec()
void inorder() { inorderRec(root); }

// A utility function to do inorder traversal of BST
void inorderRec(Node root)
{
    if (root != null) {
        inorderRec(root.left);
        System.out.print(root.key + " ");
        inorderRec(root.right);
    }
}
public Node search(Node root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root == null || root.key == key)
        return root;
 
    // Key is greater than root's key
    if (root.key < key)
        return search(root.right, key);
 
    // Key is smaller than root's key
    return search(root.left, key);
}


// Driver Code
public static void main(String[] args)
{
    BinarySearchTree tree = new BinarySearchTree();
    tree.root=new Node(8);
    tree.root.left=new Node(3);
    tree.root.right=new Node(10);
    tree.root.right.right=new Node(14);
    tree.root.left.left=new Node(1);
    tree.root.left.right=new Node(6);
    tree.root.left.right.left=new Node(4);
    tree.root.left.right.right=new Node(7);
    //tree.insert(50);
   // tree.insert(30);
   // tree.insert(20);
   // tree.insert(40);
   // tree.insert(70);
   // tree.insert(60);
   // tree.insert(80);
 System.out.println(tree.search(tree.root,4));
    // Print inorder traversal of the BST
  //  tree.inorder();
 
}
}

      //                   8
     //                   / \
      //                  3  10
      //                  /\   \
     //                   1 6   14
     //                     /\
     //                     4 7
      //                    //insert15 and 16
                          
