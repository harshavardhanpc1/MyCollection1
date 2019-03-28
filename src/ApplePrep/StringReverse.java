package ApplePrep;

import java.util.Arrays;

/**
 * Created by intelliswift on 1/15/19.
 */
public class StringReverse {
    public static void main(String args[]){
        String s = "abcde";
        char []c = s.toCharArray();
        int end = c.length-1;
        for(int i =0;i<c.length;i++) {
            if(i<= (end-i)) {
               int j = end - i;
               swap(i,j,c);
            }
        }
        String t = new String(c);
        System.out.println(t);
        for(int i =0;i<c.length;i++) {
            if(i<= (end-i)) {
                int j = end - i;
                swap(i,j,c);
            }
        }

    }
    public static void swap(int i,int j,char[] c){
        char temp;
        temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
