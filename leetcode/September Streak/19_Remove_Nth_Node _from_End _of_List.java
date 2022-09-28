class Solution {
   
    int length(ListNode head){
        if(head==null)return 0;
        return 1+length(head.next);
    }
    ListNode remove(ListNode head,int index){
        if(index==0)return head;
        if(head==null)return null;
        if(index==1)return head.next;
        ListNode removed= remove(head.next,index-1);
        head.next=removed;
        return head;
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        if(head==null)return null;
        if(head.next==null && n==1)return null;
        int length=length(head);
        ListNode removed=remove(head.next,length-n);
        if(length-n==0)return removed;
        head.next=removed;
        return head;
                
    }
}
