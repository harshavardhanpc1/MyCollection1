/**
 * Created by intelliswift on 5/20/18.
 */
public class IntegerPalandrome {
    public static void main ( String[] args){
        int i = 121;
        int j = i;
        int x = 0;
        while(j>0){
            x = x*10 + j%10;
            j = j/10;
        }
        if(x==i)
            System.out.println("it is palandrome");
        else
            System.out.println("it is not palandrome");
    }
}
