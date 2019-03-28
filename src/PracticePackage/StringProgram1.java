package PracticePackage;

/**
 * Created by intelliswift on 10/13/18.
 */
public class StringProgram1 {
    public static void main (String[]args){
      String [] strs = {"leet","leetcode","lee","leets"};
      if(strs == null || strs.length == 0){
          System.out.println("");
      }
      System.out.println(largestPrefix(strs,0,strs.length));

    }
    public static String largestPrefix(String[] strs,int l,int r){
        if(l == r)
            return strs[l];
        else {
            int mid = (l + r) / 2;
            String lcpleft = largestPrefix(strs, l, mid - 1);
            String lcpright = largestPrefix(strs, mid + 1, r);
            return devideLargestPrefix(lcpleft,lcpright);
        }
    }

    public static String devideLargestPrefix(String left,String right){
           int min = Math.min(left.length(),right.length());
           for(int i=0;i<min;i++) {
               if (left.charAt(i) != right.charAt(i))
                   return left.substring(0, i);
           }
    return left.substring(0, min);
    }
}
