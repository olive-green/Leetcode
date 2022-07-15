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
        // ListNode temp=head;
        // ListNode prev=temp;
        // while(temp!=null){
        //     while(temp!=null && temp.val==val){
        //         ListNode free=temp;
        //         temp=temp.next;
        //         free=null;
        //         prev.next=temp;
        //     }   
        //     prev=temp;
        //     // if(prev!=null) System.out.println(prev.val);
        //     temp= (temp!=null)? temp.next : null;
        // }
        // if(head!=null && head.val==val) return head.next;
        // return head;
        
        // 2nd approach
        //above is good but in better way
        ListNode fakeHead=new ListNode(-1);
        fakeHead.next=head;
        ListNode curr=head;
        ListNode prev=fakeHead;
        
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            else
                prev=prev.next;
            curr=curr.next;
            
        }
        return fakeHead.next;
    }
}