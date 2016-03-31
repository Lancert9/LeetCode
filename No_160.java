package LeetCode;

/**
 * Lancer on 2016/3/31.
 */
public class No_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int count_A = 0;
        int count_B = 0;
        ListNode tmp = headA;

        while (tmp != null) {
            count_A++;
            tmp = tmp.next;
        }

        tmp = headB;
        while (tmp != null) {
            count_B++;
            tmp = tmp.next;
        }

        if (count_A > count_B) {
            int delta = count_A - count_B;
            while (delta > 0) {
                headA = headA.next;
                delta--;
            }
        }
        else {
            int delta = count_B - count_A;
            while(delta > 0) {
                headB = headB.next;
                delta--;
            }
        }

        ListNode result = null;
        while(headA != null && headB != null) {
            if (headA == headB) {
                result = headA;
                break;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return result;
    }

    public static void main(String[] args) {
        No_160 t = new No_160();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(4);
        ListNode node_5 = new ListNode(5);
        ListNode node_6 = new ListNode(6);
        ListNode node_7 = new ListNode(7);
        ListNode node_8 = new ListNode(8);

        node_1.next = node_2; node_2.next = node_3; node_3.next = node_4; node_4.next = node_5;
        node_6.next = node_7; node_7.next = node_8; node_8.next = node_3; node_3.next = node_4; node_4.next = node_5;

        System.out.println(t.getIntersectionNode(node_1, node_6).val);
    }
}
