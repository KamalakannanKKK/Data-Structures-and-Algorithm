package LinkedList;

public class SinglyLinkedList {

	private Node head;
	
	public void insert(int data) {
		Node newNode =new Node(data);
	
		if(head==null) {
			head=newNode;
		}
		else {
			Node current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
			
			/*To Create Loop
			 * if(current.data==40) { current.next=head; }
			 */
		}
	
	}
	
	public void display() {
		Node current= head;
		while(current!=null) {
			System.out.print(current.data+" ");
			current=current.next;
		}
		
	}
	
	public int count() {
		Node current=head;
		int count=0;
		while(current!=null) {
			count++;
			current=current.next;
		}
		return count;
	}
	
	public int get(int index) {
		Node current =head;
		if(index<0 && index > count()) {
			throw new IndexOutOfBoundsException();
		}
		for(int i=0;i<index;i++) {
			current=current.next;
		}
		return current.data;
	}
	
	public void deletevalue(int data) {
		if(head==null) {
			return;
		}
		if(head.data==data) {
			head=head.next;
		}
		Node current=head.next;
		if(current.next!= null && current.next.data!=data) {
			current=current.next;
		}
		if(current.next!=null) {
			current.next=current.next.next;
		}
	}
	
	public void reverse() {
		Node previous=null;
		Node Current =head;
		Node next=null;
		
		while(Current!=null) {
			next=Current.next;
			Current.next=previous;
			previous=Current;
			Current=next;
		}
		head=previous;
	}
	
	public boolean checklooppresent() {
		Node fastptr=head;
		Node slowptr=head;
		while(fastptr!=null && fastptr.next!=null) {
			fastptr=fastptr.next.next;
			slowptr=slowptr.next;
			if(fastptr==slowptr) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		System.out.println("Singly List Node Data;");
		list.insert(10);
		list.insert(30);
		list.insert(40);
		list.insert(20);
		list.display();
		
		  int count=list.count(); System.out.println();
		  System.out.println("Total Node :"+ count);
		  
		  System.out.println("Value at Index 2 :"+list.get(2));
		  
		  System.out.println("Remove element 20"); list.deletevalue(20);
		  System.out.println("Singly List Node Data;"); list.display(); list.reverse();
		  
		  System.out.println("Singly List Node Data;"); list.display();
		 
		
		System.out.println("Loop is "+list.checklooppresent());
	}
}

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
} 
