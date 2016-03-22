package LeetCode;

import java.util.*;

/**
 * Lancer on 2016/3/21.
 */
public class No_107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        Stack<Integer> data_stack = new Stack<>();
        Stack<Integer> residual_stack = new Stack<>();
        if (root != null) {
            int residual = 1;
            int next_residual = 0;
            residual_stack.push(1);
            queue.add(root);
            while (!queue.isEmpty()) {
                if (residual == 0) {
                    residual_stack.push(next_residual);
                    residual = next_residual;
                    next_residual = 0;
                }
                TreeNode node = queue.remove();
                residual -= 1;
                data_stack.push(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    next_residual += 1;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    next_residual += 1;
                }
            }
            while (!residual_stack.isEmpty()) {
                int level_residual = residual_stack.pop();
                List<Integer> level_data = new ArrayList<>();
                Stack<Integer> tmp_stack = new Stack<>();

                for (int i = 0; i < level_residual; i++) {
                    tmp_stack.add(data_stack.pop());
                }
                for (int i = 0; i < level_residual; i++) {
                    level_data.add(tmp_stack.pop());
                }
                result.add(level_data);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No_107 t =  new No_107();
        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_5 = new TreeNode(5);
        TreeNode node_6 = new TreeNode(6);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(8);
        TreeNode node_9 = new TreeNode(9);

        node_1.left = node_2; node_1.right = node_3;
        node_2.right = node_7;
        node_3.left = node_4; node_3.right = node_5;
        node_7.left = node_8;

        List<List<Integer>> result = t.levelOrderBottom(node_1);
        for (List<Integer> list: result) {
            System.out.println(list.toString());
        }
    }
}
