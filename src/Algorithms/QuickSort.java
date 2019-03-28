package Algorithms;

/**
 * Created by intelliswift on 3/11/19.
 */
public class QuickSort {
    public static void main(String[]args){
        int []k = {10,2,6,5,4,1,9,3};
        int low = 0;
        int high = k.length-1;
        quickSort(k,low,high);
        for (int z = 0;z < k.length;z++)
            System.out.println(k[z]);
    }
    public static void quickSort(int[]k,int low,int high){
        if(low < high){
            int split = partition(k,low,high);
            quickSort(k,low,split-1);
            quickSort(k,split+1,high);
        }
        else
            return;
    }
    public static int partition(int[]k,int low,int high){
        int pivot = high;
        int i = low;
        int j = high;
        while(i<j) {
            if (k[i] <= k[pivot]) {
                i++;
            } else {
                if (k[j] > k[pivot]) {
                      j--;
                }
                else {
                    swap(k,i,j);
                    i++;
                }
            }
        }
        swap(k,i,pivot);
        return i;
    }

    public static void swap(int[]k,int i,int j){
        int temp;
        temp = k[i];
        k[i] = k[j];
        k[j] = temp;
    }
}
