package Amazon;


import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by intelliswift on 2/28/19.
 */
public class StringPadding {
    public static void main(String[]args){
        String s = "this is a great place to work ";
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split(" ")));
        String[] stri = screenFitting(10,myList);
        for(int i =0;i<stri.length;i++)
        System.out.println(stri[i]);
    }
    public static String[] screenFitting(int screenLen,List<String> list){
        String [] fixedLenList = new String[5];
        int j = 0;
        for(String s:list) {
            if (fixedLenList[j] == null) {
                if (s.length() < screenLen) {
                    fixedLenList[j] = s+" ";
                }
            } else if (list.get(j) != null) {
                int temp = fixedLenList[j].length();
                if (screenLen >= (temp + s.length()+1)) {
                    fixedLenList[j] = fixedLenList[j].concat(s+" ");
                } else {
                    if(fixedLenList[j].length() < screenLen){

                    }
                    j++;
                    if (s.length() < screenLen) {
                        fixedLenList[j] = s+" ";
                    }
                }
            }
        }

        for(int i =0;i<fixedLenList.length;i++){
            int start = 0;
            int end = 0;
            while(fixedLenList[i].length()%screenLen!=0){
                start = fixedLenList[i].length();
                end = start;
                fixedLenList[i].concat(" ");
                end ++;
            }
            while (start > 0 && fixedLenList[i].charAt((start-1) % screenLen) != ' ') {
                start--;
            }


            }

        return fixedLenList;
    }
}
