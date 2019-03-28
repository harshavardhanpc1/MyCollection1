package Practice;

/**
 * Created by intelliswift on 11/9/18.
 */
public class SelectionSort {
    public static void main(String[]args){
        int [] a = {8,7,6,5,9,10};
        sort(a);
       for(int i=0;i<a.length;i++)
            System.out.println(a[i]+",");
    }
    public static void sort(int a[]){
        for(int i=0;i<a.length-1;i++) {
            //Finding min_idx is optimization
            int min_idx = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min_idx] > a[j]) {
                    min_idx = j;
                }
            }
            //Swaping only min_idx
            a = swap(i, min_idx, a);
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
