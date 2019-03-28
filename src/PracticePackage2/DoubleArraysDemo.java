package PracticePackage2;

/**
 * Created by intelliswift on 9/18/18.
 */
public class DoubleArraysDemo {
    public static void main(String[]args){
        int [][]A = {{0,1,1},{1,1,1}};
        System.out.println(A.length+ " "+A[0].length);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
