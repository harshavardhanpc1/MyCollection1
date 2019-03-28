package RecursivePrograms;

/**
 * Created by intelliswift on 4/29/18.
 */
public class Factorial {
    public static void main (String[] args){
        System.out.println(fact(2));
    }
    public static int fact(int n){
        if(n==0){
          return 1;
        }
        return n*fact(n-1);
    }
}
