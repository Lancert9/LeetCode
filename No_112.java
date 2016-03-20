package LeetCode;

/**
 * Lancer on 2016/3/20.
 */
public class No_112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        int residual = sum - root.val;
        if (root.left == null && root.right == null) {
            if (residual == 0) {
                return true;
            }
            else {
                return false;
            }
        }
        boolean try_left = false;
        boolean try_right = false;
        if (root.left != null) {
            try_left = hasPathSum(root.left, residual);
        }
        if (root.right != null) {
            try_right = hasPathSum(root.right, residual);
        }
        return try_left || try_right;
    }

    public static void main(String[] args) {
        No_112 t = new No_112();

        TreeNode node_1 = new TreeNode(5);
        TreeNode node_2 = new TreeNode(4);
        TreeNode node_3 = new TreeNode(8);
        TreeNode node_4 = new TreeNode(11);
        TreeNode node_5 = new TreeNode(13);
        TreeNode node_6 = new TreeNode(4);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(2);
        TreeNode node_9 = new TreeNode(1);

        node_1.left = node_2;
        node_1.right = node_3;
        node_2.left = node_4;
        node_3.left = node_5;
        node_3.right = node_6;
        node_4.left = node_7;
        node_4.right = node_8;
        node_6.right = node_9;

        boolean result = t.hasPathSum(node_1, 21);
        System.out.println(result);
    }
}
