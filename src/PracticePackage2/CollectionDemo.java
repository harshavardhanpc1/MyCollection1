package PracticePackage2;

import java.util.*;

/**
 * Created by intelliswift on 9/18/18.
 */
public class CollectionDemo {
    public static void main(String[]args){
        ArrayList<Integer> list = new<Integer> ArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.get(2));
        System.out.println(list.contains(50));
        for(int i:list)
        {
            System.out.println(i);
        }


       Map<Integer,String>map = new<Integer,String>HashMap();
        map.put(1,"Harsha");
        map.put(2,"Vardhan");
        map.put(3,"Sowmya");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+ m.getValue());
        }
    }
}
