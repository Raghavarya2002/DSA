// There is a singly-linked list head and we want to delete a node node in it.

#include <bits/stdc++.h>
using namespace std;

struct ListNode
 {
     int val;
     ListNode *next;
     ListNode(int x) : val(x), next(NULL) {}
 };

 class Solution
 {
 public:
     void deleteNode(ListNode *node)
     {
         swap(node->val, node->next->val);
         if (node->next->next)
         {
             deleteNode(node->next);
         }
            
         else
             node->next = nullptr;
     }
 };