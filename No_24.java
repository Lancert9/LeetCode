package LeetCode;

/**
 * Lancer on 2016/3/30.
 */
public class No_24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode head_tmp = new ListNode(0);
        ListNode pre_node = head_tmp;
        pre_node.next = head;
        ListNode cur_node = head;
        ListNode next_node;
        while (cur_node != null && cur_node.next != null) {
            next_node = cur_node.next;

            cur_node.next = next_node.next;
            next_node.next = cur_node;
            pre_node.next = next_node;

            pre_node = cur_node;
            cur_node = cur_node.next;
        }
        return head_tmp.next;
    }

    public static void main(String[] args) {
        No_24 t = new No_24();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;

        ListNode node_tmp = node_1;
        System.out.print(node_tmp.val);
        while (node_tmp.next != null) {
            node_tmp = node_tmp.next;
            System.out.print(" -> " + node_tmp.val);
        }

        node_tmp = t.swapPairs(node_1);
        System.out.print("\n" + node_tmp.val);
        while (node_tmp.next != null) {
            node_tmp = node_tmp.next;
            System.out.print(" -> " + node_tmp.val);
        }
    }
}
