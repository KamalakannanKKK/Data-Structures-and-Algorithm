package LinkedList;

public class CircularLinkedList {

	private Node2 head;
	
	public void insert(int data) {
		Node2 newNode=new Node2(data);
		
		if(head==null) {
			head=newNode;
			newNode.next=head;
		}
		else {
			Node2 current=head;
			while(current.next!=head) {
				current=current.next;
			}
			current.next=newNode;
			newNode.next=head;
		}
	}
	
	public void display() {
		Node2 current=head;
		if(current==null) {
			return;
		}
		else {
			 do{
				System.out.print(current.data+" ");
				current=current.next;
			}while(current!=head);
		}
	}
	
	public void delete(int data) {
		if(head.data==data) {
			head=null;
		}
		else {
			Node2 current=head;
			while(current.next.data==data) {
				current.next=current.next.next;
				
			}
		}
	}
	
	public static void main(String[] args) {
		CircularLinkedList list=new CircularLinkedList();
		list.insert(20);
		list.insert(23);
		list.insert(34);
		list.insert(45);
		System.out.println("Circular Linked List : ");
		list.display();
		list.delete(23);
		System.out.println();
		System.out.println("Circular Linked List : ");
		list.display();
	}
	
}

//Singly Circular Linked List
class Node2{
	int data;
	Node2 next;
	
	public Node2(int data) {
		this.data=data;
		this.next=null;
	}
}
