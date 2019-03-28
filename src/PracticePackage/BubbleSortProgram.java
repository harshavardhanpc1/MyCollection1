package PracticePackage;

/**
 * Created by intelliswift on 7/28/18.
 */
public class BubbleSortProgram {
    public static void main(String [] args){
        int [] s = {8,3,2,1,7};
        for(int j=0;j<s.length-1;j++)
        for(int i=0;i<s.length-1;i++){
            if(s[i] > s[i+1])
                swap(s,i,i+1);
        }
        for(int i=0;i<s.length;i++)
        System.out.println(s[i]);
    }

    public static void swap(int [] s,int i,int j){
       int temp;
       temp = s[i];
       s[i] = s[j];
       s[j] = temp;
    }
}
