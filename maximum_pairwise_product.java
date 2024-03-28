import java.util.*;

public class maximum_pairwise_product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        

        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        long maxProduct = max1 * max2;
        System.out.println(maxProduct);
        sc.close();
    }
}
