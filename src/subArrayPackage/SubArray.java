package subArrayPackage;

/**
 * Created by intelliswift on 10/15/18.
 */
//Sub array with sum 5
public class SubArray {
    public static void main(String[]args){
        int[] i = {0,-1,2,4,1,3,5};
       // int[]i = {0,1,2,3,4,5,6};

        int max=3;
        for(int sp = 0;sp<i.length;sp++)
        {
            for(int k=sp;k<i.length;k++)
            {
                int sum = 0;
                for(int p=sp;p<k;p++) {
                    sum = sum + p;
                }
                if(sum == max) {
                    for (int p = sp; p < k; p++) {
                        System.out.print(i[p]+",");

                    }
                    System.out.println();
                }

            }
        }
    }
}
