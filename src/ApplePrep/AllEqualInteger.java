package ApplePrep;

import java.util.ArrayList;

/**
 * Created by intelliswift on 1/7/19.
 */
public class AllEqualInteger {
    public static void main(String[]args){
        ArrayList<Integer> l = new ArrayList();
        l.add(6);
        l.add(7);
        l.add(8);
        l.add(7);
        l.add(9);
        Integer sum = 0;
        int min = l.get(0);
        for(Integer i:l){
            if(min > i){
                min = i;
            }
        }
        for(Integer i:l ){
            sum = sum + (i-min);
        }
        System.out.println(sum);
    }
}
