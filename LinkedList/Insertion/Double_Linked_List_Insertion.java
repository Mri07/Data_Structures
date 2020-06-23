package data_structures.LinkedList;

import java.io.DataInputStream;
import java.io.IOException;

public class Double_Linked_List_Insertion
{
    private static DataInputStream dis = new DataInputStream(System.in);
	
	private static Node head  = null , ptr = null , get_new = null;	
	private static char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{
		head = new Node();
		
//		DLL_Ins_Beg();
		DLL_Ins_End();
		display();
		DLL_Ins_Any();
		display();
				
	}
	private static void DLL_Ins_Any() throws Exception 
	{
		System.out.println("Insertion at ANY");
		System.out.println("Enter roll number ");
		int rollno = Integer.parseInt( dis.readLine());		
		get_new = new Node(rollno);
		
		System.out.println("Enter roll number after which you have to insert ");
		int rollfind = Integer.parseInt( dis.readLine());		
		
		ptr = head.right;
		
		while(ptr.data != rollfind && ptr != null)
			ptr = ptr.right;
		
		if(ptr == null) System.out.println("Not found ! ");
		else if(ptr.right == null)
		{
			get_new.right = null;
			get_new.left = ptr;
			ptr.right = get_new;
		}
		else
		{
			Node ptr2;
			
			ptr2 = ptr.right;
			get_new.right = ptr2;
			ptr2.left = get_new;
			ptr.right = get_new;
			get_new.left = ptr;
			
		}
		
	}

	private static void DLL_Ins_End() throws Exception 
	{
		System.out.println("Insertion at END");
		while(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter roll num");
			int rollno = Integer.parseInt(dis.readLine() );
			get_new = new Node(rollno);
			
			ptr = head;
			while(ptr.right != null)
				ptr = ptr.right;
			
			ptr.right = get_new;
			get_new.left = ptr;
			get_new.right = null;
			
			System.out.println("Continue?");
			   ch = dis.readLine().charAt(0);
		}
	}

	private static void DLL_Ins_Beg() throws Exception 
	{
		System.out.println("Insertion at BEG");
		while(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter roll num");
			int rollno = Integer.parseInt(dis.readLine() );
			get_new = new Node(rollno);
			
			if(head.right == null)
			{
				get_new.right = head.right;
				get_new.left = head;
				head.right = get_new;
			}
			else
			{
				ptr = head.right;
				get_new.right = ptr;
				ptr.left = get_new;
				get_new.left = head;
				head.right = get_new;
			}
			
			System.out.println("Continue?");
			   ch = dis.readLine().charAt(0);		
		}	 	
	}
	
	private static void display() 
	{
		System.out.println("DISPLAY");
		ptr = head.right;
		
		// Test for Double Linked List
//		ptr = ptr.right.right;
//		ptr = ptr.left.left;
//		System.out.print(ptr.data);
		
		System.out.print("Nodes are = > ");
		
		while(ptr != null)
		{
			System.out.print(ptr.data+" ");
			ptr = ptr.right;
		}
		
		System.out.println("");		
		
	}

}
