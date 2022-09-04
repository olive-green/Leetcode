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
    public void insertLast(ListNode head,int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return ;
        }
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(-1);
        int carry=0;
        while(l1!=null && l2!=null){
            int value=l1.val+l2.val+carry;  
            //add node at last
            insertLast(ans,value%10);
            
            carry=value/10;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int value=l1.val+carry;  
            //add node at last
            insertLast(ans,value%10);
            
            carry=value/10;
            l1=l1.next;
        }
        while(l2!=null){
            int value=l2.val+carry;  
            //add node at last
            insertLast(ans,value%10);
            
            carry=value/10;
            l2=l2.next;
        }
        while(carry!=0){
            int value=carry;  
            //add node at last
            insertLast(ans,value%10);
            
            carry=value/10;
            // l2=l2.next;
        }
        // System.out.println(ans.val);
        return ans.next;
    }
}