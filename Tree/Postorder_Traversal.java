package data_structures.Tree;

import java.util.Stack;

public class Postorder_Traversal
{
	Node root,ptr;
	public static void main(String[] args) 
	{
		Postorder_Traversal obj = new Postorder_Traversal();
		obj.createTree();
		obj.postorderTraversal();
	}
	
	private void postorderTraversal() {
		Stack<Node> s = new Stack<Node>();
		ptr = root;
		while(true) { 
            while(ptr != null) { 
                s.push(ptr); 
                s.push(ptr); 
                ptr = ptr.left; 
            } 
              
            // Check for empty stack 
            if(s.empty()) return; 
            ptr = s.pop(); 
              
            if(!s.empty() && s.peek() == ptr) ptr = ptr.right; 
              
            else {
                System.out.print(ptr.data + " "); ptr = null; 
            } 
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
