package AgileOne;

/**
 * Created by intelliswift on 3/13/19.
 */
public class MergeSortManner {
    public static void main(String[]args){
        int[]A = new int[10];
        int[]B = {11,12,13,14,15};
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;
        A[3] = 8;
        A[4] = 9;
        int i = A.length-1;
        int j = 4;
        int k = 4;
            while(k>=0 && j>=0){
                if(A[j]>=B[k]){
                    A[i] = A[j];
                    A[j] = 0;
                    j--;
                    i--;
                } else {
                    A[i] = B[k];
                    k--;
                    i--;
                }
            }
        while(j>=0){
            A[i] = A[j];
            j--;
            i--;
        }
        while(k>=0){
            A[i] = A[k];
            k--;
            i--;
        }
        for (int z = 0;z < A.length;z++)
            System.out.println(A[z]);
    }
}
