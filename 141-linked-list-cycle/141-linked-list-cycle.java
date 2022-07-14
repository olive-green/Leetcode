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
    public boolean hasCycle(ListNode head) {
        
        // 1st approach 
        ListNode temp=head;
        // HashMap<ListNode,Integer> mp=new HashMap<>();
        HashSet<ListNode> set=new HashSet<>();
        while(temp!=null){
            // if(!mp.contains(temp)){
            //     mp.put(temp,1);
            // }
            if(!set.contains(temp))
                set.add(temp);
            else
                return true;
            temp=temp.next;
        }
        return false;
    }
}