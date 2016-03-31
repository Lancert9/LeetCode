package LeetCode;

import java.util.Arrays;

/**
 * Lancer on 2016/3/31.
 */
public class No_27 {
    public int removeElement(int[] nums, int val) {
        int p = -1;
        int q = nums.length - 1;
        while (p < q) {
            if (nums[p + 1] != val) {
                p++;
            }
            else {
                int tmp = nums[q];
                nums[q] = nums[p + 1];
                nums[p + 1] = tmp;
                q--;
            }
        }
        return p + 1;
    }

    public static void main(String[] args) {
        No_27 t = new No_27();

        // Test Case
        int[] A = {3, 2, 2, 3};
        int val = 3;
        System.out.println(Arrays.toString(A));

        int new_length = t.removeElement(A, val);
        System.out.println(new_length);
        System.out.println(Arrays.toString(A));
    }
}
