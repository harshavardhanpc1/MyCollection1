package Practice;

/**
 * Created by intelliswift on 11/9/18.
 */
public class InsertionSort {
    public static void main(String[]args){
        int [] a = {10,7,6,5,9,1};
        sort(a);
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]+",");
    }
    public static void sort(int[]a){
       for(int i=1;i<a.length;i++){
           for(int j=i;j>0;j--){
               if(a[j]<a[j-1]){
                   swap(j,j-1,a);
               }
           }
       }

    }
    public static int[] swap(int c,int b,int[] a){
        int temp;
        temp = a[c];
        a[c]  = a[b];
        a[b] = temp;
        return a;
    }
}
