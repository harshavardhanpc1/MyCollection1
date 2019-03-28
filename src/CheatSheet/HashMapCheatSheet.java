package CheatSheet;

import java.util.*;

/**
 * Created by intelliswift on 2/1/19.
 */
public class HashMapCheatSheet {
    public static void main (String[]args){
        Map<String,Integer> m = new HashMap();
        Map<Integer,String>l = new LinkedHashMap();

         //Adding element to map
        m.put("Harsha",2);
        m.put("Vardhan",10);
        m.put("Vardhan",3);
        m.put("Patnalac",5);
        m.put(null,null);
        //No duplicate key and one null allowed with linked and hash maps
        System.out.println("Printing map before removal "+m);
        //Getting the element based on key
        System.out.println("value of key Harsha " +m.get("Harsha"));
        //Removing a key based on key
        System.out.println(m.remove("Harsha"));
        System.out.println("Printing map after removal"+m);
        l.put(2,"Zebra");
        l.put(4,"Patnalac");
        l.put(3,"Vardhan");
        System.out.println("Insertion order maintained in linked hash map "+l);
        //Check whether map contains key
        System.out.println("Whether map contains key "+m.containsKey("Vardhan"));
        //Check whether map contains value
        System.out.println("Whether map contains key "+m.containsValue(3));
        //To get the set of keys present in map
        Set<String>keyset =  m.keySet();
        System.out.println("Set of keys in map "+keyset);
        //To get the List of keys present in map
        List<String> listkey = new ArrayList<String>(m.keySet());
        System.out.println("List of keys in map "+listkey);
        //To get the list of values present in map
        List<Integer> listvalue = new ArrayList<Integer>(m.values());
        System.out.println("List of values in map "+listvalue);
        //To get the list of map.entry in map
        List<Map.Entry>listmapentry = new ArrayList<Map.Entry>(m.entrySet());
        System.out.println("List of mapentry values in map key value index 2 "+listmapentry.get(2).getKey()+" "+listmapentry.get(2).getValue());
        //Sort based on key.Entries are taken in sorted manner;
        Map<Integer,String>t = new TreeMap(l);
        System.out.println("Sorted hashmap entries by key"+t);
        //Iteration through the map using for each
        for(Map.Entry a:m.entrySet()){
            System.out.println(a.getKey()+" "+a.getValue());
        }


        //Iteration using itarator
       Iterator<Map.Entry<Integer, String>> h = t.entrySet().iterator();
        while(h.hasNext()){
            if(h.next().getKey()==2)
                h.remove();
        }
System.out.println("After removal of key 2=Zebra"+t);
        //Append map to map
        Map<Integer,String>l1 = new LinkedHashMap();
        l1.put(12,"Tiger");
        l1.put(4,"Cat");
        t.putAll(l1);
        System.out.println("Appending map to map"+t);
        //Modify  value of key and removing key while iterating(only these two are permitted)
        for(Map.Entry a:m.entrySet()){
            if(a.getKey()=="Patnalac")
                m.put("Patnalac",10);
            System.out.println(a.getKey()+" "+a.getValue());
            Integer g = 3;
            if(a.getValue()== g)
                m.remove(a.getKey());
        }
        System.out.println("After modification"+m);

        //***************************************
//    Collections.sort(listmapentry,new Comparator<Map.Entry<String, Integer>>() {
////            public int compare(Map.Entry<String, Integer> o1,
////                               Map.Entry<String, Integer> o2)
////            {
////                return (o1.getValue()).compareTo(o2.getValue());
////            }
////        });
////        Map<String, Integer> m1 = new LinkedHashMap();
//        for(Map.Entry d:listmapentry){
//            m1.put((String)d.getKey(),(Integer)d.getValue());
//        }
//        System.out.println("Map sorted by value "+m1);
        //  ***************************
    }
}
