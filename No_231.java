package LeetCode;

/**
 * Lancer on 2016/3/23.
 */
public class No_231 {
    public boolean isPowerOfTwo(int n) {
        double the_pow = Math.log(n) / Math.log(2);
        return Math.abs(the_pow - Math.rint(the_pow)) <= 0.00000000001;
    }

    public static void main(String[] args) {
        No_231 t = new No_231();

        // Test Case
        int a = 32;

        System.out.println(a + " : " + t.isPowerOfTwo(a));
    }
}
