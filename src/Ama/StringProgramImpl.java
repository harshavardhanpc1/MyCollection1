package Ama;//Program for removing underscore from STRING and creating whole number
/**
 * Created on 5/15/18.
 */

public class StringProgramImpl {
    static int q = 0;
    String s;
    public StringProgramImpl(String s){
        this.s = s;
        while(q < s.length())
        {
            Integer t = removingUnderScore(s);
            Integer u = removingUnderScore(s);
            Integer v = removingUnderScore(s);
            System.out.println(t+" "+u+"/"+v);
        }
    }
    public static void main(String []args) {
        String s = "123_234_5_7_8_9_13";
        new StringProgramImpl(s);
    }
//    public static int removingUnderScore(String s){
//        String t = s.replaceAll("_","");
//        Integer i = Integer.parseInt(t);
//        return i;
//    }
    public static int removingUnderScore(String s){
        int i = q;
        int k = 0;
        while (i < s.length())
        {
            String t = Character.toString(s.charAt(i));
            if(t.matches(".*[0-9].*"))
            {
            int p = Integer.parseInt(Character.toString(s.charAt(i)));
            k = k*10 + p;
            i++;
            q = i;
            break;
            }
            i++;
        }
        return k;
    }
}
