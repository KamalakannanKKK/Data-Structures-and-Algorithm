package Tree;

class Node {
	int data;
	Node right, left;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	public BinaryTree() {
		root = null;
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	private Node insertRec(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}
		if (data < root.data) {
			root.left = insertRec(root.left, data);
		} else if (data > root.data) {
			root.right = insertRec(root.left, data);
		}
		return root;
	}

//Inorder Traversal
	public void Inorder() {
		inorderRec(root);
	}

	private void inorderRec(Node root) {
		if (root != null) {

			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}

	}
	//preorder traversal
	public void preorder() {
		preorderRec(root);
	}

	private void preorderRec(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorderRec(root.left);
			preorderRec(root.right);
		}
		
	}

	//preorder traversal
	public void postorder() {
		postorderRec(root);
	}

	private void postorderRec(Node root) {
		if(root!=null) {
			
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.data+" ");
		}
		
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.insert(34);
		tree.insert(50);
		tree.insert(23);
		tree.insert(90);
		tree.insert(22);

		System.out.println("Inorder Traversal :");
		tree.Inorder();
		System.out.println();
		System.out.println("Preorder Traversal :");
		tree.preorder();
		System.out.println();
		System.out.println("PostOrder Traversal :");
		tree.postorder();
	}
}
