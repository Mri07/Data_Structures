package data_structures.Tree;

public class BST
{
	private Node root=null,result=null;
	public static void main(String[] args)
	{
		BST obj = new BST();
		obj.recursiveBST();

		//obj.iterativeBST();
	}

	private void iterativeBST()
	{
		int arr[] = {10, 5, 1, 7, 40, 50};
		Node ptr = null;
		Node x = null;

		root = new Node(arr[0]);

		for(int i=1 ; i<arr.length ; i++)
		{
			if( arr[i] < root.data )
			{
				ptr = root;
				while( ptr != null )
				{
					x = ptr;
					ptr = ptr.left;
				}
				x.left = new Node(arr[i]);
			}
			else
			{
				ptr = root;
				while( ptr != null )
				{
					x = ptr;
					ptr = ptr.right;
				}
				x.right = new Node(arr[i]);
			}
		}
     show(root);
	}
	private void recursiveBST()
	{
		int arr[] = {10, 5, 1, 7, 40, 50};

		//root = new Node(arr[0]);  // First way to make first element as ROOT

		for(int i=0 ; i<arr.length ; i++)
		{
			 result = createBST(root,arr[i]);
		}
		show(result);
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

	private void show(Node result)
	{
		if(result == null)return ;

		System.out.print(result.data+" ");
		show(result.left);
		show(result.right);

	}
}
