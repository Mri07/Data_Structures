
package data_structures.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DFS 
{	
		private int size=0;
		private ArrayList<ArrayList<Integer>> al;
		boolean visit[] ; // Prevent loop ( prevent traversing vertexs repeatedly )
		 DFS(int v) 
		{
			 size = v;
			 al = new ArrayList<ArrayList<Integer>>(size);
			 visit = new boolean[size];
			 
			 for( int i=0 ; i<size ; i++)// 2d ArrayList Initialization
				 al.add(new ArrayList<Integer>() );
		}
		 
		 public void addEdge(int u , int v)
		 {
			 al.get(u).add(v);		
			 System.out.println("From point "+u+" -> "+v);
		 }
		 
		 private void DFS_Traverse_Recur(int root) 
		 {  
			     visit[root] = true;	
				 System.out.print(root+" ");
				 
				 int i=0;
				 while( i < al.get(root).size() )
				 {
					 int n = al.get(root).get(i);				 
					 if( !visit[ n ] )
					 {						 
						 DFS_Traverse_Recur(n);
					 }
					 i++;				 
				 }			 		 	
		 }
		 
		 public static void main(String args[]) 
			{ 
				DFS g = new DFS(4);
				
				System.out.println("GRAPH");
				g.addEdge(0, 1); 
				g.addEdge(0, 2); 
				g.addEdge(1, 2); 
				g.addEdge(2, 0); 
				
				g.addEdge(2, 3); 
				g.addEdge(3, 3); 

				System.out.println("\nDEPTH First Traversal "+ 
								"(starting from vertex 2)");
				
				g.DFS_Traverse_Recur(2);				
			}	
}
