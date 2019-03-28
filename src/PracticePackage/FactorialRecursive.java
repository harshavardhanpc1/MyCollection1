package PracticePackage;

/**
 * Created by intelliswift on 7/29/18.
 */
public class FactorialRecursive {
    public static void main (String[] args){
        int i = 5;
        int j = factorial(i);
        System.out.println(j);
    }
    public static int factorial(int p){
        if(p==1)
            return 1;
        else
            System.out.println(p);
        return p*factorial(p-1);
    }
}
