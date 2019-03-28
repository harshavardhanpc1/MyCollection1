package Amazon;

/**
 * Created by intelliswift on 2/27/19.
 */
public class StringRotation {
    public static void main(String[]args){
     System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String A, String B) {
        String temp = "";
        if(A=="" && B =="")
            return true;
        for(int i=0;i<A.length();i++)
        {
            if(i == 0)
                temp = A.charAt(A.length()-1) + A.substring(0,A.length()-1);
            else
                temp = temp.charAt(temp.length()-1) + temp.substring(0,temp.length()-1);
            if(temp.equals(B)) {
                System.out.println("number of rotations " + i);
                return true;
            }
        }
        return false;
    }
}
