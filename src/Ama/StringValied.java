package Ama;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by intelliswift on 1/30/19.
 */
public class StringValied {
    public static void main (String[]args){
        String s = "aabbc";
            if(isValied(s)){
            System.out.println("String is valied");
        }
        else
            System.out.println("String invalied");
    }
    public static boolean isValied(String s){
        char [] c = s.toCharArray();
        Map<Character,Integer> m = new HashMap();
        Map<Integer,Integer> n = new HashMap();
        for(char d:c){
            if(m.containsKey(d)){
                m.put(d,m.get(d)+1);
            }
            else
                m.put(d,1);
        }
        for(Map.Entry me:m.entrySet()){
            Integer z = ((Integer)me.getValue());
            if(n.containsKey(z)){
                n.put(z,n.get(z)+1);
            }
            else
                n.put(z,1);
        }
        if(n.size() < 3 && n.keySet().contains(1) && n.get(1) == 1){
            return true;
        }
        else if(n.size() < 3 && n.values().contains(1)){
           Integer[]j = n.keySet().toArray(new Integer[0]);
           if( Math.abs(j[0] - j[1]) ==1)
           {
               return true;
           }
        }
            return false;

    }
}
