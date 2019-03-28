package Ama;

/**
 * Created by intelliswift on 3/11/19.
 */
public class FibanocciBottomsUp {
    public static void main(String []args){
        int n = 6;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        int[]res = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for(int i=2;i<res.length;i++){
            res[i] = res[i-1]+res[i-2];
        }
        return res[n];
    }
}
