package PracticeTreePackage;
import java.util.*;

/**
 * Created by intelliswift on 8/22/18.
 */
public class Graph {
    //No of vertices
    //Array with type linkedlist
    HashMap<Integer,LinkedList> h = new HashMap<Integer,LinkedList>();;
    void addEdge(int b,int e){
        if(h.containsKey(b)){
            LinkedList list = h.get(b);
            list.add(e);
        } else
        {
            h.put(b,new LinkedList());
            LinkedList list = h.get(b);
            list.add(e);
        }
    }

    public boolean dfSearch(int i,int p){
        HashSet<Integer> s = new HashSet<Integer>();
        return dfUtil(i,p,s);
    }

   public boolean dfUtil(int i,int p,HashSet<Integer>s){
        if(s.contains(i))
        return false;
       s.add(i);
       if(i == p)
            return true;
       LinkedList<Integer>list = h.get(i);
       if (list == null) return false;
        for(Integer j: list){
            if (dfUtil(j, p, s)) {
                return true;
            }
        }
        return false;
    }

    public boolean bfs(int i,int p){
       LinkedList<Integer>nextToVisit = new<Integer>LinkedList();
       Set<Integer>visited = new<Integer>HashSet();
       nextToVisit.add(i);
         while(!nextToVisit.isEmpty()) {
              Integer j  = nextToVisit.remove();
             if(j==p){
                 return true;
             }
             if (visited.contains(j))
                 continue;
             visited.add(j);
             List<Integer> l = h.get(j);
             if (l==null)
                 continue;
             for (Integer q : l) {
                 nextToVisit.add(q);
             }
         }
       return false;
    }
    public static void main(String[]args){
        Graph g = new Graph();
        g.addEdge(0,4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(2,5);
        g.addEdge(3,4);
        g.addEdge(4,2);
        System.out.println(g.dfSearch(1,5));
        System.out.println(g.bfs(0,5));
    }
}
