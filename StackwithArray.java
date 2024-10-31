package LinkedList;

import java.util.EmptyStackException;

public class StackwithArray {


		int top;
		int capacity;
		int arr[];
	
	
	public boolean isEmpty() {
		if(top==-1) {
			return true;
		}
		return false;
	}
	
	public StackwithArray(int size) {
		capacity=size;
		arr=new int[capacity];
		top=-1;
	}
	
	public void push(int data) {
		if(top== capacity-1) {
			throw new ArrayIndexOutOfBoundsException();
		}
		top=top+1;
		arr[top]=data;
	}
	
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return arr[top--];
	}
	
	public int peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return arr[top];
	}
	
	public static void main(String[] args) {
		StackwithArray stack=new StackwithArray(3);
		stack.push(90);
		stack.push(20);
		stack.push(45);
		System.out.println("Remove Element at top :" + stack.pop());
		System.out.println("Element at Top :"+ stack.peek());
	}
}
