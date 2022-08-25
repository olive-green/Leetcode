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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=head;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head1) {
        //to check palindrome
        // we first find midNode then reverses the list on the mid and compare each element thereafter
        ListNode midNode=middle(head1);
        ListNode head2= reverse(midNode.next);
        
        while(head2!=null){
            if(head1.val!=head2.val)
                return false;
            head1=head1.next;
            head2=head2.next;
        }
        return true;
    }
}