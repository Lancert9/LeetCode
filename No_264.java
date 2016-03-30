package LeetCode;

import MyUtil.MapSortDemo;

/**
 * Lancer on 2016/3/30.
 */
public class No_264 {
    public int nthUglyNumber(int n) {
        int[] result = new int[n];
        result[0] = 1;
        int index_2 = 0;
        int index_3 = 0;
        int index_5 = 0;
        int i = 1;
        while (i <= n-1) {
            int pre_num = result[i - 1];

            int min_1 = result[index_2] * 2;
            while (min_1 <= pre_num) {
                index_2++;
                min_1 = result[index_2] * 2;
            }

            int min_3 = result[index_3] * 3;
            while (min_3 <= pre_num) {
                index_3++;
                min_3 = result[index_3] * 3;
            }

            int min_5 = result[index_5] * 5;
            while (min_5 <= pre_num) {
                index_5++;
                min_5 = result[index_5] * 5;
            }

            result[i] = Math.min(Math.min(min_1, min_3), min_5);
            i++;
        }
        return result[n - 1];
    }

    public static void main(String[] args) {
        No_264 t = new No_264();

        // Test Case
        int n = 6;

        System.out.println(t.nthUglyNumber(n));
    }
}
