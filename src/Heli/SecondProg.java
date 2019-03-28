package Heli;

/**
 * Created by intelliswift on 8/12/18.
 */

//Braces close YES braces not close NO
public class SecondProg {
    public static void main(String[]args){
       boolean first = true;
       boolean second = true;
       boolean third = true;
       String [] s1 = { "{}[]()","{[}]","{[}"};
       String [] s2 = s1;
       Integer j = 0;
       for (String s:s1){
           Integer i = 0;
           while(i<s.length())
           {
              if (s.charAt(i) == '{' )
                  first = false;
              else if ( s.charAt(i) == '(' )
                  second = false;
              else if (  s.charAt(i) == '[')
                  third = false;
              else if (s.charAt(i) == '}' )
                  first = true;
              else if ( s.charAt(i) == ')')
                  second = true;
              else if (s.charAt(i) == ']')
                  third = true;
           i++;
           }

           if(first && second && third)
              // System.out.println("YES");
               s2[j] = "YES";
           else
               s2[j] = "NO";
               //System.out.println("NO");

           j++;
       }
       for(String s:s2){
           System.out.println(s);
       }
    }
}
