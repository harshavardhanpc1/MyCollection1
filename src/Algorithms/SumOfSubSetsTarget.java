package Algorithms;

/**
 * Created by intelliswift on 3/12/19.
 */
public class SumOfSubSetsTarget {
    public static void main(String[]args){
        int []k = {10,2,6,5,4,1,9,3};
      System.out.println(sumSubSetTarget(k,3,k.length-1));

    }
    public static int sumSubSetTarget(int[]num,int total,int index){
        if(total == 0){
            return 1;
        }
        if(index < 0){
            return 0;
        }
        if(total < num[index]){
            return sumSubSetTarget(num,total,index-1);
        }
        return sumSubSetTarget(num,total-num[index],index-1) +
                sumSubSetTarget(num,total,index-1);
    }
}
