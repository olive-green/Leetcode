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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ListNode mid(ListNode head){
        if(head==null)
            return head;
        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=head;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(prev!=null)
            prev.next=null;//to break the mid node from mid+1 to n node
        return slow;
    }
    public TreeNode createBst(ListNode head){
        if(head==null)
            return null;
        ListNode midNode=mid(head);        
        //now this mid is root node
        TreeNode root=new TreeNode(midNode.val);
        if(midNode==head) return root;
        root.left=createBst(head);
        root.right=createBst(midNode.next);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        TreeNode ans=createBst(head);
        return ans;
    }
}