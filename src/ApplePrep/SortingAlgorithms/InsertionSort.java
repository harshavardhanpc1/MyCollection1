package ApplePrep.SortingAlgorithms;

/**
 * Created by intelliswift on 1/16/19.
 */
public class InsertionSort {
    public static void main(String[]args){
        int []a = {10,9,8,7,2,1,3};
        for(int i=1;i<a.length;i++)
            for(int j=i-1;j>=0;j--)
                if(a[j]>a[i]) {
                    swap(a, i, j);
                    i = j;
                }
                else
                    break;
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
