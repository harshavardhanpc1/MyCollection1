package Heli;

import java.util.ArrayList;

/**
 * Created by intelliswift on 8/12/18.
 */
//Contigous Sub arrays with sum less than given number
public class ThirdProg {
    public static void main(String[] args) {
        Integer k = 7;
        Integer sum = 0;
        ArrayList<Integer> ar = new ArrayList();
        ArrayList<Integer> temp = new ArrayList();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);
        ar.add(6);
//        Integer len = ar.size();
//        Iterator it = ar.iterator();
        for(int startpoint = 0;startpoint < ar.size();startpoint++){
            for(int j=startpoint;j<=ar.size();j++){
                for(int p=startpoint;p<j;p++) {
                    temp.add(ar.get(p));
                    sum = sum + ar.get(p);
                    if(sum <=k && p == j-1)
                    {
                        System.out.print(temp);
                        System.out.println(sum);
                    }
                }
                sum = 0;
                temp.clear();
            }
        }
    }
    }
