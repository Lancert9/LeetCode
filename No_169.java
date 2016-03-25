package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        else if (nums.length == 1) {
            return nums[0];
        }
        int count = 1;
        int number = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (number == nums[i]) {
                count++;
            }
            else {
                count--;
                if (count == 0) {
                    number = nums[i];
                    count = 1;
                }
            }
        }
//        int verify = 0;
//        for (int ele : nums) {
//            if (ele == number) {
//                verify++;
//            }
//        }
//        return verify >= nums.length / 2 ? number : -1;
        return number;
    }

    public static void main(String[] args) {
        No_169 t = new No_169();

        // Test Case
        int[] A = {};

        System.out.println(t.majorityElement(A));
    }
}
