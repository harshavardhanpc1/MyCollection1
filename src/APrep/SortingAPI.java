package APrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by intelliswift on 1/10/19.
 */
public class SortingAPI {
    static class PQsort implements Comparator<Integer> {
        public int compare(Integer one, Integer two) {
            if(one>two)
                return (two-one);
            else if (one<two)
                return (one-two);
            else
                return 0;
        }
    }
    public static void main (String[]args){
        PQsort pqs = new PQsort();
        ArrayList<Integer> l = new ArrayList();
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(7);
        l.add(9);
        Collections.sort(l);
        for(Integer i:l ){
           System.out.print(i+" ");
        }
        System.out.println();
        Collections.sort(l,pqs);
        for(Integer i:l ){
            System.out.print(i+" ");
        }
//        int max = Collections.max(l);
//        System.out.println(max);
    }
}
