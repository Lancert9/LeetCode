package LeetCode;

import java.util.Arrays;

/**
 * Lancer on 2016/3/25.
 */
public class No_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int p = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[p] = nums1[i];
                i--;
            }
            else {
                nums1[p] = nums2[j];
                j--;
            }
            p--;
        }
        if (i < 0) {
            System.arraycopy(nums2, 0, nums1, 0, j + 1);
        }
    }

    public static void main(String[] args) {
        No_88 t = new No_88();

        // Test Case
//        int[] A = {1, 3, 5, 0, 0, 0};
//        int[] B = {2, 4, 6};

//        int[] A = {2, 4, 6, 0, 0, 0};
//        int[] B = {1, 3, 5};

        int[] A = {1};
        int[] B = {};

        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        t.merge(A, 1, B, 0);
        System.out.println(Arrays.toString(A));
    }
}
