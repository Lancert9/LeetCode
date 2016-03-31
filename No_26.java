package LeetCode;

import java.util.Arrays;

/**
 * Lancer on 2016/3/31.
 */
public class No_26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int total = 1;
        int cur = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                total++;
                cur = nums[i];
            }
        }
        cur = nums[0];
        int residual = total - 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != cur) {
                int tmp = nums[i];
                nums[i] = nums[total - residual];
                nums[total - residual] = tmp;
                cur = tmp;
                residual--;
                if (residual == 0) {
                    break;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        No_26 t = new No_26();

        // Test Case
        int[] A = {1, 2, 3, 3, 4, 4, 5, 5, 5};
        System.out.println(Arrays.toString(A));

        int new_length = t.removeDuplicates(A);
        System.out.println(new_length);
        System.out.println(Arrays.toString(A));
    }
}
