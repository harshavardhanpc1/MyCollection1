import java.util.HashSet;
import java.util.Set;

/**
 * Created by intelliswift on 8/21/18.
 */
public class RecursiveHappyNumber {
        public static void main (String[]args){
            int q = 8;
            Set set = new HashSet();
            if(q < 10)
                q = square(q);
           addsquare(q,set);
        }
        public static int square(int p){
            return p*p;
        }
        public static void addsquare(int q,Set set){
            if(q == 1) {
                System.out.println("It is happy number");
                return;
            }
            int sum = 0;
            while(q!=0){
                sum = sum + square(q%10);
                q = q/10;
            }
            q = sum;
            System.out.println(q);
            if(set.contains(q)) {
                System.out.println("It is not a happy number");
                return;
            }
            set.add(q);
            addsquare(q,set);
        }
}
