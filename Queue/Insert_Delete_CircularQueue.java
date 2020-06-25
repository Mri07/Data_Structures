package data_structures.Queue;

import java.io.DataInputStream;
import java.io.IOException;

public class Insert_Delete_CircularQueue 
{
	private DataInputStream dis = new DataInputStream(System.in);
	private static int queue[];
	private int front = -1 , rear = -1;
	private char ch = 'y';
	
	public static void main(String[] args) throws Exception 
	{
		Insert_Delete_CircularQueue obj = new Insert_Delete_CircularQueue();		
	}
		private  Insert_Delete_CircularQueue() throws IOException 
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
			ch = 'y';
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
			if((front == 0 && rear == queue.length-1)  )
			{
				System.out.println("Circular Queue Overflow");
				return;
			}				
			else if(front == -1 && rear == -1)
			{
				front++;
				rear++;
				queue[rear] = num;
			}
			else if(rear == queue.length-1)			
				rear = -1;				
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
			int temp=0;					
			
			if(front == -1)
			{
				System.out.println("Circular Queue Underflow");
				return -1;
			}				
			else if( front == rear)
			{
				temp = queue[front];
				front = -1;
				rear = -1;
			}
			else if(front == queue.length-1)
			{
				temp = queue[front];
				front = 0;
			}
			else			
				temp = queue[front++];			
			
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
