import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class OddOccurance {
    public static String Sort(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);

        return new String(a);
    }

    public static void main(String[] args) {
        int n = 122222333;
        int sum = 0;
        String s = Integer.toString(n);
        HashMap<Character, Integer> hm = new HashMap<>();
        String s2 = Sort(s);

        for (int i = 0; i < s2.length(); i++) {
            if (!hm.containsKey(s2.charAt(i))) {
                hm.put(s2.charAt(i), 1);
            } else {
                hm.put(s2.charAt(i), hm.get(s2.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> cur : hm.entrySet()) {
            int j = cur.getValue(); 
            if (j % 2 != 0) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
