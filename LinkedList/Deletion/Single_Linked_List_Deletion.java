package data_structures.LinkedList;

import java.io.DataInputStream;
import java.io.IOException;

public class Single_Linked_List_Deletion 
{
private static DataInputStream dis = new DataInputStream(System.in);
	
	private static Node head  = null , ptr = null , get_new = null;
	private static char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{
		head = new Node();
		SLL_Ins_End();
//		SLL_Del_Beg();
//		SLL_Del_End();
		SLL_Del_Any();
		
		display();
	}
	private static void SLL_Del_Any() throws Exception 
	{
		System.out.println("Enter roll number to be delete ");
		int rollno = Integer.parseInt(dis.readLine());
		
		Node ptr2 = null;
		ptr = head.right;
		while(ptr != null && ptr.data != rollno)
		{
			ptr2 = ptr;
			ptr = ptr.right;
		}
			
		ptr2.right = ptr.right;
		
		if(ptr == null) System.out.println("Not found ! ");
		
		
	}
	private static void SLL_Del_End() 
	{
		ptr = head;
		Node ptr2 = null;
		while(ptr.right != null)
		{
			ptr2 = ptr;
			ptr = ptr.right;
		}
			
		ptr2.right=null;		
		
	}
	private static void SLL_Del_Beg() 
	{
		System.out.println("Deletion at BEG");
		ptr = head.right;
		head.right = ptr.right;
		
	}
	private static void SLL_Ins_End() throws Exception 
	{
		System.out.println("Insertion at END");
		
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
	
	private static void display() 
	{
		System.out.println("DISPLAY");
		ptr = head.right;
		System.out.print("Nodes are = > ");
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}		
	}
	
}
