package APrep.Graph2;

import java.util.List;

import static APrep.Graph2.Graph.GraphType.DIRECTED;

/**
 * Created by intelliswift on 1/20/19.
 */
public class GraphLive {

    public static void main(String[]args){
        GraphImplementation graph = new GraphImplementation(5,DIRECTED);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(2,4);
        List<Integer> list = graph.sort(graph);
        for(Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println(graph.dfsImpl(graph,0,4));
        System.out.println(graph.bfsImpl(graph,2,4));
    }
}
