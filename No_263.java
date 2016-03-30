package LeetCode;

/**
 * Lancer on 2016/3/30.
 */
public class No_263 {
    public boolean isUgly(int num) {
        if (num == 0) {
            return false;
        }
        while (num % 2 == 0) {
            num = num / 2;
        }
        while (num % 3 == 0) {
            num = num /3;
        }
        while (num % 5 == 0) {
            num = num / 5;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        No_263 t = new No_263();

        // Test Case
        int n = 6;

        System.out.println(t.isUgly(n));
    }
}
