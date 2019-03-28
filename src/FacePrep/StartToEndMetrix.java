package FacePrep;

/**
 * Created by intelliswift on 1/28/19.
 */
public class StartToEndMetrix {
    public static void main(String[]args){
        int[][] i =
                {
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
                        { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
                        { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
                        { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
                        { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
                        { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
                        { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 }
                };
        int [][]visited = new int[10][10];
        int min_dist = Integer.MAX_VALUE;
        int dist = 0;
        dist = findPath(i,visited,min_dist,dist,0,0,7,5);
        if (dist != Integer.MAX_VALUE)
            System.out.println("Shortest path is "+dist);
        else
            System.out.println("No path");

    }
    public static int findPath(int[][]j,int [][] visited,int min_dist,int dist,int k,int l,int m,int n){
        if(k == m && l==n )
            return Integer.min(dist,min_dist);
        visited[k][l] = 1;
        if(isValied(j,k+1,l) && isSafe(j,visited,k+1,l)) {
            min_dist = findPath(j, visited, min_dist, dist + 1, k + 1, l, m, n);
        }
        if(isValied(j,k,l+1) && isSafe(j,visited,k,l+1)) {
           min_dist = findPath(j,visited,min_dist,dist+1,k,l+1,m, n);
        }
        if(isValied(j,k-1,l) && isSafe(j,visited,k-1,l)) {
            min_dist = findPath(j, visited, min_dist, dist + 1, k - 1, l, m, n);
        }
        if(isValied(j,k,l-1) && isSafe(j,visited,k,l-1)) {
            min_dist = findPath(j,visited,min_dist,dist+1,k,l-1,m, n);
        }
        visited[k][l] = 0;
        return min_dist;
    }
    public static boolean isValied(int[][]j,int k,int l){
        if(k>=0 && l>=0 && k<j.length && l < j[0].length){
            return true;
        }
            return false;
    }
    public static boolean isSafe(int[][]j,int[][]visited,int k,int l){
        return !(j[k][l] == 0 ||visited[k][l]!=0);
    }
}
