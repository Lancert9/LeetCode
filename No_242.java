package LeetCode;

import java.util.HashMap;

/**
 * Lancer on 2016/3/25.
 */
public class No_242 {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (s.length() != t.length()) {
            return false;
        }
        else {
            for (int i = 0; i < s.length(); i++) {
                char tmp = s.charAt(i);
                if (map.containsKey(tmp)) {
                    int value = map.get(tmp);
                    map.put(tmp, value + 1);
                }
                else {
                    map.put(tmp, 1);
                }
            }
            for (int i = 0; i < t.length(); i++) {
                char tmp = t.charAt(i);
                if (map.containsKey(tmp)) {
                    int value = map.get(tmp);
                    if (value > 0) {
                        map.put(tmp, value - 1);
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            return true;
        }
    }
}
