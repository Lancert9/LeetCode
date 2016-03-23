package LeetCode;

/**
 * Lancer on 2016/3/23.
 */
public class No_38 {
    public String countAndSay(int n) {
        if (n <= 1) {
            return "1";
        }
        if (n == 2) {
            return "11";
        }
        String str = "11";
        int loop = 3;
        while (loop <= n) {
            String seq = "";
            int count = 0;
            char tmp = str.charAt(0);
            for (int i = 0; i < str.length(); i++) {
                char ele = str.charAt(i);
                if (tmp == ele) {
                    count += 1;
                }
                else {
                    seq = seq + count + tmp;
                    tmp = ele;
                    count = 1;
                }
            }
            seq = seq + count + tmp;
            str = seq;
            loop += 1;
        }
        return str;
    }


    public static void main(String[] args) {
        No_38 t = new No_38();

        // Test Case
        System.out.println(t.countAndSay(5));
    }
}
