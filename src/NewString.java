import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

/**
 * Created by intelliswift on 4/23/18.
 */

//Java String class provides a lot of methods to perform operations on string such as compare(),
//concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring(),charAt()
public class NewString {
    public static void main(String [] args){
        String s = "This a great 1, place";
        String t = "This a great 1 place";
        String k = new String("This a great 1 place");
        System.out.println("The length of string "+ s.length());
        System.out.println("The substring "+s.substring(1,4));
        System.out.println("The string compare  "+s.compareTo(t));
        System.out.println("The string equal "+s.equals(t));
        System.out.println("The string equal "+s.equalsIgnoreCase(k));
        System.out.println("Ths string is empty " + s.isEmpty());
        System.out.println("The string concat "+s.concat(" ").concat(t));
        System.out.println("The string replace " +s.replace("This","this") + " " + s);
        System.out.println("The charAt third" + s.charAt(3));

        String[] tokens = s.split(" ");
        System.out.println(Arrays.toString(tokens));
        for (String p:tokens)
            System.out.println(p);
        System.out.println(s == t);
        System.out.println(s == k);
        //String tokenizer
        StringTokenizer p = new StringTokenizer(s,",");
        while(p.hasMoreTokens()){
            System.out.println("token " + p.nextToken());
        }
        //StringBuffer is synchronized
        StringBuilder sb = new StringBuilder("This is a great story");
        sb.ensureCapacity(2);
        sb.append(" not");
        System.out.println("reverse" + sb.reverse());
        System.out.println(sb.reverse().replace(0,4,"The"));
        System.out.println(sb.insert(4,"The "));
        System.out.println(sb.length());
        System.out.println("Index not present" + sb.indexOf("z") + "index present" + sb.indexOf("The") + sb.indexOf("The",3) );
        System.out.println("Delete "+sb.delete(0,3));
        Boolean q = "556".matches(".*[0-9].*");
        System.out.println(q);
    }
}
//equals is overidden by string to compare values of string. == is used to compare references of the string.