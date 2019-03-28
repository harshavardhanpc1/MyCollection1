

/**
 * Created by intelliswift on 5/15/18.
 */
public class ProductNumbers {
    public static void main(String[]args){
        int [] product = {3,5,9,2,9,9,6,0,8,-10};
        int max1 = 0;
        int max2 = 0;
        int min3 = 0;
        int min4 = 0;
        int p = 0;
        int q = 0;
        int r = 0;
        int s = 0;
        int product1 = 0;
        int product2 = 0;
        for(int i=0;i<product.length;i++)
        {
            if (max1 <= product[i])
                max1 = product[i];
            p++;
        }

        for(int i=0;i<product.length;i++) {
            if (max2 <= product[i] && q < p-1)
                max2 = product[i];
            q++;
        }

        for(int i=0;i<product.length;i++)
        {
            if (min3 >= product[i])
                min3 = product[i];
            r++;
        }

        for(int i=0;i<product.length;i++) {
            if (min4 >= product[i] && s < r-1)
                min4 = product[i];
            s++;
        }

        product2 = max1 * max2;

        if (min3<0 && min4 <0)
        {
            product1 = min3 * min4;
        }


        if(product1 > product2)
            System.out.println(product1);
        else
            System.out.println(product2);
    }
}
