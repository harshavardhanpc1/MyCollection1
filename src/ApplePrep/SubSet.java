package ApplePrep;

/**
 * Created by intelliswift on 1/17/19.
 */
public class SubSet {
    public static void main(String[]args){
        int []nums = {1,2,3};
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++) {
                for (int p = i; p <= j; p++) {
                    System.out.print(nums[p] + " ");
                }
                System.out.println();
            }
        }

    }
}
