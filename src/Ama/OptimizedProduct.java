package Ama;//Program to find product of two numbers in an array
import java.util.Arrays;

/**
 * Created on 5/15/18.
 */
public class OptimizedProduct {
    public static void main(String[]args) {
        int[] products = {3, 5, 9, 2, -10, 9, 6, 0, 8, -10};
        int max = 0;
        Arrays.sort(products);
        for (int i = 0; i < products.length - 1; i++)
            for (int j = i + 1; j < products.length; j++) {
                if (max <= products[i] * products[j])
                max = products[i] * products[j];
            }
        System.out.println(max);
    }
}
