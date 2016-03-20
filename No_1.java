package LeetCode;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Lancer on 2016/3/20.
 */
public class No_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            int delta = target - element;
            if (map.containsKey(delta)) {
                result[0] = map.get(delta);
                result[1] = i;
                break;
            }
            else {
                map.put(element, i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No_1 t = new No_1();

        // Test Case
        int[] A = {15, 7, 11, 2};
        int target = 9;

        int[] result = t.twoSum(A, target);
        System.out.println(Arrays.toString(result));
    }
}
