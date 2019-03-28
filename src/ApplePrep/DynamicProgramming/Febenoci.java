package ApplePrep.DynamicProgramming;

/**
 * Created by intelliswift on 1/24/19.
 */
public class Febenoci {
    public static int[] memo = new int[20];
    public static void main(String[]args){

        for(int i =0;i<=10;i++)
         System.out.println(feb(i) + " ");
    }
    public static int feb(int n){
        if(n == 0 || n==1)
            return 1;
        else if (memo[n]==0){
            memo[n] = feb(n-1)+feb(n-2)+feb(n);
        }
        return memo[n];
    }
}
