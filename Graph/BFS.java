package data_structures.Graph;

//Java program to print BFS traversal from a given source vertex. 
//BFS(int s) traverses vertices reachable from s.
import java.util.*; 

//This class represents a directed graph using adjacency list 
//representation 
public class BFS 
{ 
	private int size=0;
	private ArrayList<ArrayList<Integer>> al;
	 BFS(int v) 
	{
		 size = v;
		 al = new ArrayList<ArrayList<Integer>>(size);
		 
		 for( int i=0 ; i<size ; i++)// 2d ArrayList Initialization
			 al.add(new ArrayList<Integer>() );
	}
	 
	 public void addEdge(int u , int v)
	 {
		 al.get(u).add(v);		
		 System.out.println("From point "+u+" -> "+v);
	 }
	 
	 private void BFS_Traverse(int root) 
	 { 
		 boolean visit[] = new boolean[size]; // Prevent loop ( prevent traversing vertexs repeatedly )
		 
		 Queue<Integer> queue = new LinkedList<Integer>();
		 // OR LinkedList<Integer> queue = new LinkedList<Integer>();
		 
		 queue.add(root);
		 visit[root] = true;
		 
		 while( queue.size() != 0)
		 {
			 int head = queue.poll();
			 System.out.print(head+" ");
			 
			 int i=0;
			 while( i < al.get(head).size() )
			 {
				 int n = al.get(head).get(i);				 
				 if( !visit[ n ] )
				 {
					 queue.add( n );
					 visit[n] = true ;
				 }
				 i++;				 
			 }
		 }		 	
	 }
	 
	public static void main(String args[]) 
	{ 
		BFS g = new BFS(4);
		
		System.out.println("GRAPH");
		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("\nBreadth First Traversal "+ 
						"(starting from vertex 2)");
		
		g.BFS_Traverse(2); 
	}	 
}