package Algorithms;

/**
 * Created by intelliswift on 3/12/19.
 */
public class RecurSubSet {
    public static void main(String[]args){
        int[]arr = {1,2,3,4};
//        for(int i=0;i<arr.length;i++){
//            for(int k=i;k<arr.length;k++){
//                for(int j=i;j<=k;j++) {
//                    System.out.print(arr[j]);
//                }
//                System.out.println();
//            }
//        }
       recurSub(arr,0,0);
    }
    public static void recurSub(int [] arr,int start,int end){
        if(end == arr.length+1){
            return;
        }
        else if(start <=end){
            for(int i=start;i<end;i++){
             System.out.print(arr[i]);
            }
            System.out.println();
            recurSub(arr,start+1,end);
        }
        else
            recurSub(arr,0,end+1);
        return;
    }
}
