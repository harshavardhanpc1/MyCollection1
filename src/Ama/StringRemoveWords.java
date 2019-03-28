package Ama;

/**
 * Created by intelliswift on 1/29/19.
 */
public class StringRemoveWords {
    public static void main(String[]args){
       System.out.println(alternatingCharacters("BABABA"));
    }

   public static int alternatingCharacters(String s) {
        String t = "";
        char[]c = s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(i==0)
                t = Character.toString(s.charAt(i));
            else if(s.charAt(i-1) != s.charAt(i)){
                t = t + Character.toString(s.charAt(i));
            }
        }
        System.out.println(t);
        return (s.length() - (t.length()));
    }
}
