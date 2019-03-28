package PracticePackage;

/**
 * Created by intelliswift on 10/6/18.
 */
public class LargestCommonPrefix {
    public static void main (String [] args){
        String [] s = {"leetcode","leet","lee"};
        String prefix = longestCommonPrefix(s);
        System.out.println(prefix);
    }
    public static String longestCommonPrefix1(String[] strs) {
        int prefix = 0;
        int p = 0;
        if(strs.length > 1){
            for(int i=0;i<strs.length-1;i++){
                p = 0;
                for(int j=0;j< strs[i].length() && j < strs[i+1].length();j++) {
                    if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                        p++;
                        continue;
                    }
                    else if (prefix == 0 || p < prefix)
                        prefix = p;
                    break;
                }
            }
        }
        if(prefix == 0 && strs.length == 0 || prefix == 0 && strs.length > 1 )
            return("");
        else if (prefix == 0 && strs.length == 1){
            return(strs[0].substring(0,1));
        }
        else
            return(strs[0].substring(0,prefix));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].contains(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
    }
