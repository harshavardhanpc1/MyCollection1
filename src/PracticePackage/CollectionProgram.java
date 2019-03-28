package PracticePackage;

import java.util.*;

/**
 * Created by intelliswift on 7/28/18.
 */
public class CollectionProgram {
    public static void main(String[]args){
        //Simple list demo
        //adding in list
        ArrayList<String>l1 = new ArrayList<String>();
        List<Movies>m4 = new ArrayList<Movies>();
        l1.add("the");
        l1.add("great");
        l1.add("paek");
        l1.add("the everest");
        l1.add("paek");
        l1.set(1,"Harsha");
        l1.remove("paek");
        System.out.println("got it " +l1.get(0));

        System.out.println(l1);
        Collections.sort(l1);
        System.out.println("after sort "+l1);


        //List iterator
        ListIterator ilist = l1.listIterator();
        System.out.println("list iterator");
        while(ilist.hasNext()){
            //System.out.println(ilist.next());
            if (ilist.next() == "the everest")
            ilist.add("greatandhra");
        }

        for(String s12: l1)
        {
            System.out.println("For each: "+s12);
        }


        m4.add(new Movies("Harsha",3));
        m4.add(new Movies("Vardhan",2));
        m4.add(new Movies("Harsha",2));
        for(Movies O:m4){
           System.out.println("List "+O.name + " " + O.rating);
        }
        Collections.sort(m4);
        for(Movies O:m4){
            System.out.println("List2 "+O.name + " " + O.rating);
        }

        Set<Movies>s2 = new HashSet<Movies>();
        s2.add(new Movies("Harsha",3));
        s2.add(new Movies("Vardhan",2));
        s2.add(new Movies("Harsha",2));
        Movies mw = new Movies("Harsha",3);
        Movies mw1 = new Movies("Harsha",4);

        if(mw.equals(mw1))
        {
            System.out.println("Trues all");
        }

        for(Movies O:s2){
            System.out.println("Set2 "+O.name + " " + O.rating);
        }

        //adding in set
        Set s1 = new HashSet();
        s1.add("the");
        s1.add("great");
        s1.add("paek");
        s1.add("the everest");
        s1.add("paek");
        s1.remove("the");
        System.out.println("contains "+s1.contains("the everest"));
        System.out.println(s1);
        System.out.println("after sort "+s1);
        //Set Iterator
        System.out.println("set iterator");
        Iterator slist = s1.iterator();
        while(slist.hasNext()){
            System.out.println(slist.next());
        }
        //adding in map
        Map<Integer,String> m1 = new HashMap<Integer,String>();
        m1.put(1,"the");
        m1.put(1,"the");
        m1.put(1,"this");
        m1.put(2,"mapper");
        m1.put(3,"demo");
        m1.put(4,"harsha");
        m1.replace(2,"map");
        m1.remove(3);
        System.out.println(m1);
        System.out.println("get the value"+m1.get(1));
        //Map iterator1
        Iterator<Map.Entry<Integer,String>> mlist = m1.entrySet().iterator();
        while(mlist.hasNext()){
            Map.Entry<Integer,String> entry = mlist.next();
            System.out.println("Final "+"Key "+entry.getKey() + " Value "+entry.getValue());
        }
        //Map iterator2
        for(Map.Entry m:m1.entrySet()){
            System.out.println("Final2 "+"Key "+m.getKey() + " Value "+m.getValue());
        }

    }
}
