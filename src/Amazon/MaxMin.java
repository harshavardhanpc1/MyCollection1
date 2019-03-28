package Amazon;

/**
 * Created by intelliswift on 2/8/19.
 */
public class MaxMin {
    public static void main(String[]args){
        int[] i = {1,2,3,4,5,6,7};
        int[] j = new int[7];
        int small = 0;
        int large = i.length-1;
        for(int k=0;k<i.length;k++){
            if(k%2==0){
                j[k] = i[large];
                large--;
            }
            else {
                j[k] = i[small];
                small++;
            }
        }
        for(int k=0;k<i.length;k++)
        System.out.println(j[k]+" ");
    }
}
