public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode leftail = left ; ListNode rightail = right;
        
        while(head != null){
            if(head.val < x){
                leftail.next = head;
                leftail = leftail.next;
            }else{
                rightail.next = head;
                rightail = rightail.next;
            }
            
            head = head.next;
        }
        leftail.next = right.next;
        rightail.next = null;
         return left.next;
    }
}
