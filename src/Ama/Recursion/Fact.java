package Ama.Recursion;



/**
 * Created by intelliswift on 3/7/19.
 */
public class Fact {
    public static void main(String []args){
        int i = 5;
        for(i=0;i<5;i++){
           System.out.println(facto(i));
        }
    }
    public static int facto(int i){
        if(i > 1){
           return i*facto(i-1);
        }
        else
            return 1;
    }
}
