Definition for singly-linked list.
public class ListNode {
int val;
ListNode next;
ListNode() {}
ListNode(int val) { this.val = val; }
ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    static ListNode curr;
    public boolean isPalindrome(ListNode head) {
        curr = head;
        
        return ans(head);
    }
    
    public boolean ans(ListNode head){
        if(head == null) return true;
        
        boolean var = ans(head.next);
        
        if(var == true){
            if(head.val != curr.val){
                return false;
            }
            curr = curr.next;
            return true;
        }
        return false;
    }
}
