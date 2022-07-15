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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode slow=head;
        ListNode fast=head;
        //we need a prev pointer which gives us the previous of middle node
        ListNode prev=head;
        
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        //now we have previous node of middle node
        prev.next=slow.next;
        slow=null;
        return head;
    }
}