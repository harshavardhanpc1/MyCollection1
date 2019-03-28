package TreePrograms;

import java.util.*;

/**
 * Created by intelliswift on 5/3/18.
 */
public class Graph {
    private int V;   // No. of vertices

    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w);  // Add w to v's list.
    }

    public void dft(){
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if (!visited[i])
            DFtUtil(i,visited);
        }
    }
    public void DFtUtil(int i,boolean visited[]){
        visited[i] = true;
        System.out.println(" " + i);
        Iterator<Integer> it = adj[i].listIterator();
        if(it.hasNext()) {
            int n = it.next();
            if (visited[n] == false){
                DFtUtil(n,visited);
            }
        }
    }

    //Depth first search demo
    public boolean dfSearch(int a,int d){
        HashSet<Integer> visited1  = new<Integer> HashSet();
        return dfSearchUtil(a,d,visited1);
    }

    public boolean dfSearchUtil(int a,int d,HashSet <Integer>visited1){
        if(visited1.contains(a))
        return false;
        visited1.add(a);
        if(a==d)
            return true;
        for(Integer i: adj[a]) {
            if (dfSearchUtil(i, d, visited1)) {
                return true;
            }
        }
            return false;
    }



    //Breath first Search demo

    public boolean BFS(int a,int d){
        LinkedList<Integer> nextToVisit = new LinkedList<Integer>();
        HashSet<Integer>visted2 = new HashSet<Integer>();
        nextToVisit.add(a);
        while(!nextToVisit.isEmpty()){
            a = nextToVisit.remove();
            if (a==d)
                return true;
            if (visted2.contains(a))
              continue;
            visted2.add(a);
            for (Integer i : adj[a]) {
                nextToVisit.add(i);
            }
        }
        return false;
    }

    public static void main (String[]args){
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 3);
        g.addEdge(4, 5);
        g.addEdge(5, 4);
//        g.dft();
        System.out.println(g.dfSearch(0,5));
        System.out.println(g.BFS(0,5));

    }

}
