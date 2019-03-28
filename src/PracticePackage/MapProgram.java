package PracticePackage;

import java.util.*;

/**
 * Created by intelliswift on 8/10/18.
 */
public class MapProgram {
    public static void main(String[]args){
        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(1,"One");
        m.put(2,"Two");
        m.put(3,"Three");
        for(Map.Entry m1:m.entrySet()){
            System.out.println("Final2 "+"Key "+m1.getKey() + " Value "+m1.getValue());
        }
        Set<String> s1 = new HashSet();
        s1.add("this");
        s1.add("that");
        s1.add("that");
        s1.add("great");
        for(String s:s1){
            System.out.println(s);
        }
        List<String> s2 = new ArrayList();
        s2.add("thos");
        s2.add("thos");
        s2.add("these");
        s2.add("great");
        Iterator i1 = s2.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
