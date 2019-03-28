package ApplePrep;

import java.util.HashSet;

/**
 * Created by intelliswift on 1/11/19.
 */
public class LongestSubString {
    public static void main(String[]args){
        String s = "pwwkew";
        int k = 0;
        char []c = s.toCharArray();
        HashSet<Character>hs = new HashSet<Character>();
        int maxCount = 0;
        for(int i=0;i<c.length;i++)
        {
            char z = c[i];
            if(!hs.contains(z)) {
                hs.add(c[i]);
                maxCount = Math.max(hs.size(),maxCount);
            }
            else
                while(k<i) {
                    if (c[k] == z) {
                        hs.add(z);
                        k++;
                        break;
                    } else {
                        hs.remove(c[k]);
                        k++;
                    }
                }
        }
        System.out.println("Maxcount "+maxCount);
    }
}
