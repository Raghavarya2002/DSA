/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) 
    {
        if(!list1) return list2;
        if(!list2) return list1;
        ListNode* k1 = list1;
        ListNode* k2 = list2;
        ListNode* c1 = list1;
        if(list1->val > list2->val)
        {
            
            c1 = k2;
            k2 = k2->next;
        }
        else k1 = k1->next;
        ListNode* head = c1;
        while(k1 && k2)
        {
            if(k1->val < k2->val)
            {
                c1->next = k1;
                k1 = k1->next;
                
            }
            else
            {
                c1->next = k2;
                k2 = k2->next;
            }
            c1 = c1->next;
        }
        if(!k1) c1 ->next = k2;
        else c1->next = k1;
         
        return head;
    }
};