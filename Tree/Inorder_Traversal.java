package data_structures.Tree;

import java.util.*;

public class Inorder_Traversal 
{	
	Node root,ptr;
	public static void main(String[] args) 
	{
		Inorder_Traversal obj = new Inorder_Traversal();
		obj.createTree();
		obj.inorderTraversal();
	}
	private void createTree() 
	{
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
				
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);		
	}
	void inorderTraversal() 
	{	
		Stack<Node> s = new Stack<Node>();	
		
		s.push(root);
		
		ptr = root;
		
		while(s.size() > 0)
		{
			if(ptr == null) return;
			
			while( ptr.left != null )
			{
				ptr = ptr.left;
				s.push(ptr);
			}
			Node num = s.pop();
			System.out.println(num.data);
			
			if( num.right != null)
			{
				ptr = num.right;
				s.push(ptr);
			}			
		}
	}
}
