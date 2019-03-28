/**
 * Created by intelliswift on 4/25/18.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int low = 0;
        int high = a.length;
        int i = 2;
        int j = BS(low, high, i, a);
        System.out.println(j);
    }

    public static int BS(int low, int high, int i, int a[]) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == i)
                return mid;
            else if (a[mid] < i)
                low = mid + 1;
            else if (a[mid] > i)
                high = mid - 1;
        }
       return -1 ;
    }
        public static  int recursiveBS(int low, int high, int i, int a[]){

            if (low <= high)
            {
                int mid = (low + high) / 2;
                if (a[mid] == i)
                    return mid;
                else if (a[mid] < i)
                    return recursiveBS(mid+1,high,i,a);
                else if (a[mid] > i)
                   return recursiveBS(low,mid-1,i,a);
            }
            return -1;
        }
}