package PracticePackage;

import java.util.ArrayList;

/**
 * Created by intelliswift on 8/25/18.
 */
public class PayPalSharing {
    public static void main(String[]args){
        String s = "PAYPALISHIRING";
        StringBuffer t = new StringBuffer();
        int row = 5;
        boolean even = true;
        ArrayList<String> list = new ArrayList();
        int i = 0;
        for(int j=0;j<s.length();j++){
            if(even == true) {
                if(list.size() < row)
                    list.add(Character.toString(s.charAt(j)));
                else
                    list.set(i,list.get(i).concat(Character.toString(s.charAt(j))));
                i++;
            }
            else {
                list.set(i, list.get(i).concat(Character.toString(s.charAt(j))));
                i = --i;
            }
            if(i == row)
            {
                even = false;
                i =  i-2;
            }
            if(i == 0)
            {
                even = true;
            }
        }
        for(String p :list){
            t.append(p);
        }
        System.out.println(t);
    }
}
