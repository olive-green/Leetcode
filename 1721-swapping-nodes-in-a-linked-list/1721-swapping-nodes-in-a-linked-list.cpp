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
    
    ListNode* swapNodes(ListNode* head, int k) {
        ListNode* ans=new ListNode(-1);
        ans->next=head;
        
        ListNode* slow=ans;
        ListNode* fast=ans;
        ListNode* temp=ans;
        for(int i=0;i<k;i++){
            fast=fast->next;
            temp=temp->next;
        }
        while(fast!=NULL){
            fast=fast->next;
            slow=slow->next;
        }
        //now swap values
        swap(temp->val,slow->val);
        return ans->next;
        
    }
};