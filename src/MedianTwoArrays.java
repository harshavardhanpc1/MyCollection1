import java.util.ArrayList;

/**
 * Created by intelliswift on 5/20/18.
 */
public class MedianTwoArrays {
    public static void main (String[]args){
       int[] nums1 ={1,2};
       int[] nums2 = {3,4};
       ArrayList<Integer> ar = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        int nums3 = nums1.length;

        while(i < nums1.length && j < nums2.length && nums1.length != 0 && nums2.length != 0)
        {
            if(nums1[i]<=nums2[j]) {
                ar.add(nums1[i]);
                i++;
                if(i == nums1.length )
                    break;
            }
            if (nums2[j]<=nums1[i]){
                ar.add(nums2[j]);
                j++;
                if(j == nums1.length )
                    break;
            }
        }
        while (i < nums1.length && nums1.length != 0 ) {
            ar.add(nums1[i]);
            i++;
        }
        while (j < nums2.length && nums2.length !=0 ) {
            ar.add(nums2[j]);
            j++;
        }
       System.out.println(ar);
        int sizing = ar.size();
        double median;
        if(ar.size()%2 == 0)
            median =(float)(ar.get(sizing/2-1)+ar.get(sizing/2)) /2.0;
            else
            median = ar.get(sizing/2);
      System.out.println(median);
    }
}
