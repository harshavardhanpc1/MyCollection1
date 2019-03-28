package PracticePackage;

/**
 * Created by intelliswift on 8/31/18.
 */
public class SplitSpace {
    public static void main (String[]args){
        String s = "thisiswalkmydog";
        String[] arr = s.split("is");
        System.out.println(arr[0]+" done " +arr[1]);
    }
}
