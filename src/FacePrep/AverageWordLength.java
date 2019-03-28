package FacePrep;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Created by intelliswift on 2/4/19.
 */
public class AverageWordLength {
    static double global_length = 0;
    static double global_count = 1;
    public static void main(String[]args){
        String j = "";
        System.out.println(averageWordLength(j));
        String k = "thi";
        System.out.println(averageWordLength(k));
        String i = "I am this's they";
        System.out.println(averageWordLength(i));
    }
    public static Double averageWordLength(String i){
        if(global_length == 0 && i == "")
            return null;
        String pattern = "^[a-zA-Z]+$";
        Double p = 0.0d;
        Double result;
        char[] a = i.toCharArray();
        int j = 0;
        while(j < a.length) {
            if (Pattern.matches(pattern, Character.toString(a[j]))) {
                p++;
            }
            j++;
        }
        result = (global_length + p)/ global_count;
        global_length  = global_length + p;
        global_count = global_count + p;
        return result;
    }
}
