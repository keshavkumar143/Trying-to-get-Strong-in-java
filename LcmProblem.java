
public class LcmProblem {
    public static int Lcm(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c)); 
        int lcm = max; 
        
        while (true) {
            if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
                return lcm; 
            }
            lcm += max; 
        }
    }

    public static void main(String[] args) {
        int x = 5, y = 5, z = 5;
        int n = Lcm(x, y, z);
        System.out.println(n);

    }
}
