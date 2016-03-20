package LeetCode;

/**
 * Lancer on 2016/3/20.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class No_234 {
    private ListNode head;

    public boolean isPalindrome(ListNode head) {
        this.head = head;
        return (head == null) || (findNext(head));
    }

    public boolean findNext(ListNode node) {
        if (node != null) {
            boolean result = findNext(node.next);
            if (result) {
                if (node.val == head.val) {
                    head = head.next;
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        No_234 t = new No_234();

        // Test Case
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);
        ListNode node_4 = new ListNode(3);
        ListNode node_5 = new ListNode(2);
        ListNode node_6 = new ListNode(1);

        node_1.next = node_2;
        node_2.next = null;
//        node_3.next = node_4;
//        node_4.next = node_5;
//        node_5.next = node_6;

//        node_1.next = null;

//        node_1 = null;

        boolean result = t.isPalindrome(node_1);
        System.out.println(result);
    }
}
