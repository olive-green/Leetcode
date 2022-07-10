/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void insertAtLast(ListNode head,int data){
        ListNode newNode=new ListNode(data,null);
        // newNode.next=null;
        if(head==null){
            head=newNode;
            // return head;
            return;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        // return head;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        // ListNode ans=null;
        ListNode ans=new ListNode(-1); //we do this so that we do not need to return head from above function
        while(l1!=null && l2!=null){
            int sum=(l1.val+l2.val+carry);
            // System.out.println(sum);
            carry=sum/10;
            int value=sum%10;
            // ans=insertAtLast(ans,value); 
            insertAtLast(ans,value);
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum=(l1.val+carry);
            carry=sum/10;
            int value=sum%10;
            // ans=insertAtLast(ans,value);
            insertAtLast(ans,value);
            l1=l1.next;
        }
        while(l2!=null){
            int sum=(l2.val+carry);
            carry=sum/10;
            int value=sum%10;
            // ans=insertAtLast(ans,value); 
            insertAtLast(ans,value);
            l2=l2.next;
        }
        //if both lists are same then its carry should be added to result list
            while(carry!=0){
                int sum=carry;
                int digit=sum%10;
                carry=sum/10;
                // ans=insertAtLast(ans,digit);
                insertAtLast(ans,digit);
            }
        // return ans;
        return ans.next;
    }
}