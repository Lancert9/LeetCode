package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_258 {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        int result = num % 9;
        return result == 0 ? 9 : result;
    }
}
