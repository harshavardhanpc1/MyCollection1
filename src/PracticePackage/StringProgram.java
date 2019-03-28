package PracticePackage;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Created by intelliswift on 7/25/18.
 */
public class StringProgram {
    public static void main (String[]args){
        //Functions on string
        String s = "This is first string";
        String l = "";
        System.out.println("is empty "+l.isEmpty());
        String t = "What is this";
        String p = "there is nothing";
        String q = new String("What is this");
        System.out.println(q.indexOf("is"));
        String k = s.concat(t);
        System.out.println("concat"+k);
//Difference between equals and ==
        System.out.println("compares values"+t.equals(q));
        System.out.println("compares objects"+t == q);
        System.out.println(t.equals("What is this"));
        System.out.println(s.length());
        System.out.println(s.toLowerCase());
        System.out.println(s.replace('i','z'));
        System.out.println(s.substring(2,6));
//To ways to split
        String [] token = s.split(" ");
        for(String o:token)
            System.out.println(o);

        StringTokenizer token2 = new StringTokenizer(s," ");
        while(token2.hasMoreTokens()) {
            System.out.println(token2.nextToken());
        }

        String st = "sdfffgfg1";
        String num = "1234";
        String pattern = "^[a-z]+[0-9]+";
        String pattern1 ="^[0-9]+";
        System.out.println(Pattern.matches(pattern,st));
        System.out.println(Pattern.matches(pattern1,num));

        StringBuilder sb = new StringBuilder("This is great");
        sb.append("surprise");
        sb.replace(5,6,"the");
        System.out.println(sb);
        sb.delete(0,3);
        System.out.println(sb);
        //sb.reverse();
        System.out.println(sb);
        System.out.println(sb.indexOf("great"));
    }
}
