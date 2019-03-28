package APrep.Graph2;

import java.util.List;

/**
 * Created by intelliswift on 1/20/19.
 */
public interface Graph {
    enum GraphType{
        DIRECTED,
        UNDIRECTED
    }
    void addEdge(int v1,int v2);

    List<Integer> getAdjecentVertices(int v);

    int getNumVertices();

    int getIndegree(int v);

}
