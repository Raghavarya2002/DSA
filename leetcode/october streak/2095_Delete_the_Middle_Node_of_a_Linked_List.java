/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;
        ListNode prevSlow = null;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prevSlow = slow;
            slow = slow.next;

        }

        prevSlow.next = prevSlow.next.next;
        return head;

    }
}
