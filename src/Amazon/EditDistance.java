package Amazon;

import static jdk.nashorn.internal.objects.NativeMath.min;

/**
 * Created by intelliswift on 2/27/19.
 */
public class EditDistance {

    public static void main(String args[]){
        String str1 = "abcddfdffg";
        String str2 = "aghik";
        EditDistance editDistance = new EditDistance();
        int result = editDistance.recEditDistance(str1.toCharArray(), str2.toCharArray(),0,0);
        System.out.print(result);
    }

    public static int recEditDistance(char[]  str1, char str2[], int len1,int len2){

        if(len1 == str1.length){
            return str2.length - len2;
        }
        if(len2 == str2.length){
            return str1.length - len1;
        }
        return min((recEditDistance(str1, str2, len1 + 1, len2 + 1) + str1[len1] == str2[len2] ? 0 : 1), recEditDistance(str1, str2, len1, len2 + 1) + 1, recEditDistance(str1, str2, len1 + 1, len2) + 1);
    }
    private static int min(int a,int b, int c){
        int l = Math.min(a, b);
        return Math.min(l, c);
    }
}
