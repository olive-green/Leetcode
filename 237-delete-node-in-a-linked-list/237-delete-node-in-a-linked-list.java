/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        //since we cannot go back to prev node so we can copy its next node to it and delete next node
        node.val=node.next.val;
        node.next=node.next.next;
    }
}