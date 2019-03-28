package PracticePackage;

/**
 * Created by intelliswift on 8/9/18.
 */
public class IslandProblem {

    public static void main(String[]args){
        char [][] grid = { { '0', '0','1' }, { '1', '0','1' },{ '1', '1', '0' },{ '1', '0', '1'} };
        int count = 0;
        for(int i =0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1') {
                    count++;
                    makeAdjZero(grid, i, j);
                }
            }
        System.out.println("Number of island " + count);
    }
    public static void makeAdjZero(char[][] A,int i,int j){
        if(i < 0 || i >= A.length || j < 0 || j >= A[0].length || A[i][j] == '0' )
            return;
        A[i][j] = '0';
        makeAdjZero(A,i-1,j);
        makeAdjZero(A,i+1,j);
        makeAdjZero(A,i,j-1);
        makeAdjZero(A,i,j+1);
    }
}
