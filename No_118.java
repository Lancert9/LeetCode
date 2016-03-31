package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Lancer on 2016/3/31.
 */
public class No_118 {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> first = new ArrayList<>();
        first.add(1);
        result.add(first);
        int row = 1;
        ArrayList<Integer> pre_list = first;
        while(row < numRows) {
            ArrayList<Integer> row_list = new ArrayList<>();
            row_list.add(1);
            for (int i = 1; i < row; i++) {
                int value = pre_list.get(i - 1) + pre_list.get(i);
                row_list.add(value);
            }
            row_list.add(1);
            result.add(row_list);
            pre_list = row_list;
            row++;
        }

        return result;
    }

    public static void main(String[] args) {
        No_118 t = new No_118();

        // Test Case
        int n = 5;

        List<List<Integer>> result = t.generate(n);
        for (List<Integer> list : result) {
            for (int ele : list) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
