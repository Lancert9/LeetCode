package LeetCode;

import java.util.Arrays;

/**
 * Lancer on 2016/3/25.
 */
public class No_283 {
    public void moveZeroes(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p] = nums[i];
                p++;
            }
        }
        for (int i = p; i < nums.length; i++) {
            nums[p] = 0;
            p++;
        }
    }

    public static void main(String[] args) {
        No_283 t = new No_283();

        // Test Case
        int[] A = {0, 1, 0, 3, 12};

        System.out.println(Arrays.toString(A));
        t.moveZeroes(A);
        System.out.println(Arrays.toString(A));
    }
}
