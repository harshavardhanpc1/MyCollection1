package ApplePrep;

import java.util.*;

/**
 * Created by intelliswift on 1/6/19.
 */
public class ThreeSum {
    public static void main(String[]args){
       // int[]nums = {-1,0,1,2,-1,-4};
        int [] nums = {-2,0,0,2,2};
        Set<ArrayList<Integer>> l = new HashSet();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-3;i++)
        {
            if(i==0||nums[i]>nums[i-1]){
                int start = i+1;
                int end = nums.length-1;
                while(end>start){
                    if((nums[i]+nums[start]+nums[end]) == 0)
                    {
                        ArrayList<Integer>temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        l.add(temp);
                        start++;
                        end--;
                    }
                    else if((nums[i]+nums[start]+nums[end]) < 0){
                        int tempstart = start;
                        start ++;
                        while(nums[start] == nums[tempstart] && end > start)
                        start ++;
                    }
                    else if((nums[i]+nums[start]+nums[end]) > 0){
                        int tempend = end;
                        end --;
                        while(nums[end] == nums[tempend] && end > start)
                        end --;
                    }
                }
            }
        }
        List<List<Integer>> mainList = new ArrayList<List<Integer>>();
        mainList.addAll(l);
        for(List<Integer> m : mainList){
            for(Integer k:m){
                System.out.print(k + " ");
            }
            System.out.println();
        }
//        Iterator<ArrayList<Integer>> i = l.listIterator();
//        while(i.hasNext()){
//            ArrayList<Integer> internalList = i.next();
//
//        }
    }
}
