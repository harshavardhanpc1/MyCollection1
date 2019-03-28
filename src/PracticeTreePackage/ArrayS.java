package PracticeTreePackage;

import java.util.LinkedList;

/**
 * Created by intelliswift on 8/22/18.
 */
public class ArrayS {
    public static void main (String[]args){
        LinkedList<Integer> i[];
        i = new LinkedList[10];
        for(int j=0;j<i.length;j++)
            i[j] = new LinkedList<Integer>();
        for(int j=0;j<2;j++)
            i[0].add(j);
        for(int j=0;j<4;j++)
            i[1].add(j);
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}
