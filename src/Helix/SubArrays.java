package Helix;

import java.util.ArrayList;

/**
 * Created by intelliswift on 8/13/18.
 */
public class SubArrays {
    public static void main(String[]args){
        ArrayList<Integer> ar = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
        for(int startpoint = 0;startpoint < ar.size();startpoint++){
            for(int j=startpoint;j<=ar.size();j++){
                for(int k=startpoint;k<j;k++)
                    System.out.print(ar.get(k)+" ");
                System.out.println();
         }
        }
    }
}
