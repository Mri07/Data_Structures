package data_structures.Tree;

public class BST 
{
	private Node root=null,result=null;
	public static void main(String[] args) 
	{		
		BST obj = new BST();
		obj.input();
	}	
	private void input() 
	{
		int arr[] = {10, 5, 1, 7, 40, 50};
		
		root = new Node(arr[0]);
		
		for(int i=1 ; i<arr.length ; i++)
		{
			 result = createBST(root,arr[i]);						
		}
		show(result);
	}
	private void show(Node result) 
	{
		if(result == null)return ;
		
		System.out.println(result.data);
		show(result.left);		
		show(result.right);		
	}
	private Node createBST(Node ptr,int arr) 
	{
		if(ptr == null)
		{
			ptr = new Node(arr);
			return ptr;
		}
		if( arr < ptr.data ) ptr.left = createBST(ptr.left, arr);		
		else ptr.right = createBST(ptr.right, arr);
		
		return ptr;
	}
		
}
