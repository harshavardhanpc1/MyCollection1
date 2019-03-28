package Sorting;

/**
 * Created by intelliswift on 4/28/18.
 */
public class NewMergeSort {
    public static void main(String[] args) {
      //  int[] i = {1, 4, 6, 8, 11,18,20,21};
      //  int[] j = {2, 3, 7,10,12,15,16};
       // int [] k = new int [30];
        int []k = {10,2,6,5,4,1,9,3};
        int low = 0;
        int high = k.length-1;
        mergeSort(k,low,high);

        for (int z = 0;z < k.length;z++)
            System.out.println(k[z]);
    }
    public static void mergeSort(int [] k,int low,int high){
        if(low < high) {
            int mid = (low + high) / 2;
            //Dividing the array into left and right recursively
            mergeSort(k, low, mid);
            mergeSort(k, mid + 1, high);
            //merging left and right recursively
            mergingIt(k, low, mid, high);
        }
    }

    public static void mergingIt(int []k,int low,int mid,int high){
        int n1 = (mid - low + 1);
        int n2 = (high - mid);
        int []i = new int[n1];
        int []j = new int[n2];
        for (int p=0;p<n1;++p)
        {
            i[p] = k[low + p];
        }
        for (int q=0;q<n2;++q)
        {
            j[q] = k[mid + 1 + q];
        }
        merge(i,j,k,low);
    }

    public static void merge (int[]i,int[]j,int []k,int low){
        int p = 0;
        int q = 0;
        int m = low;
        while (p < i.length && q < j.length) {
            if(j[q] <= i[p] ){
                k[m] = j[q];
                q++;
            }
            else {
                k[m] = i[p];
                p++;
            }
            m++;
        }
        while(q<j.length){
            k[m] = j[q];
            q++;
            m++;
        }
        while(p<i.length){
            k[m] = i[p];
            p++;
            m++;
        }
    }
}
