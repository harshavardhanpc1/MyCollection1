package APrep;

import java.util.*;

/**
 * Created by intelliswift on 1/10/19.
 */
public class PriorityQueueDemoTopTwo {
    static class PQsort implements Comparator<Integer> {

        public int compare(Integer one, Integer two) {
            return two - one;
        }
    }
    public static void main(String[]args) {
        PQsort pqs = new PQsort();
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(pqs);
        ArrayList<Integer> l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        q.add(10);
        q.add(9);
        q.add(6);
        q.add(7);
        q.add(8);
        q.remove(6);
        //last 2 element
        for(int i=0;i<2;i++){
            System.out.println("Last "+i+" "+q.poll());
        }
       for(Integer i:q){
            System.out.println(i);
       }


    }
}
