package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Lancer on 2016/3/31.
 */
public class No_119 {
        public List<Integer> getRow(int rowIndex) {
            ArrayList<Integer> first = new ArrayList<>();
            first.add(1);
            int row = 1;
            ArrayList<Integer> pre_list = first;
            while(row <= rowIndex) {
                ArrayList<Integer> row_list = new ArrayList<>();
                row_list.add(1);
                for (int i = 1; i < row; i++) {
                    int value = pre_list.get(i - 1) + pre_list.get(i);
                    row_list.add(value);
                }
                row_list.add(1);
                pre_list = row_list;
                row++;
            }
            return pre_list;
        }

    public static void main(String[] args) {
        No_119 t = new No_119();

        // Test Case
        int n = 5;

        List<Integer> result = t.getRow(n);
        for (int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
