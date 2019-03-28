package CheatSheet;

import java.util.*;

/**
 * Created by intelliswift on 2/1/19.
 */
public class SetCheatSheet {
    public static void main(String[]args){
        Set<Integer> s = new HashSet<Integer>();
        Set<Integer> l = new LinkedHashSet<Integer>();
        Set<Integer> t = new TreeSet<Integer>();
        //adding the elements in the set.No duplicates allowed.
        System.out.println("adding element "+s.add(10));
          s.add(50);
          s.add(30);
          System.out.println("adding duplicate element "+s.add(10));
          s.add(40);
          System.out.println("all elements in set"+s);
        //No get .If you need element you need to iterate.
        //No modification nothing
         s.remove(50);
        System.out.println("all elements in set "+s);
        //Linked Hash Set
        l.add(10);
        l.add(50);
        l.add(40);
        System.out.println("all order elements in linked hash set "+l);
        //Tree Set
        t.addAll(s);
        System.out.println("all sort elements in tree set "+t);
        //Iteration using for each
        for(int i:s){
            System.out.println(i);
        }
        //Iteration using Iterator & remove while iteration
        Iterator<Integer>i = s.iterator();
        while(i.hasNext()){
            Integer j = 10;
            if(i.next() == j){
              i.remove();
            }
            //Another i.next() in loop result in next element
        }
        System.out.println();
        System.out.println("all elements in tree set after removal "+s);
        //conversion of set to list and list to set in list page
    }
}
