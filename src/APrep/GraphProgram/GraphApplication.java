package APrep.GraphProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by intelliswift on 1/17/19.
 */
public class GraphApplication {
    public static void main(String[]args){
        Graph graph = new Graph(8);
        graph.addEdge(graph,0,7);
        graph.addEdge(graph,0,6);
        graph.addEdge(graph,0,1);
        graph.addEdge(graph,3,2);
        graph.addEdge(graph,1,3);
        graph.addEdge(graph,7,5);
        graph.addEdge(graph,5,3);
        for(int i=0;i<8;i++)
        {
            System.out.print(i+":");
            for(Integer j:graph.l[i])
            {
                System.out.print(j+"->");
            }
            System.out.println();
        }
       depthFistSearch(graph,0,6);
        System.out.println(bfs(graph,0,6));
    }
    public static void depthFistSearch(Graph graph,int source,int destination){
        HashSet<Integer> visited = new<Integer>LinkedHashSet();

        System.out.println(dfs(graph,source,destination,visited));
        System.out.println("analysis");
        for(Integer i:visited)
        {
            System.out.println(i);
        }
    }
    public static boolean dfs(Graph graph,int source,int destination,HashSet visited){
        if(visited.contains(source))
            return false;
        if(source == destination)
            return true;
        visited.add(source);
        System.out.println("it");

        for(Integer i: graph.l[source])
        {
            System.out.println(i);
            if(dfs(graph,i,destination,visited))
                return true;
        }
        return false;
    }
    public static boolean bfs(Graph graph,int source,int destination){
        LinkedList<Integer>nextToVisit = new LinkedList();
        HashSet<Integer>visit = new HashSet();
        nextToVisit.add(source);
        while(!nextToVisit.isEmpty()){
            Integer i = nextToVisit.remove();
            if(i==destination){
                return true;
            }
            if(visit.contains(i))
                continue;
            visit.add(i);
            for(Integer j:graph.l[i])
            {
                nextToVisit.add(j);
            }
        }
        return(false);
    }
}
