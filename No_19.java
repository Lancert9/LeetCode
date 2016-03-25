package LeetCode;

import java.util.List;

/**
 * Lancer on 2016/3/25.
 */
public class No_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n < 1) {
            return head;
        }
        ListNode p = head;
        for (int i = 0; i < n - 1; i++) {
            if (p == null) {
                break;
            }
            p = p.next;
        }
        if (p == null) {
            return head;
        }
        else if (p.next == null) {
            return head.next;
        }
        else {
            p = p.next.next;
            ListNode q = head;
            while (p != null) {
                p = p.next;
                q = q.next;
            }
            q.next = q.next.next;
            return head;
        }
    }

    public static void main(String[] args) {
        No_19 t = new No_19();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        ListNode node_7 = new ListNode(7);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = node_4;
        node_4.next = node_5;
        node_5.next = node_6;
        node_6.next = node_7;

        int k = 8;
        ListNode result =  t.removeNthFromEnd(node_1, k);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
