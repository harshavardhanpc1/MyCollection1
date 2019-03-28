package PracticePackage;

/**
 * Created by intelliswift on 7/29/18.
 */
public class InsertionSort {
    public static void main (String [] args){
        int [] p = {10,9,5,1,4,3};
        //trick
        for(int k=1;k<p.length;k++)
        {
            //trick
            for(int l=k-1;l>=0;l--)
            {
                //trick
                if(p[l]>p[k]) {
                    swap(p, l, k);
                    k = l;
                }
                else
                break;
            }
        }
        for(int z=0;z<p.length;z++)
            System.out.println(p[z]);
    }
    public static void swap (int []i,int m,int n)
    {
        int temp = i[m];
        i[m] = i[n];
        i[n] = temp;
    }
}
