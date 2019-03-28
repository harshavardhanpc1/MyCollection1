package Sorting;

/**
 * Created by intelliswift on 4/27/18.
 */

//Insertion sort take the smallest element and swap it as first element and so on
public class NewSelectionSort {
    public static void main(String[] args)
    {
        int [] i = {5,4,3,1,2};
        selectionSort(i);
        for (int j = 0;j < i.length;j++)
            System.out.println(i[j]);
    }
    public static void selectionSort(int []i)
    {
        int index;
        for (int k = 0;k<i.length;k++)
        {
            index = minimIndex(i,k);
            swap(i,k,index);
        }
    }
    public static int minimIndex(int []i,int n)
    {
        int min = i[n];
        int index = n;
        for (int k = index+1;k<i.length;k++) {
            if (i[k] < min ) {
                index = k;
                min = i[k];
            }
        }
        return index;
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
