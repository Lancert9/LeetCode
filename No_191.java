package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_191 {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; i++){
            if ((n & 1) == 1) {
                count += 1;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        No_191 t = new No_191();

        // Test Case
        int num = -1;

        System.out.println(t.hammingWeight(num));
    }
}
