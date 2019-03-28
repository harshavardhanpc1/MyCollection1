package CheatSheet;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Created by intelliswift on 1/31/19.
 */
public class StringCheatSheet {
    public static void main(String []args){
       // String to Array of Character
        String a = "Harsha" ;
        System.out.print("String to Char Array ");
        char [] b = a.toCharArray();
        for(char z :b){
            System.out.print(" " + z);
        }
        System.out.println();
        //Char to String
        char c = 'A';
        String d = Character.toString(c);
        System.out.println("Char to String & lower case conversion"+d.toLowerCase());
        //Char Array to String
        String e = String.valueOf(b);
        System.out.println("Char Array to String "+e);
        String e1 = new String(b);
        System.out.println("Char Array to String "+e1);
        //Integer to String
        int f = 1234;
        String g = Integer.toString(f);
        System.out.println("Integer to String "+g);
        String g1 = String.valueOf(g);
        System.out.println("Integer to String "+g1);
        //String to Integer
        String h = "5678";
        int i = Integer.parseInt(h);
        System.out.println("String to Integer "+i);
        //Sub String of String
        String j = "Harsha";
        String k = j.substring(2,5);
        System.out.println("Sub String of "+j+" index 2 to 5: "+k);
        //Split sentence to words array
        String l = "This is great";
        String[]m = l.split(" ");
        System.out.println("Split sentence to String array: "+m[0]+" "+m[1]+" "+m[2]);
        //Split sentence to using tokenizer
        StringTokenizer m1 = new StringTokenizer(l);
        System.out.print("String tokenizer seperated for demo with | answer:");
        while(m1.hasMoreTokens()){
            System.out.print(m1.nextToken()+"|");
        }
        System.out.println();
        //String pattern match
        String pattern = "^[0-9]+";
        Character n = '1';
        System.out.println("Verifying character value is numeric: "+Pattern.matches(pattern,Character.toString(n)));
        String pattern1 = "^[a-zA-Z]+$";
        String o = "SHARSHA";
        System.out.println("Verifying string "+o+ " has only character: "+Pattern.matches(pattern1,o));
        String pattern2 = "^[a-zA-Z0-9]+$";
        String p = "HARSHA1";
        System.out.println("Verifying string "+p+ " has only alpha numeric: "+Pattern.matches(pattern2,p));
        String pattern3 = "^(HARSHA)*";
        System.out.println("Verifying string has pattern "+pattern3+ ":"+Pattern.matches(pattern3,o));
        String q = o + " " + p;
        System.out.println("Contacatinate "+ q);
        String q1 = o.concat(" ");
        q1.concat(p);
        System.out.println("Another concatinate "+q1);
        System.out.println("String comparision " + q1.compareTo(q));
        String r = "harsha1";
        System.out.println(r.equalsIgnoreCase(p));
        System.out.println(r.compareToIgnoreCase(p));
    }
}
