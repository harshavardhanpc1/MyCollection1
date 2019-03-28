package PracticePackage2;

/**
 * Created by intelliswift on 9/18/18.
 */
public class Fibanocci {
    public static void main(String[]args){
        for(int i=0;i<=10;i++){
            System.out.print(fib(i)+" ");
        }
    }
    public static int fib(int i){
        if(i==0 || i==1)
            return 1;
        return fib(i-1)+fib(i-2);
    }
}
