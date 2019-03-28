import java.util.*;

/**
 * Created by intelliswift on 4/22/18.
 */
public class NewSet {
    public static void main(String [] args){
        Set s = new HashSet();
        Set<String> t = new TreeSet<String>();
        Set l = new LinkedHashSet();
        s.add("Harsha");
        s.add("Vardhan");
        s.add("Harsha");
        s.add("Patnala");
        t.addAll(s);
        l.add("Harsha");
        l.add("Vardhan");
        l.add("Patnala");
        System.out.println("HashSet" + s);
        System.out.println("TreeSet" + t);
        System.out.println("LinkeHashSet" + l);
        System.out.println("contains method " + l.contains("harsha"));
        s.remove("Patnala");
        Iterator it = s.iterator();
        while(it.hasNext())
        {
          System.out.println("Iterator in Set " + it.next());
        }
        for(String i: t)
        {
            System.out.println("For each in Set " + i);
        }
    }
}
