package PracticePackage;

/**
 * Created by intelliswift on 9/10/18.
 */
//Stair case problem to step on 1 or 2 steps
public class StairCaseProblem {
    public static void main(String[]args){
        //for(int i =0;i<6;i++)
        //{
        int j = fib(6,new int[6+1]);
        System.out.println(j);
        //}
    }
    public static int fib(int i,int[] memo) {
        if(i == 0 || i == 1)
            return 1;
        if (memo[i] == 0) {
            memo[i] = fib(i - 1,memo) + fib(i - 2,memo);
        }
        return memo[i];
    }
}
