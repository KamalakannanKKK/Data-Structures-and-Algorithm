package LinkedList;

public class FloydsAlgorithm {

	private Node3 head;
	
	public void insert(int data) {
		Node3 newNode=new Node3(data);
		
		if(head==null) {
			head=newNode;
		}
		
		else {
			Node3 current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
			
		}
	}
	
	public boolean looppresent() {
	Node3 fastptr=head;
	Node3 slowptr=head;
	
	while(fastptr!=null && fastptr.next!=null) {
		slowptr=slowptr.next;
		fastptr=fastptr.next.next;
		
		if(slowptr==fastptr) {
			return true;
		}
	}
	return false;
	}
	
	public static void main(String[] args) {
		FloydsAlgorithm list=new FloydsAlgorithm();
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		
		//create Loop
		list.head.next.next.next.next=list.head.next;
		
		//Detect Loop
		System.out.println("Linked List has Loop: "+ list.looppresent());
	}
	
}

class Node3{
	int data;
	Node3 next;
	public Node3(int data) {
		this.data=data;
		this.next=null;
	}
}
