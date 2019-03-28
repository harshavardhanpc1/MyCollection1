package Practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by intelliswift on 12/16/18.
 */
public class HeapSortUse {
    public static void main (String[]args){
        PriorityQueue<Integer>p = new PriorityQueue<>(new PriorityQueue<Integer>(Collections.reverseOrder()));
        p.add(16);
        p.add(30);
        p.add(50);
        p.add(60);
        p.add(15);
        System.out.println(p.poll());
        System.out.println(p.peek());
    }
}
