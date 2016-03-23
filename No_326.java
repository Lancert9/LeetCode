package LeetCode;

/**
 * Lancer on 2016/3/23.
 */
public class No_326 {
    public boolean isPowerOfThree(int n) {
        double the_pow = Math.log(n) / Math.log(3);
        return Math.abs(the_pow - Math.rint(the_pow)) <= 0.00000000001;
    }

    public static void main(String[] args) {
        No_326 t = new No_326();

        // Test Case
        int a = 1;

        System.out.println(a + " : " + t.isPowerOfThree(a));
    }
}
