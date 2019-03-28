package Ama.Recursion;

/**
 * Created by intelliswift on 2/23/19.
 */
public class Recursive {
    public static void main(String[]args){
        System.out.println(fun1(2,2));
    }
    public static int fun1(int x, int y)
    {
        if(x == 0)
            return y;
        else
            return fun1(x - 1,  x + y);
    }

    /**
     * Created by intelliswift on 3/7/19.
     */
    public static class IslandProblem {
        public static void main(String[]args){
            char [][] grid = { { '0', '0','1' }, { '1', '0','1' },{ '1', '1', '0' },{ '1', '0', '1'} };

        }
    }
}
