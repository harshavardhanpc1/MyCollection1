package Bi;

import java.util.Stack;

///**
// * Created by intelliswift on 8/27/18.
//*/
public class BalancedBraces {
    public static char [][] open = {{'{','}'},{'(',')'},{'[',']'}};
    public static void main(String[]args){
        String s = "{[()]}";
      System.out.println(validBraces(s));
    }
    public static boolean checkOpen (char p) {
        for (char [] c : open) {
            if (c[0] == p) {
                return true;
            }
        }
        return false;
    }

    public static boolean match (char p,char q){
        for(char [] c:open){
            if(c[0] == p){
                return (c[1]==q);
            }
        }
        return false;
    }

    public static boolean validBraces(String s){
        Stack<Character> st = new Stack<Character>();
        char [] c = s.toCharArray();
        for(char t : c){
            if(checkOpen(t)){
                st.push(t);
            }
            else
            {
              if(st.isEmpty() || !match(st.pop(),t))
                  return false;
            }
        }
        return st.isEmpty();
    }


}
