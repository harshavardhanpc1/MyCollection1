package Amazon;

/**
 * Created by intelliswift on 2/8/19.
 */
public class StringBuddy {
        public static void main (String[]args){
            System.out.println(buddyStrings("aa","aa"));
        }

    public static boolean buddyStrings(String A, String B) {
        char[]a = A.toCharArray();
        char[]b = B.toCharArray();
        int count = 0;
        int prev = -1;
        int curr = -1;
        if (a.length != b.length || a.length==0 && b.length==0)
            return false;
        if (A.compareTo(B) == 0) {
            int[] count2 = new int[26];
            for (int i = 0; i < A.length(); ++i) {
                System.out.println(A.charAt(i) - 'a');
                count2[A.charAt(i) - 'a']++;
            }
                for (int c : count2)
                    if (c > 1) return true;
                return false;
            }
        if(a.length == b.length && a.length!=0 && b.length!=0){
            for(int i=0;i<a.length;i++)
            {
                if(a[i]!=b[i]){
                    count++;
                     if(count>2)
                        return false;
                    else{
                        prev = curr;
                        curr = i;
                    }
                }
            }
            return (count == 2 && a[prev]==b[curr] && a[curr]==b[prev]);
        }
        return false;
    }
}
