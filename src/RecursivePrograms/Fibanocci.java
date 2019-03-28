package RecursivePrograms;

/**
 * Created by intelliswift on 4/29/18.
 */
public class Fibanocci {
    public static void main (String[] args){
        for(int i=1;i<7;i++)
       System.out.println(fab(i));
    }

    public static int fab(int n){
        if (n<=1)
        {
            return n;
        }
        return fab(n-1) + fab(n-2);
    }
}
