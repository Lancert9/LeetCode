package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Lancer on 2016/3/31.
 */
public class No_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                int index = map.get(key);
                if (i - index <= k) {
                    return true;
                }
                else {
                    map.put(key, i);
                }
            }
            else {
                map.put(key, i);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        No_219 t = new No_219();

        // Test Case
        int[] A = {1, 2, 3, 4, 5, 3, 2, 1};

        System.out.println(t.containsNearbyDuplicate(A, 3));
    }
}
