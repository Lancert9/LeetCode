package LeetCode;

/**
 * Lancer on 2016/3/25.
 */
public class No_237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        No_237 t = new No_237();

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

        t.deleteNode(node_3);

        while (node_1 != null) {
            System.out.println(node_1.val);
            node_1 = node_1.next;
        }
    }
}
