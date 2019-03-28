package ApplePrep;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by intelliswift on 1/14/19.
 */
public class TwoSum {
    public static void main(String[] args){
        int[]a = {4,1,2,3,5};
        List<int[]> myList = new ArrayList<int[]>();
        int target = 5;
        for(int i = 0;i<a.length;i++)
        {
            for(int j =i+1;j<a.length;j++)
            {
                if(a[i]+a[j] == target)
                {
                    int[] p = {a[i],a[j]};
                    myList.add(p);
                }
            }
        }
        for(int[] i:myList)
        {
            for(int j: i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
