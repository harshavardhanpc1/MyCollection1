package ApplePrep.Graph2;

import java.util.*;

/**
 * Created by intelliswift on 1/20/19.
 */
public class Node {
    private int vertexNumber;
    private Set<Integer> adjecent = new HashSet<Integer>();
    public Node(int x){
        this.vertexNumber = x;
    }
    public int getVertexNumber(){
        return vertexNumber;
    }
    public void addEdge(int vertexNumber){
        adjecent.add(vertexNumber);
    }
    public List<Integer> getAdjecentVertices(){
        List<Integer>sortList = new ArrayList<>(adjecent);
        Collections.sort(sortList);
        return sortList;
    }
}
