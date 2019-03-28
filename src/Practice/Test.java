package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by intelliswift on 11/27/18.
 */
public class Test {
    public static void main (String [] args){
        System.out.println(String.format("insert into table %1$s.%2$s values ('%3$s','%4$s',%5$s, '%6$s','%7$s','%8$s', %9$s )", "that", "this", "lp_v2","validation","1542221510","V","2018-11-14","2018-11-14 12:05:54.499","1"));
        List<Integer> l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator i = l.listIterator();
        if(i.hasNext()){
            System.out.println(i.next());
        }
        else
            System.out.println("no values");
    }
}
