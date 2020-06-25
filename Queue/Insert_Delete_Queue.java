package data_structures.Queue;

import java.io.DataInputStream;
import java.io.IOException;

public class Insert_Delete_Queue 
{
	private DataInputStream dis = new DataInputStream(System.in);
	private static int queue[];
	private int front = -1 , rear = -1;
	private char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{
		Insert_Delete_Queue obj = new Insert_Delete_Queue();
		
	}
		private  Insert_Delete_Queue() throws IOException 
		{
			int size = 5;
			queue = new int[size];
			while(true)
			{
				System.out.println("");
				System.out.println("Queue Operations =>");
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
		
		private void pushNumber() throws IOException 
		{	
			while(ch == 'y' || ch == 'Y')
			{
				System.out.println("Enter number in queue");
				int num = Integer.parseInt(dis.readLine());
				push(num);
				
				System.out.println("continue ? (Y/N)");
				ch = dis.readLine().charAt(0);
			}		
		}
		
		private void push(int num) 
		{
			if( rear == queue.length-1)
				System.out.println("Queue Overflow");
			else if( rear == -1 && front ==-1)
			{
				front++;
				queue[++rear] = num;
			}			
			else
				queue[++rear] = num;
		}
		
		private void popNumber() throws IOException 
		{			 
			ch = 'y';
			while(ch == 'y' || ch == 'Y')
			{
				int value = pop();
				System.out.println("Removed "+value);
			   System.out.println("continue ? (Y/N)");
			   ch = dis.readLine().charAt(0);
		    }		
		}

		private int pop() 
		{	
			int temp = 0;
			if(front == -1)
				System.out.println("Queue Underflow");
			else if( front == rear)
			{				
				temp = queue[front]; 
				front = -1;
				rear = -1;				
			}
			else
			{
				temp =  queue[front];
				front++;
			}					
			return temp;
		}
		
		private void display() 
		{
			if(front == rear)
			{
				System.out.println("\nEmpty Queue ");
				return;
			}
			
			System.out.println("\nQueue Elements =>");
			for(int i=front ; i<=rear ; i++)
				System.out.print(queue[i]+" ");
			
			System.out.println("");
		}
}
