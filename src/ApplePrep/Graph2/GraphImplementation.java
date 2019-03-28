package ApplePrep.Graph2;

import java.util.*;

/**
 * Created by intelliswift on 1/20/19.
 */
public class GraphImplementation implements Graph {
    private List<Node> vertexList = new ArrayList<>();
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices = 0;

    public GraphImplementation(int numVertices,GraphType graphType){
        this.numVertices = numVertices;
        for(int i=0;i<numVertices;i++){
            vertexList.add(new Node(i));
        }
        this.graphType = graphType;
    }
    @Override
    public void addEdge(int v1, int v2) {
        if(v1>=numVertices || v1<0 || v2>=numVertices || v2<0  )
            throw new IllegalArgumentException("Vertex invalied "+v1+v2);

        vertexList.get(v1).addEdge(v2);
        if(graphType == GraphType.UNDIRECTED){
            vertexList.get(v2).addEdge(v1);
        }
    }

    @Override
    public List<Integer> getAdjecentVertices(int v) {
        if(v>=numVertices || v<0  )
            throw new IllegalArgumentException("Vertex invalied "+v);
        return vertexList.get(v).getAdjecentVertices();
    }

    public int getNumVertices(){
        return this.numVertices;
    }



    public int getIndegree(int v){
        if(v>=numVertices || v<0  )
            throw new IllegalArgumentException("Vertex invalied "+v);
        int inDegree = 0;
        for(int i = 0;i<numVertices;i++){
            if(getAdjecentVertices(i).contains(v)){
                inDegree++;
            }
        }
        return inDegree;
    }

    public  List<Integer> sort(Graph graph){
        LinkedList<Integer>queue = new LinkedList();
        HashMap<Integer,Integer>inDegreeMap = new HashMap();
        for(int vertex=0;vertex<graph.getNumVertices();vertex++){
            int indegree = graph.getIndegree(vertex);
            inDegreeMap.put(vertex,indegree);
            if(indegree==0)
                queue.add(vertex);
        }
        List<Integer>sortList = new ArrayList();

        while(!queue.isEmpty()){
            int vertex = queue.pollLast();
            sortList.add(vertex);
            List<Integer>adjecent = graph.getAdjecentVertices(vertex);
            for(Integer i:adjecent)
            {
                int updatedIndegree = inDegreeMap.get(i)-1;
                inDegreeMap.remove(i);
                inDegreeMap.put(i,updatedIndegree);
                if(updatedIndegree == 0){
                    queue.add(i);
                }

            }
        }
        if(sortList.size()!=graph.getNumVertices()){
            throw new RuntimeException("The graph is cycle");
        }
        return sortList;
    }

    public boolean dfsImpl(GraphImplementation graph,int v,int e){
        List<Integer>visited = new LinkedList();
        return  dfs(graph,visited,v,e);
    }

    public boolean dfs(Graph graph,List<Integer>visited,int v,int e){
        if(v == e){
            return true;
        }
        else {
            if (visited.contains(v)) {
                return false;
            } else {
                visited.add(v);
                for(int k : graph.getAdjecentVertices(v)){
                    if(dfs(graph,visited,k,e)){
                        return true;
                    }
                }
            }

        }
        return false;
    }

    public boolean bfsImpl(GraphImplementation graph,int v,int e){
        List<Integer>visited = new LinkedList();
        return  bfs(graph,visited,v,e);
    }

    public boolean bfs(Graph graph,List<Integer>visited,int v,int e){
        Queue<Integer> q = new LinkedList();
        q.add(v);
        while(!q.isEmpty()){
            int temp = q.poll();
            if(temp==e){
                return true;
            }
            if(visited.contains(temp)){
                continue;
            }
            else {
                visited.add(temp);
                for(int i:graph.getAdjecentVertices(temp)){
                    q.add(i);
                }
            }
        }
        return false;
    }
}
