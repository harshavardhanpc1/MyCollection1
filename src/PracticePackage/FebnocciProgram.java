package PracticePackage;

/**
 * Created by intelliswift on 7/29/18.
 */
public class FebnocciProgram {
    public static void main(String[]args){
        for(int i=0;i<10;i++)
            System.out.println(fab(i));
    }
    public static int fab(int j){
        if(j<=1)
            return 1;
        return fab(j-1)+fab(j-2);
    }
}
