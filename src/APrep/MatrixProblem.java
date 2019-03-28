package APrep;

/**
 * Created by intelliswift on 1/11/19.
 */
public class MatrixProblem {
    public static void main(String[]args){
        int[][]mat = {{1,1,0},{0,0,1},{1,0,1}};
        int count = 0;
         for(int i=0;i<mat.length;i++) {
             for (int j = 0; j < mat[0].length; j++) {
                 if(mat[i][j] == 1)
                 {
                     count++;
                     islandToWater(i,j,mat);
                 }
             }
         }
        System.out.println(count);
    }
    public static void islandToWater(int i,int j,int[][]mat){
        if(i<0 || j<0 || i>mat.length-1 || j>mat[0].length-1 || mat[i][j] == 0 ){
            return;
        }
        else
            mat[i][j] = 0;
           islandToWater(i+1,j,mat);
           islandToWater(i-1,j,mat);
           islandToWater(i,j+1,mat);
           islandToWater(i,j-1,mat);
    }
}
