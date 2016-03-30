package LeetCode;

import java.util.HashSet;

/**
 * Lancer on 2016/3/30.
 */
public class No_217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            if (!set.contains(ele)) {
                set.add(ele);
            }
            else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        No_217 t = new No_217();

        // Test Case
        int[] A = {1, 2, 3, 4, 2, 3};

        System.out.println(t.containsDuplicate(A));
    }
}
