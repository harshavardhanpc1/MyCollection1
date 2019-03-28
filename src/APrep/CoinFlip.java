package APrep;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by intelliswift on 1/9/19.
 */
public class CoinFlip {
    public static void main(String[]args){
        HashMap<Integer,String> m = new HashMap<Integer,String>();
        for(int i=0;i<100;i++){
            if(Math.random() > 0.5){
                m.put(i,"heads");
            }
            if(Math.random() <= 0.5){
               m.put(i,"tails");
            }
        }
       Iterator p = m.entrySet().iterator();
        while(p.hasNext()){
            Map.Entry<Integer,String>k =(Map.Entry)p.next();
            if(k.getValue() == "tails") {
                //remove value in hashmap while iterating
                p.remove();
            }
        }
       // m.clear();
        try {
            int z = 1/m.size();
            int count = 1;
            int headcount = 0;
            boolean flag = true;
            Iterator<Map.Entry<Integer, String>> r = m.entrySet().iterator();
            while (r.hasNext()) {
                Map.Entry l = r.next();
                if (flag == true) {
                    flag = false;
                    continue;
                } else {
                    while (Math.random() > 0.5) {
                        count++;
                        continue;
                    }
                    count++;
                    //changing value in hashmap while iterating
                    l.setValue("tails");
                }
            }
            Iterator<Map.Entry<Integer, String>> q = m.entrySet().iterator();
            while (q.hasNext()) {
                Map.Entry k = q.next();
                System.out.println(k.getKey() + " " + k.getValue());
                headcount++;
            }
            System.out.println(count + " " + (headcount - 1));
        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}
