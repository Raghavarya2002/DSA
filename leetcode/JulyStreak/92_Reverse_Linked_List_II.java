public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode node = new ListNode(-1);
        node.next = head;
        
        //till the leftmost index
        
        ListNode curr = node;
        ListNode prev = null;
        
        for(int i = 0; i < left; i++){
            prev = curr;
            curr = curr.next;
        }
        
        //reverse
        
        ListNode currR = curr;
        ListNode prevR = prev;
        
        
        for(int i = left; i <= right; i++){
            ListNode forward = currR.next;
            currR.next = prevR;
            prevR = currR;
            currR = forward;
        }
        
        prev.next = prevR;
        curr.next = currR;
        
        return node.next;
        

        
    }
}
