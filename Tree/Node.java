package data_structures.Tree;

public class Node 
{
	int data;
	Node right,left;
	
	public Node() 
	{
		left = right = null;	
	}
	public Node(int data)
	{
		this.data = data;
		left = right = null;	
	}	
}
