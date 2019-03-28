package Algorithms;

/**
 * Created by intelliswift on 3/11/19.
 */

//Write a method to break into single elements by
    //recurisive cut
//Sort the single element and merge

public class MergeSort {
    public static void main(String[]args){
        int []k = {10,2,6,5,4,1,9,3};
        int low = 0;
        int high = k.length-1;
        mergesort(k,low,high);
        for (int z = 0;z < k.length;z++)
            System.out.println(k[z]);
    }
    public static void  mergesort(int k[],int low,int high){
        if(low < high){
            int mid = (low + high)/2;
            mergesort(k,low,mid);
            mergesort(k,mid+1,high);
            mergeIt(k,low,mid,high);
        }
    }
    public static void mergeIt(int k[],int low,int mid,int high){
           int[]p = new int[mid-low+1];
           int[]q = new int[high-(mid+1)+1];
           for(int i=0;i<p.length;i++){
               p[i]=k[low+i];
           }
           for(int i=0;i<q.length;i++){
               q[i]=k[mid+1+i];
           }
           merge(k,p,q,low);
    }
    public static void merge(int[]k,int[]p,int[]q,int low){
        int i = 0;
        int j = 0;
        while(i<p.length && j<q.length){
            if(p[i]<q[j]){
                k[low] = p[i];
                i++;
            }
            else if (p[i]>q[j]){
                k[low] = q[j];
                j++;
            }
            low++;
        }
        while(i<p.length){
            k[low] = p[i];
            i++;
            low++;
        }
        while(j<q.length){
            k[low] = q[j];
            j++;
            low++;
        }
    }
}
