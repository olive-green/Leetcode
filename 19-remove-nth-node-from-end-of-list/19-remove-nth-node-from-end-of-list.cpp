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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head==NULL || head->next==NULL)
        {
            if(head->next==NULL && n==1)
                return NULL;
            
        }
        ListNode* ans=new ListNode(-1);
        ans->next=head;
        ListNode* temp=ans;
        ListNode* slow=ans;
        ListNode* fast=ans;
        for(int i=0;i<n;i++)
        {
            fast=fast->next;
        }
        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next;
        }
        
        slow->next=slow->next->next;
        
        return temp->next;
    }
};