import java.util.*;

/**
 * Created by intelliswift on 3/11/19.
 */
public class SumOfTwo {
    public static void main(String[]args){
     int[]nums = {3,3};
     int target = 6;
     int []result = twoSum(nums,target);
     System.out.println(result[0]+" " + result[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> s = new LinkedHashMap();
        int[]result = new int[2];
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(target-nums[i])) {
                return new int[]{s.get(target-nums[i]),i};
            }
            else
                s.put(nums[i],i);
        }
        return result;
    }
}
