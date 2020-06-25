package data_structures.Stack;

import java.io.DataInputStream;
import java.io.IOException;

public class Stack_Array
{
	private DataInputStream dis = new DataInputStream(System.in);
	private int stack[];
	private int top=-1;
	private char ch = 'y';
	
	private  Stack_Array() throws IOException 
	{
		int size = 5;
		stack = new int[size];
		while(true)
		{
			System.out.println("");
			System.out.println("Stack Operations =>");
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
	private void display() 
	{
		System.out.println("\nStack Elements =>");
		for(int i=0 ; i<=top ; i++)
			System.out.print(stack[i]+" ");
		
		System.out.println("");
	}

	private void pushNumber() throws IOException 
	{	
		while(ch == 'y' || ch == 'Y')
		{
			System.out.println("Enter number in stack");
			int num = Integer.parseInt(dis.readLine());
			push(num);
			
			System.out.println("continue ? (Y/N)");
			ch = dis.readLine().charAt(0);
		}		
	}

	private void push(int num) 
	{
		if( top == stack.length-1)
			System.out.println("Stack Overflow");
		else
			stack[++top] = num;
	}
	
	private void popNumber() throws IOException 
	{			 
		ch = 'y';
		while(ch == 'y' || ch == 'Y')
		{
			pop();
			
		   System.out.println("continue ? (Y/N)");
		   ch = dis.readLine().charAt(0);
	    }		
	}

	private void pop() 
	{		
		if(top == -1)
			System.out.println("Stack Underflow");
		else
		{
			System.out.println("Remove "+stack[top]);
			top--;
		}
			
	}

	public static void main(String[] args) throws Exception 
	{
		Stack_Array obj = new Stack_Array();						
	}
	
}
