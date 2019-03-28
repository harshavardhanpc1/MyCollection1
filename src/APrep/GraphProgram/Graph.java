package APrep.GraphProgram;

import java.util.LinkedList;

/**
 * Created by intelliswift on 1/17/19.
 */
public class Graph {
   int V;
   LinkedList<Integer> l[];
   int []i;
   Graph (int V){
       this.V = V;
       l = new LinkedList[V];
       for(int i=0;i<V;i++)
           l[i] = new LinkedList<Integer>();
   }
   public void addEdge(Graph graph,int s,int d){
       graph.l[s].add(d);
       graph.l[d].add(s);
   }

}
