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
    ListNode* middle(ListNode* head){
        ListNode* slow=head;
        ListNode* fast=head;
        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        return slow;
    }
    ListNode* deleteMiddle(ListNode* head) {
        if(head==NULL || head->next==NULL){
            return NULL;
        }     
        ListNode* middl=middle(head);
        ListNode* temp=head;
        while(temp!=NULL &&temp->next!=middl){
            temp=temp->next;
        }
        if(temp!=NULL)
          temp->next=temp->next->next;
        
        return head;
    }
};