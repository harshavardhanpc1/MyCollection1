package APrep;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by intelliswift on 2/5/19.
 */
public class FirstUniqueChar {
    public static void main(String[]args){
       System.out.println(firstUniqChar("cc"));
    }
    public static int firstUniqChar(String s) {
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        if(s==""){
            return -1;}
        char[]c = s.toCharArray();
        for(int i = 0;i<c.length;i++){
            if(!map.containsKey(c[i])){
                map.put(c[i],1);
            }
            else
                map.put(c[i],map.get(c[i])+1);
        }
        if(map.containsValue(1))
        {
            for(Map.Entry m:map.entrySet()){
                if((Integer)m.getValue() == 1)
                {
                    return (Character)m.getKey();
                }
            }
        }
            return 0;
    }
}
