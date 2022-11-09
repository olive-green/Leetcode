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
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode* ans=new ListNode(-1);
        ListNode* temp=ans;
        while(l1!=NULL && l2!=NULL){
            if(l1->val<l2->val){
                ans->next=l1;
                ans=ans->next;
                l1=l1->next;
            }
            else
            {
                ans->next=l2;
                ans=ans->next;
                l2=l2->next;
            }
        }
        //if second list gets empty then we insert all remaining l1 element
        while(l1!=NULL){
            ans->next=l1;
            ans=ans->next;
            l1=l1->next;
        }
        while(l2!=NULL){
            ans->next=l2;
                ans=ans->next;
                l2=l2->next;
        }
        return temp->next;
    }
};