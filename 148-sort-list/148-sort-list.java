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
    public ListNode middle(ListNode head){
        if(head==null)
            return head;
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        if(left==null)
            return right;
        if(right==null)
            return left;
        ListNode ans=new ListNode(0);
        // ans.next=hea
        ListNode prev=ans;
        while(left!=null && right!=null){
            if(left.val<right.val){
                prev.next=left;
                left=left.next;
            }
            else
            {
                prev.next=right;
                right=right.next;
            }
            prev=prev.next;
        }
        while(left!=null){
            prev.next=left;
            left=left.next;
            prev=prev.next;
        }
        while(right!=null){
            prev.next=right;
                right=right.next;
             prev=prev.next;
        }
        return ans.next;
    }
    public ListNode sortList(ListNode head) {
        //we do it by using merge sort
        if(head==null || head.next==null)
            return head;
        //find middle node
        ListNode middleNode=middle(head);
        System.out.println(middleNode.val);
        //divide the list into two halves
        ListNode leftHead=head;
        ListNode rightHead=middleNode.next;
        middleNode.next=null;
        
        //now recursively call to sort left half and right half
         leftHead=sortList(leftHead);
         rightHead=sortList(rightHead);
        
        //now merge sorted these two sorted half
        ListNode ans=merge(leftHead,rightHead);
        return ans;
    }
}