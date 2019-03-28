package PracticePackage;

/**
 * Created by intelliswift on 10/8/18.
 */
public class StringMethods {
    public static void main(String[]args){
        String [] s = {"leet","leet","leet","leetc"};
        String prefix = longestCommonPrefix(s);
        System.out.println(prefix);
        System.out.println(s[3].substring(0,3));
        System.out.println(s[3].indexOf("etc"));
}
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
