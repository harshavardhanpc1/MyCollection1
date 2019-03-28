package APrep;

import java.util.*;

/**
 * Created by intelliswift on 1/3/19.
 */
//length of longest substring until repeated character
//1)Get the hashmap of subtring 2)Get max count and display.
public class SubStringLongest {
    public static void main(String[]args){
        //Take up a string
         String s = "aab";
         int maxcount = 0;
         int k = 0;
        //Take up a hashSet
        //Stack p = new Stack();
         Set p = new HashSet();
        //loop through the string
        char[] q = s.toCharArray();
         for(int i=0;i<q.length;i++) {
             char c = q[i];
             if (!p.contains(c)){
                 p.add(c);
                 maxcount = Math.max(maxcount,p.size());
             } else {
                 while(k<i) {
                     if (s.charAt(k) == c) {
                         p.add(c);
                         k++;
                         break;
                     } else {
                         p.remove(s.charAt(k));
                         k++;
                     }
                 }
             }
         }
        System.out.println(maxcount);
    }
}
