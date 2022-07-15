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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=temp;
        while(temp!=null){
            while(temp!=null && temp.val==val){
                ListNode free=temp;
                temp=temp.next;
                free=null;
                prev.next=temp;
            }   
            prev=temp;
            // if(prev!=null) System.out.println(prev.val);
            temp= (temp!=null)? temp.next : null;
        }
        if(head!=null && head.val==val) return head.next;
        return head;
    }
}