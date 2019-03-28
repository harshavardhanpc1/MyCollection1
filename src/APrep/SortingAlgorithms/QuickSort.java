package APrep.SortingAlgorithms;

/**
 * Created by intelliswift on 1/16/19.
 */
public class QuickSort {
    public static void main(String[]args){
        int []a = {10,9,8,7,2,1,3};
        int low = 0;
        int high = a.length-1;
        quickSort(a,low,high);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public static void quickSort(int[]a,int low,int high){
        if(low<high)
        {
            int split = partition(a,low,high);
            quickSort(a,low,split-1);
            quickSort(a,split,high);
        }
        else
            return;
    }
    public static int partition(int[]a,int low,int high){
        int pivot = high;
        int i = low;
        int j = high;
        while(i<j) {
            if (a[i] <= a[pivot])
                i++;
            else if(a[j]<=a[pivot]){
                swap(a,i,j);
                i++;
            }
            else
                j--;
        }
        swap(a,i,pivot);
        return i;
    }
    public static void swap(int[]i,int a,int b){
        int temp;
        temp = i[a];
        i[a] = i[b];
        i[b] = temp;
    }
}
