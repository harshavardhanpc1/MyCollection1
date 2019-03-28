package ApplePrep.SortingAlgorithms;

/**
 * Created by intelliswift on 1/16/19.
 */

public class SelectionSort {
    public static void main(String[]args){
        int []a = {10,9,8,7,2,1,3,0};
        for(int i=0;i<a.length;i++)
        {
            int min = i;
            for(int l=i+1;l<a.length;l++) {
                if(a[min]>a[l])
                    min = l;
            }
            swap(a,i,min);
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

