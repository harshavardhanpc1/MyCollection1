package ApplePrep;

import java.util.*;

/**
 * Created by intelliswift on 1/9/19.
 */
public class ConversionOfArrayListSet {
    public static void main(String[]args){
        String[]a = {"fa","tb","c","d","d"};
        //Array to List
        List<String> l = Arrays.asList(a);
        for(String b:l){
            System.out.print(b+" ");
        }
        System.out.println();
        //List to set
       Set<String> s = new LinkedHashSet(l);
        for(String b:s){
            System.out.print(b+" ");
        }
        System.out.println();
        //Set to list
        List<String>p = new ArrayList(s);
        p.addAll(l);
        for(String b:p){
            System.out.print(b+" ");
        }
        System.out.println();
        Set<String> s1 = new LinkedHashSet();
        s1.add("zebra");
        s1.addAll(p);
        for(String b:s1){
            System.out.print(b+" ");
        }


    }
}
