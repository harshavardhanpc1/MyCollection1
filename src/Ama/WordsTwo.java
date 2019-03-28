package Ama;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelliswift on 2/26/19.
 */
public class WordsTwo {
    public static void main(String[]args){
        List list = new ArrayList<String>();
        List result = new ArrayList<Integer>();
        String [] r = {"cat","dog"};
        list.add("catdog");
        list.add("dogcat");
     //   String s = "dogcatcatcodecatdog";
        String s = "barfoobazbitbyte";
        for(int i=0;i < s.length()-5;i++) {
            String p = s.substring(i,i+6);
            System.out.println(p);
            if(list.contains(p)) {
                result.add(i);
            }
        }
        System.out.println(result);
    }
}
