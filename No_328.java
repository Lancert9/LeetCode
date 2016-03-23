package LeetCode;

import java.util.List;

/**
 * Lancer on 2016/3/23.
 */
public class No_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode head_2 = head.next;
        ListNode p_1 = head;
        ListNode p_2 = head_2;
        while (p_1.next != null && p_2.next != null) {
            p_1.next = p_2.next;
            p_1 = p_2.next;
            p_2.next = p_1.next;
            p_2 = p_1.next;
        }
        p_1.next = head_2;
        return head;
    }

    public static void main(String[] args) {
        No_328 t = new No_328();

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

        ListNode tmp = node_1;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }

        System.out.println("###############");

        ListNode result = t.oddEvenList(node_1);
        tmp = result;
        while (tmp != null) {
            System.out.println(tmp.val);
            tmp = tmp.next;
        }
    }
}
