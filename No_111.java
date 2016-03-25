package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        else if (root.right == null) {
            return minDepth(root.left) + 1;
        }
        else if (root.left == null) {
            return minDepth(root.right) + 1;
        }
        else {
            int left_length = minDepth(root.left) + 1;
            int right_length = minDepth(root.right) + 1;
            return left_length <= right_length ? left_length : right_length;
        }
    }

    public static void main(String[] args) {
        No_111 t = new No_111();

        // Test Case
        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_5 = new TreeNode(5);
        TreeNode node_6 = new TreeNode(6);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(8);

        node_1.left = node_2; node_1.right = node_3;
        node_2.left = node_4; node_2.right = node_5;
        node_3.left = node_6; node_3.right = node_7;
        node_4.left = node_8;

        System.out.println(t.minDepth(node_1));
    }
}
