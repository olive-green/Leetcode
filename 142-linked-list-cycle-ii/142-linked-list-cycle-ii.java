/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null)
            return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode target=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow )
            {
                while(target!=fast){
                    target=target.next;
                    fast=fast.next;
                }
                return fast;
            }
            
        }
        return null;
    }
}