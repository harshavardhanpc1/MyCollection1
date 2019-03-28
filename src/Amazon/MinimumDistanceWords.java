package Amazon;

/**
 * Created by intelliswift on 3/6/19.
 */
public class MinimumDistanceWords {
    public static void main(String[]args){
       String s = " the thing the the thing is the great";
      System.out.println(minDistance(s,"great","thing"));
    }
    public static int minDistance(String j,String w1,String w2){
        String[]t = j.split(" ");
        int min_dist = Integer.MAX_VALUE;
        int prev = 0;
        int i = 0;
        //Taking word by word
        for(i=0;i<t.length;i++) {
            if (t[i].equals(w1) || t[i].equals(w2)) {
                prev = i;
                i++;
                break;
            }
        }
        while(i < t.length){
            if(t[i].equals(w1) || t[i].equals(w2)) {
                if (!t[prev].equals(t[i]))
                    min_dist = Math.min(i - prev - 1, min_dist);
                else
                    prev = i;
            }
                i+=1;
        }
        return min_dist;
    }
}
