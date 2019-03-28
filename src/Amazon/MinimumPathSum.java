package Amazon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelliswift on 3/6/19.
 */
public class MinimumPathSum {
    public static void main(String[]args){
       List<List<Integer>>list = new ArrayList();
       List<Integer>list1 = new ArrayList();
       list1.add(-1);
       list.add(list1);
        List<Integer>list2 = new ArrayList();
        list2.add(2);
        list2.add(3);
        list.add(list2);
        List<Integer>list3 = new ArrayList();
        list3.add(1);
        list3.add(-1);
        list3.add(-3);
        list.add(list3);
//        List<Integer>list4 = new ArrayList();
//        list4.add(4);
//        list4.add(1);
//        list4.add(8);
//        list4.add(3);
//        list.add(list4);
        System.out.println(minimumTotal(list));
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int index = 0;
        int sum = 0;
        int min_sum = Integer.MAX_VALUE;
        return minimumTotalHelper(triangle,index,sum,min_sum);
    }

    public static int minimumTotalHelper(List<List<Integer>> triangle,int index,int sum,int min_sum){
        if(index < triangle.size()-1) {
            List<Integer>m = triangle.get(index);
            for(Integer k:m) {
                int sum1 = sum + k;
                min_sum = minimumTotalHelper(triangle, index+1, sum1,min_sum);
            }
        }
        else {
            List<Integer>m = triangle.get(index);
            for(int k:m) {
                int sum1 = sum + k;
                min_sum = Math.min(sum1,min_sum);
            }
        }
        return min_sum;
    }

}
