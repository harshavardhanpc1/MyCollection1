package Amazon.Recursion;

/**
 * Created by intelliswift on 3/7/19.
 */
public class Feb {
    public static void main(String []args){
            int i = 6;
            int[] memo = new int[i+1];
            System.out.println(febn(i,memo));
    }
    public static int febn(int i,int[]memo){
        if(i==0 || i==1){
            memo[i] = 1;
        }
        else if(memo[i] == 0) {
            memo[i] = febn(i - 1, memo) + febn(i - 2, memo);
        }
        return memo[i];
    }
}
