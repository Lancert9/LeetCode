package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Lancer on 2016/3/20.
 */
public class No_36 {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, ArrayList<HashMap<Integer, Integer>>> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char digit = board[i][j];
                if (digit != '.') {
                    if (map.containsKey(digit)) {
                        ArrayList<HashMap<Integer, Integer>> row_column = map.get(digit);
                        int[] neighbor_row = findNeighbor(i);
                        int[] neighbor_column = findNeighbor(j);
                        int row_1 = neighbor_row[0];
                        int row_2 = neighbor_row[1];
                        int column_1 = neighbor_column[0];
                        int column_2 = neighbor_column[1];

                        for (HashMap<Integer, Integer> r_c : row_column) {
                            if (r_c.containsKey(i) || r_c.containsValue(j)) {
                                return false;
                            }
                            else if (r_c.containsKey(row_1) || r_c.containsKey(row_2)) {
                                if (r_c.containsValue(column_1) || r_c.containsValue(column_2)) {
                                    return false;
                                }
                            }
                        }

                        HashMap<Integer, Integer> new_r_c = new HashMap<>();
                        new_r_c.put(i, j);
                        row_column.add(new_r_c);
                    }
                    else {
                        ArrayList<HashMap<Integer, Integer>> row_column = new ArrayList<>();
                        HashMap<Integer, Integer> first = new HashMap<>();
                        first.put(i, j);
                        row_column.add(first);
                        map.put(digit, row_column);
                    }
                }
            }
        }
        return true;
    }

    public int[] findNeighbor(int num) {
        if (num % 3 == 0) {
            return new int[] {num + 1, num + 2};
        }
        else if (num % 3 == 1) {
            return new int[] {num - 1, num + 1};
        }
        else{
            return new int[] {num - 2, num - 1};
        }
    }

    public static void main(String[] args) {
        No_36 t = new No_36();

        // Test Case
        String[] A = {
                        "....5..1.",
                        ".4.3.....",
                        ".....3..1",
                        "8......2.",
                        "..2.7....",
                        ".15......",
                        ".....2...",
                        ".2.9.....",
                        "..4......"
                    };
//        String[] A = {
//                ".87654321",
//                "2........",
//                "3........",
//                "4........",
//                "5........",
//                "6........",
//                "7........",
//                "8........",
//                "9........"
//        };
//        String[] A = {
//                "..5.....6",
//                "....14...",
//                ".........",
//                ".....92..",
//                "5....2...",
//                ".......3.",
//                "...54....",
//                "3.....42.",
//                "...27.6.."
//        };
//        String[] A = {
//                "..4...63.",
//                ".........",
//                "5.......9",
//                "...56....",
//                "4.3.....1",
//                "...7.....",
//                "...5.....",
//                ".........",
//                "........."
//        };
        char[][] board = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = A[i].charAt(j);
            }
        }

        boolean result = t.isValidSudoku(board);
        System.out.print(result);
    }
}
