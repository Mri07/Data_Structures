package data_structures.Tree;

public class Delete_BST 
{
	private static Node root=null,x=null;
	private static Node result;
	
	public static void main(String[] args) 
	{
		int arr[] = {10, 5, 1, 7, 40, 50};
		
		Delete_BST obj = new Delete_BST();
		
		for(int i=0 ; i<arr.length ; i++)obj.createBST(root,arr[i]);
		show(root);		
		System.out.println();		
		
		delete(10);			
	}	
	private static void delete(int del) 
	{		
		if( root == null )
			System.out.println("Empty BST");		
		else
			result = deleteNode(root,del);
		
		if(result == null)
			System.out.println("Element is absent");
		else		
		    show(root);
	}

	private static Node deleteNode(Node ptr, int del) 
	{	
		if( ptr == null )return null; // When deleting node is absent
		
		if( del < ptr.data) // traverse to left
		{			
			ptr.left = deleteNode(ptr.left, del);
		}			
		else if( del > ptr.data) // traverse to right
		{		
			ptr.right = deleteNode(ptr.right, del);
		}
		else
		{
			if( ptr.left == null)
				return ptr.right;
			else if( ptr.right == null  )
				return ptr.left;
			
			ptr.data = minValue(ptr.right);
			
			ptr.right = deleteNode(ptr.right, ptr.data);			
				
			} 		
		return ptr;	
	}
private static int minValue(Node root) 
{
	int minv = root.data; 
    while (root.left != null) 
    { 
        minv = root.left.data; 
        root = root.left; 
    } 
    return minv;	
}

	private Node createBST(Node ptr,int arr) 
	{
		if( root == null ) // Second way to make first element as ROOT
		{
			root = new Node(arr);
			return ptr;
		}			
		if(ptr == null)
		{
			ptr = new Node(arr);
			return ptr;
		}
		if( arr < ptr.data ) ptr.left = createBST(ptr.left, arr);		
		else ptr.right = createBST(ptr.right, arr);
		
		return ptr;
	}
	
	private static void show(Node result) 
	{
		if(result == null)return ;		
		
		show(result.left);		
		System.out.print(result.data+" ");
		show(result.right);		
	}
}
