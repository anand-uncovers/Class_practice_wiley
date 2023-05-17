package data_structures;



public class LinkedListClass {

Node head;
	
	static class Node{
		int value;
		Node next;
		
		public Node(int d){
			 value = d;
			 next=null;
		}
	}
	
	//insert at the end
	public void add_at_end(int val) {
		Node node1 = new Node(val);
		if(head==null) {
			head=new Node(val);
			return;
		}
		node1.next=null;
		Node last = head;
		while(last.next!=null)last = last.next;
		
		last.next=node1;
		return;
	}
	//Insert at the beginning
	public void add_at_begin(int val) {
		Node node1= new Node(val);
		node1.next=head;
		head=node1;
	}
	//Insert in the middle
	public void add_at_middle(Node aftr_node,int val) {
		
		if(aftr_node==null) {
			System.out.println("The given node cannot be null");
		return;
		}
		Node node1= new Node(val);
		node1.next=aftr_node.next;
		aftr_node.next=node1;
	}
	
	//Delete at end
	//Delete at the beginning
	//Delete in the middle
	//Print LinkedList
	//Search node by key
	//Sort the LinkedList
	
	void sortedLinkedList(Node head) {
		Node current =head;
		Node index=null;
	
	int temp;
	
	if(head==null) {
		return;//false
	}else {
		while(current!=null) {
			//Index point to the node next to the current 
			index = current.next;
			
			while(index!=null) {
				if(current.value>index.value) {
					current.value=index.value;
					temp=current.value;
					index.value=temp;
					
				}
				index =index.next;
			}
			current = current.next;
		}
	}
	}
	public static void main(String[] args) {
		
		LinkedListClass linkedList = new LinkedListClass();
		
		//Assign the value
		linkedList.head= new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		//Connect the nodes
		linkedList.head.next=second;
		second.next=third;
		
		//Different operations
		linkedList.add_at_end(100);
		linkedList.add_at_begin(0);
		linkedList.add_at_middle(linkedList.head.next ,333);
		
		linkedList.sortedLinkedList(Node head);
		//Printing node value
		System.out.println("LinkedList Obtained:-");
		while(linkedList.head !=null) {
			System.out.printf(linkedList.head.value +"->");
			linkedList.head=linkedList.head.next;
		}
		System.out.println("NULL");
	}
}
