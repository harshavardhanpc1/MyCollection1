/**
 * Created by intelliswift on 5/7/18.
 */
public class LongestPlandrome {
    public static void main (String[] args){
        String s = "WOWOOWOK";
        int left = 0;
       int right = s.length()-1;
        int start = 0;
        int end = 0;
        palendrome(s,left,right);
        for (int i=0;i < s.length();i++)
        {
          int len1  = longpalendrome(s,i,i);
          int len2 = longpalendrome(s,i,i+1);
          int len = Math.max(len1,len2);
          if (len > (end-start)){
              start = i - ((len-1)/2);
              end = i + (len/2);
          }

        }

        System.out.println("Palendrome sub string " + s.substring(start, end + 1));
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

    public static int longpalendrome(String s,int left,int right){
        while(left >= 0 && right < s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }


}
