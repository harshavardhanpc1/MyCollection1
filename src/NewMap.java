import java.util.*;

/**
 * Created by intelliswift on 4/22/18.
 */
public class NewMap {
    public static void main(String [] args){
       Map<String,Integer> map = new HashMap<String,Integer>();
        Map<String,Integer> map1 = new LinkedHashMap<String,Integer>();
       // Map<String,Integer> map1 = new TreeMap<String,Integer>();
       map.put("Harsha",1);
       map.put("Vardhan",2);
       map.put("Patnala",3);
       //Get value of key
       System.out.println(map.get("Harsha"));
       //Put value of key value
       System.out.println("Setting the value" + map.put("Patnala",4));
       System.out.println("After setting the value " + map);
       System.out.println("Contains the key Harsha " + map.containsKey("Harsha"));
       System.out.println("Contains the value 4" + map.containsValue(4));
       System.out.println("Getting all the keys " + map.keySet());
       System.out.println("Getting all the values" + map.values());
        for (Map.Entry<String,Integer> entry : map.entrySet())
            System.out.println("Key "+entry.getKey() + " Value "+entry.getValue());
        for ( String keys : map.keySet() )
            System.out.println( keys + " " + map.get(keys) );
        map1.putAll(map);
       Iterator<Map.Entry<String,Integer>> it = map1.entrySet().iterator();
       while(it.hasNext()){
           Map.Entry<String,Integer> entry = it.next();
           System.out.println("Final "+"Key "+entry.getKey() + " Value "+entry.getValue());
       }


    }
}
//HashMap : Unordered storage of element and unsorted
//HashTable : Same as HashMap but synchronized
//LinkedHashTable : Same as HashMap maining order of storage
//TreeMap : Stores elements in sorted manner.
