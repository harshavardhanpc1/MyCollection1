import java.util.HashSet;
import java.util.Set;

/**
 * Created by intelliswift on 8/21/18.
 */
public class HappyNumber {
    public static void main (String[]args){
        int q = 7;
        Set set = new HashSet();
        if(q < 10) {
            q = square(q);
        }
        while (q!=1){
            set.add(q);
            q = addsquare(q);
            System.out.println(q);
            if(q == 1) {
                System.out.println("It is happy number");
                break;
            }
            else if(set.contains(q)) {
                System.out.println("It is not a happy number");
                break;
            }
            else
                continue;
        }
    }
    public static int square(int p){
        return p*p;
    }
    public static int addsquare(int q){
        int sum = 0;
        while(q!=0){
            sum = sum + square(q%10);
            q = q/10;
        }
        return sum;
    }
}
