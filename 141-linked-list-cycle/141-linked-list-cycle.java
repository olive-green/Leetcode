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
        // ListNode temp=head;
        // HashMap<ListNode,Integer> mp=new HashMap<>();
        // HashSet<ListNode> set=new HashSet<>();
        // while(temp!=null){
        //     // if(!mp.contains(temp)){
        //     //     mp.put(temp,1);
        //     // }
        //     if(!set.contains(temp))
        //         set.add(temp);
        //     else
        //         return true;
        //     temp=temp.next;
        // }
        // return false;
        
        
        // 2nd approach
        //using floyad cycle detection algo , in which we use fast and slow pointer when both are same return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
            if(fast==slow)
            {
                System.out.println(fast.val);
                return true;
            }
                
        }
        return false;
        
    }
}