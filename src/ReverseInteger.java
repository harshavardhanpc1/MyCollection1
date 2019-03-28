/**
 * Created by intelliswift on 5/16/18.
 */
public class ReverseInteger {
      public static void main (String []args){
          int h = reverse(1534236469);
          Math.max(1056389759,Integer.MAX_VALUE);
          System.out.println(h);
      }

            public static int reverse ( int x){
                int i = x;
                int y = 0;
                while (x!=0)
                {
                    y = y * 10 + x % 10;
                    x = x / 10;
                }
                long t = y;
                if (t > Integer.MAX_VALUE)
                    return 0;
                else
                return y;
            }
        }
