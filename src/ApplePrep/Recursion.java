package ApplePrep;

/**
 * Created by intelliswift on 1/11/19.
 */
public class Recursion {
    public static void main(String[]args){
        String p = "GARRAG";
        int i = 4;
        for(int j=0;j<=i;j++)
        System.out.println(feb(j));
        System.out.println(fact(i));
        boolean t = palandrome(0,p.length()-1,p.toLowerCase());
        System.out.println(t);
    }
    public static int feb(int i){
        if(i == 0)
            return 0;
        else if(i==1)
            return 1;
        else
        return feb(i-1) + feb(i-2);
    }
    public static int fact(int i){
        if(i==1)
            return 1;
        else
            return i*fact(i-1);
    }
    public static boolean palandrome(int x,int y,String p){
        if(y-x<=1){
            return true;
        }

        else if(x<y && p.charAt(x)==p.charAt(y))
             return palandrome(x+1,y-1,p);
        return false;
    }
}
