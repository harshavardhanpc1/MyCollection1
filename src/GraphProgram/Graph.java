package GraphProgram;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by intelliswift on 5/3/18.
 */
public class Graph {
    private HashMap<String, Vertex> vertices;
    private HashMap<Integer, Edge> edges;

    public Graph(){
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
    }

    public Graph(ArrayList<Vertex> vertices){
        this.vertices = new HashMap<String, Vertex>();
        this.edges = new HashMap<Integer, Edge>();
        for(Vertex v: vertices){
            this.vertices.put(v.getLabel(), v);
        }
    }


}
