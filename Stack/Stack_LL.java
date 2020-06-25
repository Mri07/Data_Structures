package data_structures.Stack;

import java.io.DataInputStream;
import java.io.IOException;

 class Node 
{
	int data;
	Node right,left;
	
	public Node() 
	{
		left = null;
		right = null;	
	}
	public Node(int data)
	{
		this.data = data;
		left = null;
		right = null;	
	}	
}
 
public class Stack_LL 
{
    private static DataInputStream dis = new DataInputStream(System.in);
	
	private static Node head  = null , ptr = null , get_new = null;
	private static char ch = 'y';
	private static int stack[];
	private static int top=-1;
	
	public static void main(String[] args) throws Exception 
	{	
		head = new Node();
		
		int size = 5;
		stack = new int[size];
		while(true)
		{
			System.out.println("");
			System.out.println("Stack Operations ");
			System.out.println("1.PUSH");
			System.out.println("2.POP");
			System.out.println("3.Exit");
			System.out.println("Enter choice");
			int choice = Integer.parseInt(dis.readLine());
			
			switch(choice)
			{
			    case 1:
			    	pushNumber();
					display();
					break;
					
			    case 2:
			    	popNumber();
					display();
					break;
					
			    case 3:
			    	System.exit(0);
					
				default:
					System.out.println("Choose correct option !!! ");						
		     }		
	     }
	}

	private static void pushNumber() throws Exception 
	{	
		while(ch == 'y' || ch == 'Y')
		{		
		    System.out.println("Enter roll number");
		    int rollno = Integer.parseInt( dis.readLine());
		
		    get_new = new Node(rollno);
		
		    ptr = head;
		
		    while(ptr.right != null)
		    ptr = ptr.right;
		
		    ptr.right = get_new;
		
		   System.out.println("Continue?");
		   ch = dis.readLine().charAt(0);
	     }
	}
	
	private static void popNumber() throws IOException 
	{
		ch='y';
		while(ch == 'y' || ch == 'Y')
		{
			Node ptr2 = null;
			ptr = head;
			
			if(head.right == null)
				System.out.println("Stack Underflow");
			else
			{
				while(ptr.right!= null)
				{
					ptr2 = ptr;
					ptr=ptr.right;				
				}
				System.out.println("Remove "+ptr.data);
				ptr2.right = null;				
			}		
			
			   System.out.println("Continue?");
			   ch = dis.readLine().charAt(0);
		}
	}
	
	private static void display() 
	{		
		System.out.println("\nDISPLAY");
		ptr = head.right;
		if(ptr == null)
		{
			System.out.println("Empty Stack");
			return;
		}			
		System.out.print("Nodes are = > ");
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}		
		System.out.println("");
	}
	
}
