package LeetCode;

import java.util.HashMap;

/**
 * Lancer on 2016/3/30.
 */
public class No_171 {
    public int titleToNumber(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (! map.containsKey(tmp)) {
                int value = (int)tmp - 64;
                map.put(tmp, value);
            }
        }
        int sum = 0;
        int k = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));
            sum += k * value;
            k *= 26;
        }
        return sum;
    }

    public static void main(String[] args) {
        No_171 t = new No_171();

        // Test Case
        String[] A = {"A", "B", "C", "Z", "AA", "AB"};

        for (String ele : A) {
            System.out.println(ele + " : " + t.titleToNumber(ele));
        }
    }
}
