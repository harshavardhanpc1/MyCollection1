package Sorting;

/**
 * Created by intelliswift on 4/29/18.
 */
public class NewQuickSort {
    public static void main(String []args)
    {
        int k[] = {99,88,5,4,3,2,1,0,12,3,7,9,8,3,4,5,7};
        int low = 0;
        int high = k.length-1;
        quickSort(k,low,high);
        for (int z = 0;z < k.length;z++)
            System.out.println(k[z]);

    }
    public static void quickSort(int []k,int low,int high){
     if (low < high){
         int split = partition(k,low,high);
         quickSort(k,low,split-1);
         quickSort(k,split+1,high);
     }
     else
         return;
    }
    public static int partition(int []k,int low,int high){
        int pivot = high;
        int i = low;
        int j = high;
        while (i<j){
            if (k[i] <= k[pivot]) {
                i++;
            }
            if (k[i] > k[pivot])
            {
                if (k[j] <= k[pivot]) {
                    swap(k, i, j);
                    i++;
                }
                if (k[j] > k[pivot]){
                    j--;
                }
            }
        }
        swap(k,pivot,i);
        return i;
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }

}
