package Practice;

import java.util.*;

/**
 * Created by intelliswift on 11/22/18.
 */
public class SortByValueMap {
    public static void main (String[]args){
//        Map<String,Integer> map = new HashMap();
//        map.put("Harsha",10);
//        map.put("Sowmya",10);
//        map.put("Harinya",8);
//        map.put("Ramani",9);
//        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        list.sort(Map.Entry.comparingByValue());
//
//        Map<String, Integer> result = new LinkedHashMap<>();
//        for (Map.Entry<String, Integer> entry : list) {
//            result.put(entry.getKey(), entry.getValue());
//        }
//        System.out.println(result);
        int numSteakhouses = 3;
        List<Integer> z = new ArrayList();
        z.add(10);
        z.add(20);
        z.add(30);
        List<List<Integer>>allLocations = new ArrayList<List<Integer>>();
        Map<List<Integer>, Integer> map = new HashMap<List<Integer>,Integer>();
        for(int i=0;i<allLocations.size();i++){
            List<Integer> list = allLocations.get(i);
            long dist = Math.round(Math.sqrt(Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2)));
            //    long dist = Math.round(Math.hypot(list.get(0), list.get(1)));

            map.put(list, Math.toIntExact(dist));
        }

        List<Map.Entry<List<Integer>, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<List<Integer>, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<List<Integer>, Integer> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }


        for(int i=0;i<numSteakhouses;i++){

        }



    }


}
