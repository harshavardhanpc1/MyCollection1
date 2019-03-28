package PracticePackage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by intelliswift on 8/13/18.
 */
public class InsertionSort2 {
    public static void main (String [] args){
        List<Integer>ar = new ArrayList();
        ar.add(5);
        ar.add(4);
        ar.add(6);
        ar.add(7);
        ar.add(1);
        for(int i = 1;i<ar.size();i++)
        {
            for(int l = i-1;l>=0;l--)
            {
              if(ar.get(l) > ar.get(i) )
              {
                  swap(ar,l,i);
              i = l;
              }
              else
                  break;
            }
        }
        System.out.println(ar);
    }
    public static void swap(List<Integer> ar,int i,int j){
        Integer temp;
        temp = ar.get(j);
        ar.set(j,ar.get(i));
        ar.set(i,temp);
    }
}
