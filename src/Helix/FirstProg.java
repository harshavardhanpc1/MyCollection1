package Helix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
//Program to make all digits equal has one integer stagnent.
/**
 * Created by intelliswift on 8/12/18.
 */
public class FirstProg {
    public static void main(String[]args) {
        ArrayList<Integer> l = new ArrayList();
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(7);
        l.add(9);
        Integer count = 1;
        Integer k = 0;
        ListIterator ls;
        Integer h = Collections.max(l);
        Integer ih = l.indexOf(h);
        boolean allEqual = true;
        System.out.println(l);
        for(Integer i:l){
           if(!(i.equals(l.get(0))))
               allEqual = false;
        }
        while (allEqual == false) {
            allEqual = true;
            k = 0;
            ls = l.listIterator();
            while (ls.hasNext()) {
                Integer p = (Integer) ls.next();
                if (!(k == ih)) {
                    ls.remove();
                    ls.add(p + 1);
                }
                k++;
            }
                for(Integer i:l){
                    if(!(i.equals(l.get(0))))
                        allEqual = false;
                     }
            System.out.println(l);
            count++;
             h = Collections.max(l);
             ih = l.indexOf(h);
        }
        System.out.println(count + " "+ "Iterations");
    }
}

