package ApplePrep;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by intelliswift on 1/14/19.
 */
public class SpiralMatrix {
    public static void main(String[]args){
        int [][] m = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> l = new LinkedList();
        int r1 = 0;
        int c1 = 0;
        int r2 = m.length-1;
        int c2 = m[0].length-1;

        while(c1<=c2 && r1<=r2) {
            for (int c = c1; c <= c2; c++) {
                l.add(m[r1][c]);
            }
            for (int r = r1 + 1; r <= r2; r++) {
                l.add(m[r][c2]);
            }
            for (int c = c2 - 1; c > c1; c--) {
                l.add(m[r2][c]);
            }
            if (c1 < c2 && r1 < r2) {
                for (int r = r2; r > r1; r--) {
                    l.add(m[r][c1]);
                }
            }
            r1++;
            c1++;
            r2--;
            c2--;
        }
        for(int i:l)
        {
            System.out.print(i+" ");
        }



    }
}
