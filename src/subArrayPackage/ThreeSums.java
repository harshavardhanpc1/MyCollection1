package subArrayPackage;

import java.util.*;

/**
 * Created by intelliswift on 10/15/18.
 */
//unique triplets sum is 0;
public class ThreeSums {
    public static void main(String[]args){
        int [] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>>mylist = threeSum(nums);
        System.out.println(mylist);
    }
    public static List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        for(int i = 0;i< nums.length-2;i++)
            for(int j = i+1;j< nums.length-1;j++)
                for(int k = j+1;k< nums.length;k++)
                    if(0 == nums[i]+nums[j]+nums[k])
                    {
                        List list = new ArrayList<Integer>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        set.add(list);
                    }

        return  new ArrayList(set);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i = 0;i< nums.length-2;i++)
        {
            int j = i+1;
            int k = nums.length-1;
            if(j==nums.length-2 && k == nums.length-1)
                System.out.println("last");
            while(j<k){
                if(nums[i]+nums[j]+nums[k] == 0)
                {
                    List q = new ArrayList();
                    q.add(nums[i]);
                    q.add(nums[j]);
                    q.add(nums[k]);
                    if(list.contains(q))
                    continue;
                    else
                    list.add(q);
                    j++;
                }
                else
                    j++;
            }
            j = i+1;
            while(j<k)
            {
                if(nums[i]+nums[j]+nums[k] == 0)
                {
                    List q = new ArrayList();
                    q.add(nums[i]);
                    q.add(nums[j]);
                    q.add(nums[k]);
                    if(list.contains(q))
                        continue;
                    else
                        list.add(q);
                    k--;
                }
                else
                    k--;
            }
        }
        return list;
    }

}
