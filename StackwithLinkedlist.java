package LinkedList;

import java.util.EmptyStackException;

public class StackwithLinkedlist {
   private int length;
	private Node4 top;
	public void push(int data) {
		Node4 newNode=new Node4(data);
		newNode.next=top;
		top=newNode;
		length++;
	}
	
	public int pop() {
		if(isEmpty()) {
			  throw new EmptyStackException();
			}
		
		int pop=top.data;
		top=top.next;
		length--;
		return pop;
	}
	
	public StackwithLinkedlist() {
		top=null;
		length=0;
	}
	
	public boolean isEmpty() {
		if(length==0) {
			return true;
		}
		else return false;
	}
	public int peek() {
		if(isEmpty()) {
		  throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {
		StackwithLinkedlist stack=new StackwithLinkedlist();
		stack.push(20);
		stack.push(90);
		stack.push(40);
		
		System.out.println("Top Element :"+stack.peek());
		stack.pop();
		System.out.println("Top Element :"+stack.peek());
	}
}

class Node4{
	int data;
	Node4 next;
	
	public Node4(int data) {
		this.data=data;
		this.next=null;
	}
}
