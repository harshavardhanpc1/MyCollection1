package ApplePrep;

import java.util.*;

/**
 * Created by intelliswift on 2/5/19.
 */
public class SubDomain {
    public static void main(String[]args){
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        List l = subdomainVisits(cpdomains);
        System.out.println(l);
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer>map = new LinkedHashMap();
        List<String>l = new LinkedList<String>();
        String key = "";
        for(int i=0;i<cpdomains.length;i++){
            String [] temp  = cpdomains[i].split(" ");
            Integer value = Integer.valueOf(temp[0]);
            String[]temp1 = temp[1].split("\\.");
            for(int j = 0;j < temp1.length;j++){
                for(int k = j;k<temp1.length;k++){
                    if(k==temp1.length-1)
                    key = key.concat(temp1[k]);
                    else
                        key = key.concat(temp1[k] + ".");
                }
                if(!map.containsKey(key)){
                    map.put(key,value);
                }
                else
                    map.put(key,(map.get(key)+value));
                key = "";
            }
            key = "";
        }
      for(Map.Entry m: map.entrySet()){
            l.add(m.getValue()+" "+m.getKey());
      }
      return l;
    }
}
