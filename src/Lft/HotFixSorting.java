package Lft;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.regex.Pattern;

/**
 * Created by Harsha on 8/10/18.
 */
public class HotFixSorting {
    public static void main(String[]args){
        ArrayList<String> unsorted = new ArrayList<String>();
        ArrayList<String> sorted = new ArrayList<String>();
        unsorted.add("1.1.1");
        unsorted.add("3.5.1.2");
        unsorted.add("1.1.1.3.25");
        unsorted.add("1.1.1.3.25.10");
        unsorted.add("3.5.1");
        for(String s1:unsorted){
            sort(sorted,s1);
        }
        System.out.println(sorted);

    }
    public static void sort(ArrayList<String>sorted,String s) {
        if (sorted.size() == 0) {
            sorted.add(s);
            return;
        }
        String[] sArray = s.split(Pattern.quote("."));
        ListIterator ls = sorted.listIterator();
        while (ls.hasNext()) {
            String temp = (String) ls.next();
            String[] tempArray = temp.split(Pattern.quote("."));
            for (int i = 0; i < tempArray.length; i++) {
                if (i < sArray.length && Integer.parseInt(tempArray[i]) < Integer.parseInt(sArray[i]) ) {
                    break;
                } else if (i < sArray.length && Integer.parseInt(tempArray[i]) == Integer.parseInt(sArray[i]) ) {
                    continue;
                } else if (i == sArray.length || Integer.parseInt(tempArray[i]) > Integer.parseInt(sArray[i])  ) {
                    ls.previous();
                    ls.add(s);
                    return;
                }
            }
        }
        if(ls.hasNext() == false){
            ls.add(s);
            return;
        }
    }
}

