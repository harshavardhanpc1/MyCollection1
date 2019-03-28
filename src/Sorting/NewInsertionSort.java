package Sorting;

/**
 * Created by intelliswift on 4/28/18.
 */

//Take the first element as sorted array and remaining usorted.
// Take the first element of unsorted array and merge into the sorted array
    //trick k = 1 and l = k-1 swap
public class NewInsertionSort {
    public static void main(String[] args)
    {
        int [] i = {8,5,4,3,1,2};
        insertionSort(i);
        for (int j = 0;j < i.length;j++)
            System.out.println(i[j]);
    }
    public static void insertionSort(int []i){
         //Traversing unsorted one by one
        for (int k = 1;k < i.length;k++)
            //Making sorted array one by one
            for (int l = k-1;l >=0 ;l--)
                if (i[l] > i[k])
                {
                    swap(i,l,k);
                    k = l;
                }
                else
                    break;
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
