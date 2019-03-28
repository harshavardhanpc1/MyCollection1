package APrep;

import java.util.Arrays;

/**
 * Created by intelliswift on 1/15/19.
 */
public class MaxProductOfTwoNumbers {
    public static void main(String[]args){
        int[] products = {3, 5, 9, 2, -10, 9, 6, 0, 8, -10};
       Arrays.sort(products);
       int max1 = 0;
       int max2 = 0;
       if(products[0] < 0 && products[1] < 0)
       {
           max1 = products[0]*products[1];
       }
       max2 = products[products.length-1]*products[products.length-2];
       System.out.println(Math.max(max1,max2));
    }
}
