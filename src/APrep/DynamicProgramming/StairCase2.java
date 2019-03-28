package APrep.DynamicProgramming;

/**
 * Created by intelliswift on 1/25/19.
 */
public class StairCase2 {
    public static void main(String[]args){
        int total = 0;
        total = num_diff(4);
        System.out.println(total);

    }
//    public static int num_diff(int n){
//        if(n==0){
//            return 1;
//        }
//        int a[] = {1,2};
//        int total = 0;
//        for(int i=0;i<a.length;i++)
//        {
//            if(n-a[i] >= 0){
//                total = total + num_diff(n-a[i]);
//            }
//        }
//        return total;
//    }
    public static int num_diff(int n){
        if(n==0){
            return 1;
        }
        int a[] = {1,2};
        int[] num = new int[n+1];
        num[0] = 0;
        int total = 0;
        for(int i=1;i<n+1;i++){
            for(int j=0;j<a.length;j++)
            {
                if(i-a[j] >=0)
                {
                    total = total + num[i-a[j]];
                }
                num[i] = total;
            }
        }
        return num[n];
    }

}
