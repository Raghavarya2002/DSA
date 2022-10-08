/* Question Link :  https://leetcode.com/problems/swap-nodes-in-pairs/*/
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
    ListNode* swapPairs(ListNode* head) 
    {
        if(!head) return nullptr;
        if(head->next == nullptr)return head;
        ListNode* k = head;
        while(k->next)
        {
            
            
            if(k->next->next == nullptr)
            {
                swap(k->val , k->next->val);
                break;
            }
            swap(k->val , k->next->val);
            
            k = k->next->next;
        }
        return head;
    }
};