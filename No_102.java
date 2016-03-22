package LeetCode;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Lancer on 2016/3/21.
 */
public class No_102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
            result.add(new ArrayList<Integer>());
            int level = 0;
            int residual = 1;
            int next_residual = 0;
            while (!queue.isEmpty()) {
                if (residual == 0) {
                    level += 1;
                    residual = next_residual;
                    next_residual = 0;
                    result.add(new ArrayList<Integer>());
                }
                List<Integer> level_data = result.get(level);
                TreeNode node = queue.remove();
                residual -= 1;
                level_data.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                    next_residual += 1;
                }
                if (node.right != null) {
                    queue.add(node.right);
                    next_residual += 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No_102 t =  new No_102();
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

        List<List<Integer>> result = t.levelOrder(node_1);
        for (List<Integer> list: result) {
            System.out.println(list.toString());
        }
    }
}
