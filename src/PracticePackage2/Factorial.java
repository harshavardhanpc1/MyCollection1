package PracticePackage2;

/**
 * Created by intelliswift on 9/18/18.
 */
public class Factorial {
    public static void main(String[]args){
        System.out.println(fact(5));
    }
    public static int fact(int i){
        if(i == 1){
            return i;
        }
        else
           return i*fact(i-1);
    }
}
