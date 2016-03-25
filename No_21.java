package LeetCode;

import java.util.List;

/**
 * Lancer on 2016/3/25.
 */
public class No_21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode head;
        ListNode p;
        ListNode q;
        if (l1.val <= l2.val) {
            head = l1;
            p = l1;
            q = l2;
        }
        else {
            head = l2;
            p = l2;
            q = l1;
        }
        while (p.next != null) {
            if (p.next.val <= q.val){
                p = p.next;
            }
            else {
                ListNode tmp = q;
                q = p.next;
                p.next = tmp;
                p = tmp;
            }
        }
        p.next = q;
        return head;
    }


    public static void main(String[] args) {
        No_21 t = new No_21();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        ListNode node_7 = new ListNode(7);

//        node_1.next = node_3;
//        node_3.next = node_5;
//        node_2.next = node_4;
//        node_4.next = node_6;

        node_1.next = node_2;
        node_2.next = node_3;
        node_4.next = node_5;
        node_5.next = node_6;

        ListNode result = t.mergeTwoLists(node_1, node_4);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
