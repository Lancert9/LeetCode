package LeetCode;

/**
 * Lancer on 2016/3/19.
 *
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class No_206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        else{
            ListNode tail = doReverse(head, head.next);
            head.next = null;
            return tail;
        }
    }

    public ListNode doReverse(ListNode left, ListNode right){
        if (right.next != null){
            ListNode tail = doReverse(right, right.next);
            right.next = left;
            return tail;
        }
        else{
            right.next = left;
            return right;
        }
    }

    public static void main(String[] args){
        No_206 t = new No_206();
        ListNode node_1 = new ListNode(1);
        ListNode node_2 = new ListNode(2);
        ListNode node_3 = new ListNode(3);

//        node_1.next = node_2;
//        node_2.next = node_3;
//        node_3.next = null;

//        node_1.next = null;

        node_1 = null;

        ListNode node_reverse = t.reverseList(node_1);
        while(node_reverse != null){
            System.out.println(node_reverse.val);
            node_reverse = node_reverse.next;
        }
    }
}

