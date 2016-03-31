package LeetCode;

/**
 * Lancer on 2016/3/31.
 */
public class No_172 {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n != 0) {
            n = n / 5;
            count += n;
        }
        return count;
    }

    public static void main(String[] args) {
        No_172 t = new No_172();

        // Test Case
        int n = 35;

        System.out.println(t.trailingZeroes(n));
    }
}
