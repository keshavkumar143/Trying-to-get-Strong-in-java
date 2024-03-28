import java.util.*;

public class ReversingArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };

        int sorted[] = new int[arr.length];
        int k = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            sorted[k] = arr[i];
            k++;
        }
        
        int[] reversed = Arrays.copyOf(sorted, k);

        for (int i = 0; i < k; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}
