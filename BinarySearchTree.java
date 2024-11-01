package Tree;

class Node1{
	int data;
	Node1 right,left;
	
	public Node1(int data) {
		this.data=data;
		right=left=null;
	}
}
public class BinarySearchTree {

	Node1 root;
	
	public BinarySearchTree() {
		root=null;
	}
	
	public void insert(int data) {
		root=insertRec(root,data);
	}

	private Node1 insertRec(Node1 root, int data) {
		if(root ==null) {
			root=new Node1(data);
			return root;
		}
		
		if(data<root.data) {
			root.left=insertRec(root.left,data);
		}
		else if( data>root.data) {
			root.right=insertRec(root.right, data);
		}
		return root;
		
	}
	
	public void inorder() {
		inorderRec(root);
	}
	
	private void inorderRec(Node1 root) {
		if(root!=null) {
			inorderRec(root.left);
			System.out.print(root.data+" ");
			inorderRec(root.right);
		}
		
	}
	
	public int minValue(Node1 root2) {
		int min=root2.data;
		while(root2.left!=null) {
			min=root2.left.data;
			root2=root2.left;
		}
		return (min);
	}
	
	public int maxValue(Node1 root) {
		int max=root.data;
		while(root.right!=null) {
			max=root.right.data;
			root=root.right;
		}
		return max;
	}
	
	public boolean search(int data) {
		return searchRec(root,data);
	}

	private boolean searchRec(Node1 root,int data) {
		if(root==null) {
			return false;
		}
		else if(root.data==data) {
			return true;
		}
		return data<root.data?searchRec(root.left,data):searchRec(root.right,data);
	}
	
	public Node1 delete(Node1 root,int data) {
		if(root==null) return root;
		if(data<root.data) {
			root.left=delete(root.left,data);
		}
		else if (data>root.data) {
			root.right=delete(root.right,data);
		}
		else {
			if(root.left==null) return root.right;
			else if(root.right==null) return root.left;
			root.data=minValue(root.right);
			root.right=delete(root.right,root.data);
			
		}
		return root;
	}

	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(23);
		tree.insert(12);
		tree.insert(34);
		tree.insert(43);
		tree.insert(90);
		
		System.out.println("Inorder Traversal :");
		tree.inorder();
		System.out.println();
		
		System.out.println("Minimum value in Root: "+tree.minValue(tree.root));
		System.out.println("Maximum value in Root: "+tree.maxValue(tree.root));
		
		System.out.println("Search for value 23 :"+tree.search(23));
		
		tree.root=tree.delete(tree.root, 23);
		System.out.println("Deleting 23...");
		System.out.println("Inorder Traversal :");
		tree.inorder();
		System.out.println();
		
	}
}
