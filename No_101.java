package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 * Lancer on 2016/3/31.
 */
public class No_101 {
    public boolean isSymmetric(TreeNode root) {
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        left_traverse(root, list_1);
        right_traverse(root, list_2);
        if (list_1.size() == list_2.size()) {
            for (int i = 0; i < list_1.size(); i++) {
                Integer a = list_1.get(i);
                Integer b = list_2.get(i);
                System.out.println(a + "<-->" + b);
                if (a == null) {
                    if (b != null) {
                        return false;
                    }
                }
                else {
                    if (b == null || !a.equals(b)) {
                        return false;
                    }
                }
            }
            return true;
        }
        else {
            return false;
        }
    }

    public void left_traverse(TreeNode node, ArrayList<Integer> list) {
        if (node != null) {
            list.add(node.val);
            if (node.left != null) {
                left_traverse(node.left, list);

            }
            else {
                list.add(null);
            }
            if (node.right != null) {
                left_traverse(node.right, list);
            }
            else {
                list.add(null);
            }
        }
    }

    public void right_traverse(TreeNode node, ArrayList<Integer> queue) {
        if (node != null) {
            queue.add(node.val);
            if (node.right != null) {
                right_traverse(node.right, queue);

            }
            else {
                queue.add(null);
            }
            if (node.left != null) {
                right_traverse(node.left, queue);
            }
            else {
                queue.add(null);
            }
        }
    }

    public static void main(String[] args) {
        No_101 t = new No_101();

        // Test Case
//        TreeNode node_1 = new TreeNode(1);
//        TreeNode node_2 = new TreeNode(2);
//        TreeNode node_3 = new TreeNode(2);
//        TreeNode node_4 = new TreeNode(3);
//        TreeNode node_5 = new TreeNode(4);
//        TreeNode node_6 = new TreeNode(4);
//        TreeNode node_7 = new TreeNode(5);
//
//        node_1.left = node_2; node_1.right = node_3;
//        node_2.left = node_4; node_2.right = node_5;
//        node_3.left = node_6; node_3.right = node_7;

        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(2);
        TreeNode node_4 = new TreeNode(3);
        TreeNode node_5 = new TreeNode(3);

        node_1.left = node_2; node_1.right = node_3;
        node_2.right = node_4; node_3.left = node_5;

        System.out.println(t.isSymmetric(node_1));
    }
}
