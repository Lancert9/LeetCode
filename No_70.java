package LeetCode;

/**
 * Lancer on 2016/3/30.
 */
public class No_70 {
    public int total = 0;

    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 2;
        }
        else {
            int tmp = 2;
            int i = 3;
            while (i <= n) {
                tmp = a + b;
                a = b;
                b = tmp;
                i++;
            }
            return tmp;
        }
    }

    public static void main(String[] args) {
        No_70 t = new No_70();

        // Test Case
        int n = 44;

        System.out.println(t.climbStairs(n));
    }
}
