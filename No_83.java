package LeetCode;

/**
 * Lancer on 2016/3/30.
 */
public class No_83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head != null) {
            int val = head.val;
            ListNode node = head;
            while (node.next != null) {
                if (node.next.val == val) {
                    node.next = node.next.next;
                }
                else {
                    val = node.next.val;
                    node = node.next;
                }
            }
        }
        return head;
    }

    public static void main(String[] args) {
        No_83 t = new No_83();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(1);
        ListNode node_3 = new ListNode(2);
        ListNode node_4 = new ListNode(2);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;

        ListNode node_tmp = node_1;
        System.out.print(node_tmp.val);
        while (node_tmp.next != null) {
            node_tmp = node_tmp.next;
            System.out.print(" -> " + node_tmp.val);
        }

        node_1 = t.deleteDuplicates(node_1);
        ListNode node_tmp_2 = node_1;
        System.out.print("\n" + node_tmp_2.val);
        while (node_tmp_2.next != null) {
            node_tmp_2 = node_tmp_2.next;
            System.out.print(" -> " + node_tmp_2.val);
        }
    }
}
