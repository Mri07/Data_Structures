package data_structures.Tree;

import java.util.Stack;

public class Preorder_Traversal
{
	Node root,ptr;
	public static void main(String[] args) 
	{
		Preorder_Traversal obj = new Preorder_Traversal();
		obj.createTree();
		obj.preorderTraversal();
	}

	private void preorderTraversal() {
		Stack<Node> s = new Stack<Node>();
		
		ptr = root;		
		if(ptr == null) return;		
		
		s.push(ptr);
		while(s.size() > 0)
		{	
				Node num = s.pop();
				ptr = num;
				System.out.println(ptr.data);
				
				if(ptr.right != null)
					s.push(ptr.right);
				if(ptr.left != null)
					s.push(ptr.left);	
		}
	}

	private void createTree() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
				
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
	}
}
