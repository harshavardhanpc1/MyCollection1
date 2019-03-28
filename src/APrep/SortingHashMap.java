package APrep;

import java.util.*;

/**
 * Created by intelliswift on 1/9/19.
 */
public class SortingHashMap {
    public static void main(String[]args){
        HashMap<String,Integer>hm = new HashMap<String,Integer>();
        hm.put("English",10);
        hm.put("Maths",10);
        hm.put("Social",19);
        hm.put("Science",15);
        for(Map.Entry<String,Integer>m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println(hm.entrySet());
        Map<String,Integer>hm1 = sortHashByValue(hm);
        Iterator<Map.Entry<String,Integer>>z = hm1.entrySet().iterator();
        while(z.hasNext()){
           Map.Entry<String,Integer>o = z.next();
           System.out.println(o.getKey()+" "+o.getValue());
        }
        System.out.println(hm1.entrySet());
        Map<String,Integer>q = sortHashByKey(hm);
        System.out.println(q.entrySet());
        System.out.println(q.keySet());
        Set<String>s = new HashSet(q.keySet());
        for(String j : s){
            System.out.print(j+" ");
        }
        List<Integer>l = new ArrayList(q.values());
        for(Integer j : l){
            System.out.print(j+" ");
        }
        System.out.println();
        Set<Integer>se = new HashSet(q.values());
        for(Integer j : se){
            System.out.print(j+" ");
        }
    }
    public static Map<String,Integer>sortHashByValue(HashMap<String,Integer>hm){
        Map<String,Integer> temp = new LinkedHashMap<String,Integer>();
        //Conversion of map to list
        LinkedList<Map.Entry<String,Integer>> l = new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
        Collections.sort(l, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
            }
        });
        //Adding list to map
        for(Map.Entry<String,Integer>m:l){
            temp.put(m.getKey(),m.getValue());
        }
        return temp;
    }
    public static Map<String,Integer>sortHashByKey(HashMap<String,Integer>hm){
        Map<String,Integer>temp = new TreeMap();
        temp.putAll(hm);
        return temp;
    }
}
