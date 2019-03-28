package PracticePackage;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by intelliswift on 7/31/18.
 */
public class CountRepeatedChar {
    public static void main(String[]args) {
        String p = "ABACRDGA";
        HashMap<Character,Integer> map = new<Character,Integer> HashMap();
        for(int i=0;i<p.length();i++)
        {
            char l = p.charAt(i);
            if(map.containsKey(l))
            {
               int q = map.get(l);
               q++;
               map.put(l,q);
            }
            else
            {
                map.put(l,1);
            }
        }
        for(Map.Entry<Character,Integer> m1: map.entrySet())
        {
           if(m1.getKey() > 1)
           {
               System.out.println(m1.getKey() +" "+ m1.getValue());
           }
        }
    }

}
