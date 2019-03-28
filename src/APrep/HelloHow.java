package APrep;

import java.util.*;

/**
 * Created by intelliswift on 2/25/19.
 */
public class HelloHow {
    public static void main(String[]args){
        String t = "hello you is is hello is you";
        HashMap<String,Integer>m = new HashMap();
        List<Integer>list = new ArrayList();
        int distance = 0;
        m.put("hello",0);
        m.put("you",0);
        String[]a = t.split(" ");
        for(String p:a){
            if(m.containsKey(p))
            {
                if(m.get(p) == 0) {
                    if(m.containsValue(1)) {
                        list.add(distance);
                        for(Map.Entry<String,Integer>e: m.entrySet()){
                            if(e.getValue() == 1) {
                                m.put(e.getKey(), 0);
                            }
                        }
                        distance = 1;
                    }
                    m.put(p, 1);
                    distance++;
                }
                else if (m.get(p) == 1){
                    m.put(p,1);
                    distance = 1;
                }
            }
            else if(m.containsValue(1)){
                distance++;
            }
        }
        System.out.println(Collections.min(list));
    }
}
