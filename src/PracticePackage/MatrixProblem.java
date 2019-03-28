package PracticePackage;

/**
 * Created by intelliswift on 8/27/18.
 */
public class MatrixProblem {
    public static void main (String [] args){
        char [][] grid = { { '0', '0','1','1'}, { '1', '0','1','1' },{ '1', '1', '0','1' },{ '1', '0', '1','1'} };
        for(int i = 0; i<grid.length; i++){
            for(int j = 0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        char [][] grid1 = {{'{','}'},{'(',')'},{'[',']'}};
        for(char[]array:grid1){
           System.out.println(array[0]+" "+array[1]);
        }
    }
}
