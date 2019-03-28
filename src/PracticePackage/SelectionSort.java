package PracticePackage;

/**
 * Created by intelliswift on 7/28/18.
 */
public class SelectionSort {
    public static void main(String [] args){
        int []j = {15,8,7,1,11,10};
        for(int i=0;i<j.length;i++){
            int min_idx = i;
            for(int k=i;k<j.length;k++){
                if(j[min_idx] > j[k]){
                    min_idx = k;
                }
                    swap(j,i,min_idx);
                }
            }
        for(int z=0;z<j.length;z++)
        System.out.println(j[z]);
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
