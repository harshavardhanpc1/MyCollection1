package ApplePrep.DynamicProgramming;

/**
 * Created by intelliswift on 1/21/19.
 */
public class StairCase {
   //
    //int total_steps = 100;
    public static void main(String[]args){
        int total = 0;
       total = num_diff(4);
       System.out.println(total);

    }

    public static int num_diff(int n)  {
        if(n==0 ){
            System.out.println("Edge case"+n);
            return 1;}
            int total = 0;
             int[] a = {2,3};
        System.out.println("Step in "+n);
             for(int i=0;i<a.length;i++){
                 if(n-a[i] >= 0){
                     System.out.println("come in loop "+a[i] + " level "+n);
                     System.out.println( " num_diff1("+n+"-"+a[i]+")");
                     int p = num_diff(n-a[i]);
                     System.out.println("loop total before "+total );
                     total = total + p;
                     System.out.println("loop total after "+total );
                     System.out.println("come out loop "+a[i]+" level "+n);
                     System.out.println("total = "+total + " num_diff("+n+"-"+a[i]+")"+" " + " numdiff " + p +" calculated");
                     System.out.println("loop total after "+total );
                 }
             }
             System.out.println("coming out level total "+total+" step out level "+n);
            return total;
    }


}
