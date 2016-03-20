package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Lancer on 2016/3/20.
 */


public class No_290 {
    public boolean wordPattern(String pattern, String str) {
        if (pattern == null) {
            return str == null;
        }
        else if (pattern.equals("")) {
            return false;
        }
        else {
            String[] strArray = str.split(" ");
            if (strArray.length != pattern.length()) {
                return false;
            }
            HashMap<Character, String> map = new HashMap<>();
            for (int i = 0; i < pattern.length(); i++) {
                char key = pattern.charAt(i);
                if (map.containsKey(key)) {
                    if (!strArray[i].equals(map.get(key))) {
                        return false;
                    }
                }
                else {
                    if (map.containsValue(strArray[i])) {
                        return false;
                    }
                    else {
                        map.put(key, strArray[i]);
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        No_290 t = new No_290();

        // Test Case
        // String pattern = "abba";
        // String str = "cat dog dog cat";
         String pattern = "abba";
         String str = "dog dog dog dog";
        // String pattern = "";
        // String str = "";
        // String pattern = null;
        // String str = "";

        boolean result = t.wordPattern(pattern, str);
        System.out.println(result);
    }

}
