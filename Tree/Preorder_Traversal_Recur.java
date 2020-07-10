package data_structures.Tree;

public class Preorder_Traversal_Recur 
{
	static Node root;
	Node ptr;
	public static void main(String[] args) 
	{	
		createTree();
		traverseRecur(root);
	}
	private static void traverseRecur(Node ptr) 
	{
		if(ptr == null) return;
		
		System.out.println(ptr.data);
		traverseRecur(ptr.left);
		traverseRecur(ptr.right);
	}
	private static void createTree() 
	{
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
				
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);		
	}
	

}
