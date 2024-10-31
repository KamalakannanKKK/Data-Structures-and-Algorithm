package LinkedList;

public class DoubllyLinkedList {
 
	private Node1 head;
	
	public void insert(int data) {
		Node1 newNode = new Node1(data);
		
		if(head == null) {
			head=newNode;
			return;
		}
		
		else {
			Node1 current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
			newNode.previous=current;
			
		
		}
	}
	
	public void displayForward() {
		Node1 current=head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	
	public void displaybackward() {
		Node1 current=head;
		while(current.next!=null) {
			current=current.next;
		}
		while(current!=null) {
			
			System.out.print(current.data +" ");
			current=current.previous;
		}
	}
	
	public static void main(String[] args) {
		DoubllyLinkedList list=new DoubllyLinkedList();
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		System.out.println("Forward direction :");
		list.displayForward();
		System.out.println();
		System.out.println("Backward direction :");
		list.displaybackward();
		
	}
}

class Node1{
    int data;
	Node1 previous;
	Node1 next;
	
	public Node1(int data) {
		this.data=data;
		this.next=null;
		this.previous=null;
	}
}
