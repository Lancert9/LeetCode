package LeetCode;

/**
 * Lancer on 2016/3/21.
 */
public class No_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        else if (p == null || q == null) {
            return false;
        }
        else {
            int p_value = p.val;
            int q_value = q.val;
            if (p_value != q_value) {
                return false;
            }
            else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        }
    }

    public static void main(String[] args) {
        No_100 t = new No_100();

        TreeNode node_1 = new TreeNode(1);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_4 = new TreeNode(1);
        TreeNode node_5 = new TreeNode(2);
        TreeNode node_6 = new TreeNode(3);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_8 = new TreeNode(6);
        TreeNode node_9 = new TreeNode(9);

        node_1.left = node_2; node_1.right = node_3;
        node_2.right = node_7;
        node_4.left = node_5; node_4.right = node_6;
        node_5.right = node_8;

        boolean result = t.isSameTree(node_1, node_4);
        System.out.println(result);
    }
}
