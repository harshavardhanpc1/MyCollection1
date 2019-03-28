package APrep.SortingAlgorithms;

/**
 * Created by intelliswift on 1/16/19.
 */
public class BubbleSort {
    public static void main(String[]args){
        int []a = {10,9,8,7,2,1,3,0};
        for(int j=0;j<a.length-1;j++)
        for(int i=0;i<a.length-j-1;i++)
        {
            if(a[i] > a[i+1])
                swap(a,i,i+1);
        }
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
   public static void swap(int[]i,int a,int b){
        int temp;
        temp = i[a];
        i[a] = i[b];
        i[b] = temp;
    }
}
