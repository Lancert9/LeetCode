package LeetCode;

import java.util.HashSet;
import java.util.regex.Matcher;

/**
 * Lancer on 2016/3/30.
 */
public class No_202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (true) {
            int num = 0;
            while (n != 0) {
                num += Math.pow(n % 10, 2);
                n = n / 10;
            }
            if (num == 1) {
                return true;
            }
            else if (set.contains(num)) {
                return false;
            }
            else {
                set.add(num);
            }
            n = num;
        }
    }

    public static void main(String[] args) {
        No_202 t = new No_202();

        // Test Case
        int n = 19;

        System.out.println(t.isHappy(n));
    }
}
