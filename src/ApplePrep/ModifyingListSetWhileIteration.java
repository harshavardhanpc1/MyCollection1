package ApplePrep;

import java.util.*;

/**
 * Created by intelliswift on 1/9/19.
 */
public class ModifyingListSetWhileIteration {
    public static void main(String[]args){
        List<Integer> l = new LinkedList<Integer>();
        Set<Integer> s = new LinkedHashSet<Integer>();
        Set<Integer> temp = new LinkedHashSet<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        //modifying value at the index;
        l.set(3,8);
        System.out.println("Get value of index 3 "+ l.get(3));

        s.addAll(l);
        System.out.println("List contains 8 "+l.contains(8)+ "Set contains 8 "+s.contains(8));
        System.out.println("Modify 8 to 16 "+l.set(l.indexOf(8),16));
        temp.addAll(s);

        ListIterator<Integer> p = l.listIterator();
        while(p.hasNext()){
            Integer q = p.next();
            if(q%2 != 0) {
                //removing value in list during iteration
                p.remove();
            }
            else
                //changing value in list during iteration
               p.set(q*2);
        }
        for(Integer k:l){
            System.out.println("Array "+k);
        }
        for(Integer k:temp){
            if(k%2==0) {
               continue;
            }
            else
                s.remove(k);
        }
        for(Integer k:s){
            System.out.println(k);
        }
        Object[] y = l.toArray();
        for(int i=0;i<y.length;i++)
            System.out.println("array "+y[i]);
    }
}
