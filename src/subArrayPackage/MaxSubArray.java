package subArrayPackage;

import java.util.Collections;
import java.util.HashMap;
//Max sum of sub array
/**
 * Created by intelliswift on 8/31/18.
 */
//Return a sub array [4,-1,2,1] has the largest sum = 6
public class MaxSubArray {
    public static void main (String[]args){
        int[]i = {-2,1,-3,4,-1,2,1,-5,4};

        HashMap<Integer,int[]>map = new HashMap();
        int sum = 0;
        int p = 0;
        for(int sp =0;sp<i.length;sp++)
        for(int j=sp;j<i.length;j++) {
            int[]fin = new int[j-sp+1];
            for (int k = sp; k <=j; k++) {
                fin[p] = i[k];
                sum = sum + i[k];
                p++;
            }
            map.put(sum,fin);
            System.out.println(sum);
            sum = 0;
            p = 0;
        }
        int maxValueInMap=(Collections.max(map.keySet()));
        for(int z:map.get(maxValueInMap))
        System.out.println(z+" "+ maxValueInMap);
    }
}
