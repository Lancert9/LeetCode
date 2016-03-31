package LeetCode;

import MyUtil.MapSortDemo;

import java.util.Arrays;

/**
 * Lancer on 2016/3/31.
 */
public class No_198 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        else if (nums.length == 1) {
            return nums[0];
        }
        else if (nums.length == 2) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        else {
            int length = nums.length;
            int[] max_array = new int[length];
            for (int i = 0; i < length; i++) {
                max_array[i] = -1;
            }
            max_array[length - 1] = nums[length - 1];
            max_array[length - 2] = nums[length - 2];
            max_array[length - 3] = nums[length - 3] + nums[length - 1];
            theMax(nums, 0, length, max_array);
            theMax(nums, 1, length, max_array);
            return max_array[0] > max_array[1] ? max_array[0] : max_array[1];
        }
    }

    public int theMax(int[] nums, int p, int length, int[] max_array){
        if (p < length -3) {
            int max_step_2;
            int max_step_3;
            if (max_array[p + 2] != -1) {
                max_step_2 = nums[p] + max_array[p + 2];
            }
            else {
                max_step_2 = nums[p] + theMax(nums, p + 2, length, max_array);
            }

            if (max_array[p + 3] != -1) {
                max_step_3 = nums[p] + max_array[p + 3];
            }
            else {
                max_step_3 = nums[p] + theMax(nums, p + 3, length, max_array);
            }

            if (max_step_2 > max_step_3) {
                max_array[p] = max_step_2;
                return max_step_2;
            }
            else {
                max_array[p] = max_step_3;
                return max_step_3;
            }
        }
        return max_array[p];
    }

    public static void main(String[] args) {
        No_198 t = new No_198();

        // Test Case
        int[] A = {2, 3, 6, 8, 4, 6, 1, 8, 9};

        System.out.println(t.rob(A));
    }
}
