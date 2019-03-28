package Amazon;

import java.util.*;

/**
 * Created by intelliswift on 2/13/19.
 */
public class FirstRecurringChar {
    public static void main(String[]args){
        String a = "acbbac";
        String b = "abcdef";
        System.out.println(recurringChar(a));
        System.out.println(recurringChar(b));
    }
    public static Character recurringChar(String s){
        Set<Character> h = new HashSet();
        char[]c = s.toCharArray();
        for(int i =0;i<c.length;i++)
            if(h.contains(c[i]))
                return c[i];
            else
                h.add(c[i]);
        return null;

    }
}
