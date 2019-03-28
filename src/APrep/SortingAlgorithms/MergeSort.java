package APrep.SortingAlgorithms;

/**
 * Created by intelliswift on 1/16/19.
 */
public class MergeSort {
    public static void main(String[]args){
        int []a = {10,9,8,7,2,1,3};
        int low = 0;
        int high = a.length-1;
        mergeSorting(a,low,high);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + " ");
    }
    public static void mergeSorting(int[]a,int low,int high){
        if(low<high)
        {
            int mid = (low + high)/2;
            //deviding to individual element with temporary borders
            mergeSorting(a,low,mid);
            mergeSorting(a,mid+1,high);
            //copying individual elements to temporary array
            //Merging into temporary array to main array
            merger(a,low,high,mid);
        }
    }

    public static void merger(int[] a, int low, int high, int mid) {
        int n1 = mid+1-low;
        int n2 = high-mid;
        int[]i = new int[n1];
        int[]j = new int[n2];
        for(int p=0;p<n1;p++)
        {
            i[p] = a[low+p];
        }
        for(int q=0;q<n2;q++)
        {
            j[q] = a[mid+1+q];
        }
        merge(i,j,a,low);
    }
    public static void merge(int[]i,int[]j,int[]a,int low){
        int p = 0;
        int q = 0;
        while(p<i.length && q < j.length)
        {
            if(i[p]<j[q])
            {
                a[low] = i[p];
                p++;
            }
            else
            {
                a[low] = j[q];
                q++;
            }
            low++;
        }
        while(q<j.length)
        {
            a[low] = j[q];
            low++;
            q++;
        }
        while(p<i.length)
        {
            a[low] = i[p];
            low++;
            p++;
        }
    }


}

