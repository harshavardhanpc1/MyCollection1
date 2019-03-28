package Sorting;

/**
 * Created by intelliswift on 4/27/18.
 */

//adjecent element swap with the element in sorting order
public class NewBubbleSort {
    public static void main(String []args)
    {
        int [] i = {5,4,3,1,2};
        //Take two elements consicutive and swap.move my one.
        bubbleSort(i);
        for (int j = 0;j < i.length;j++)
        System.out.println(i[j]);
    }
    public static void bubbleSort(int []i)
    {
        for (int k = 0;k< i.length-1;k++)
        for (int j = 0;j< i.length-k-1;j++)
            if (i[j] > i[j+1])
            swap(i,j,j+1);

    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
