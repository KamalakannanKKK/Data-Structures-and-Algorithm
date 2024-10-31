package LinkedList;

public class QueuewithArray {

	int maxsize;
	int front;
	int rear;
	int[] arr;
	int nItems;
	
	public QueuewithArray(int size) {
		maxsize=size;
		arr=new int[maxsize];
		front=0;
		rear=-1;
		nItems=0;
	}
	
	public void enqueue(int data) {
		if(nItems==maxsize) {
			System.out.println("Queue is Overflow..");
			return ;
		}
		if(rear==maxsize-1) {
			rear=-1;
		}
		arr[++rear]=data;
		nItems++;
	}
	
	public int dequeue() {
		if(nItems==0) {
			System.out.println("Queue is Empty..");
		}
		int temp=arr[front++];
		if(front==maxsize) {
			front=0;
		}
		nItems--;
		return temp;
	}
	
	public int peek() {
		if(nItems==0) {
			System.out.println("Queue is Empty..");
		}
		return arr[front];
	}
	
	public boolean isEmpty() {
		return nItems==0;
	}
	
	public void display() {
		if(nItems==0) {
			System.out.println("Queue is Empty..");
		}
		
		int count=nItems;
		int i=front;
		while(count>0) {
			System.out.println(arr[i]+" ");
			i=(i+1);
			count--;
		}
	}
	public static void main(String[] args) {
		QueuewithArray list=new QueuewithArray(3);
		list.enqueue(23);
		list.enqueue(234);
		list.enqueue(34);
		
		System.out.println("Queue elements :");
		list.display();
		
		list.dequeue();
		
		System.out.println("Queue elements :");
		list.display();
		
		System.out.println("Peek element :"+ list.peek());
	}
}
