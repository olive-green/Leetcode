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
    public int size(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         if(head.next==null)
//             return head=null;
//         int siz=size(head);
//         if(n==siz){
//             head=head.next;
//             return head;
//         }
        
//         ListNode slow=head;
//         ListNode fast=head;
//         for(int i=1;i<n;i++){
//             fast=fast.next;
//         }
//         while(fast.next!=null && fast.next.next!=null){
//             fast=fast.next;
//             slow=slow.next;
//         }
//         //NOW SLOW IS POINTING PREV NODE OF TARGET NODE
//         //SO WE HAVE TO JUST POINT THIS NODE TO TARGET.NEXT
//         slow.next=slow.next.next;
//         return head;
      
        if(head.next==null)
            return head=null;
//         //first we move A pointer to k then move both A and B till A!=null after that B is at k-1th position
        ListNode fakeHead=new ListNode(-1);
        fakeHead.next=head;
        ListNode a=fakeHead;
        ListNode b=fakeHead;
        
        
        for(int i=0;i<=n;i++){
            a=a.next;
        }
        
        while(a!=null ){
            a=a.next;
            b=b.next;
        }
        //now b points to one previous of kth node
        b.next=b.next.next;
        return fakeHead.next;
      
        
    }
}