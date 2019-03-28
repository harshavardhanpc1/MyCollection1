package PracticePackage;

/**
 * Created by intelliswift on 8/6/18.
 */
public class QuickSort {
    public static void main (String [] args){
          //Element in array
        int [] ar = {10,5,11,13,12};
        int high = ar.length-1;
        int low = 0;

        quicksort(ar,low,high);
        for(int i =0;i<ar.length;i++)
        System.out.println(ar[i]);
    }

    public static void quicksort(int [] ar,int low,int high){
        if(low < high) {
            int split = partition(ar, low, high);
            quicksort(ar, low, split - 1);
            quicksort(ar, split + 1, high);
        }
    }

    public static int partition(int [] ar,int low,int high ) {
        int pivot = high;
        int i = low;
        int j = high;
        while (i < j) {
            if (ar[i] <= ar[pivot])
                i++;
            else {
                if (ar[j] > ar[pivot])
                    j--;
                else if (ar[j] <= ar[pivot])
                    swap(ar, i, j);
                 }
        }
        swap(ar,pivot,i);
        return i;
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
