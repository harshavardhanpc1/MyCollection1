package Amazon.Recursion;

/**
 * Created by intelliswift on 3/7/19.
 */
public class IslandProblem {

    public static void main(String[]args){
        char [][] grid = { { '0', '0','1' }, { '1', '0','1' },{ '1', '1', '0' },{ '1', '0', '1'} };
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    continue;
                }
                else
                    if(grid[i][j]=='1'){
                    count++;
                    concatIsland(grid,i,j);
                    }
            }
        }
        System.out.println(count);

    }
   public static void concatIsland(char[][]grid,int i,int j){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == '0' ){
            return;
        }
            grid[i][j] = '0';
            concatIsland(grid, i - 1, j);
            concatIsland(grid, i + 1,j);
            concatIsland(grid,i,j+1);
            concatIsland(grid,i,j-1);
   }
}
