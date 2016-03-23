package LeetCode;

import java.util.Arrays;

/**
 * Lancer on 2016/3/23.
 */
public class No_66 {
    public int[] plusOne(int[] digits) {
        int flag = 0;
        int length = digits.length;
        digits[length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i] + flag;
            if (tmp >= 10) {
                flag = 1;
                tmp -= 10;
            }
            else {
                flag = 0;
            }
            digits[i] = tmp;
        }
        if (flag == 1){
            int[] new_digit = new int[length + 1];
            new_digit[0] = 1;
            System.arraycopy(digits, 0, new_digit, 1, length);
            return new_digit;
        }
        else {
            return digits;
        }

    }

    public static void main(String[] args) {
        No_66 t = new No_66();

        // Test case
        int[] A = {9, 9, 9, 9};

        System.out.println(Arrays.toString(A));
        A = t.plusOne(A);
        System.out.println(Arrays.toString(A));
    }
}
