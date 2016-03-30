package LeetCode;

/**
 * Lancer on 2016/3/30.
 */
public class No_235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max;
        int min;
        if (p.val > q.val) {
            max = p.val;
            min = q.val;
        }
        else if (p.val < q.val){
            max = q.val;
            min = p.val;
        }
        else {
            return p;
        }
        TreeNode result_node = root;
        TreeNode tmp_node = root;
        while (tmp_node != null) {
            int tmp_value = tmp_node.val;
            if (min < tmp_value && max > tmp_value ) {
                break;
            }
            else if (min > tmp_value) {
                if (tmp_node.left == null) {
                    result_node = null;
                    break;
                }
                tmp_node = tmp_node.right;
                result_node = tmp_node;

            }
            else if (max < tmp_value) {
                if (tmp_node.right == null) {
                    result_node = null;
                    break;
                }
                tmp_node = tmp_node.left;
                result_node = tmp_node;
            }
            else  {
                result_node = tmp_node;
                break;
            }
        }
        return result_node;
    }

    public static void main(String[] args) {
        No_235 t = new No_235();

        // Test Case
        TreeNode node_6 = new TreeNode(6);
        TreeNode node_8 = new TreeNode(8);
        TreeNode node_2 = new TreeNode(2);
        TreeNode node_0 = new TreeNode(0);
        TreeNode node_4 = new TreeNode(4);
        TreeNode node_7 = new TreeNode(7);
        TreeNode node_9 = new TreeNode(9);
        TreeNode node_3 = new TreeNode(3);
        TreeNode node_5 = new TreeNode(5);

        node_6.left = node_2; node_6.right = node_8;
        node_2.left = node_0; node_2.right = node_4;
        node_8.left = node_7; node_8.right = node_9;
        node_4.left = node_3; node_4.right = node_5;

        TreeNode result =  t.lowestCommonAncestor(node_6, node_0, node_5);
        System.out.println(result.val);

    }
}
