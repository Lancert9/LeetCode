package LeetCode;

/**
 * Lancer on 2016/3/31.
 */
public class No_9 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int p = 0;
        int q = s.length() - 1;
        while (p < q) {
            if (s.charAt(p) != s.charAt(q)) {
                return false;
            }
            p++;
            q--;
        }
        return true;
    }

    public static void main(String[] args) {
        No_9 t = new No_9();

        // Test Case
        int a = 1552525151;

        System.out.println(t.isPalindrome(a));
    }
}
