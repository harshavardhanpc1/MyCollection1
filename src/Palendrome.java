/**
 * Created by intelliswift on 5/7/18.
 */
public class Palendrome {
    public static void main (String[] args){
        String s = "WOWOOWOW";
        int left = 0;
        int right = s.length()-1;
        palendrome(s,left,right);
    }
    public static void palendrome(String s,int left,int right){
        while(left < right && s.charAt(left)==s.charAt(right)){
            left++;
            right--;
        }
        if(left>=right){
            System.out.println("It is palendrome");
        }
        else
            System.out.println("It is not a palendrome");
    }
}
