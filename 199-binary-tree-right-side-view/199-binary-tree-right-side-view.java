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
//     public void solve(TreeNode head,List<Integer> ans){
//         if(head==null)
//             return;
//         if(head.right==null && head.left!=null){
//             System.out.println(head.left.val);
//              ans.add(head.left.val);
//         }
//         ans.add(head.val);
//        solve(head.right,ans);
        
//     }
//     public List<Integer> rightSideView(TreeNode root) {
//         List<Integer> ans=new ArrayList<>();
//         TreeNode head=root;
//         solve(head,ans);
//         return ans;
//     }
    
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList list = new ArrayList();
        rightSideView(root, 0, list);
        
        return list;
    }
    
    public void rightSideView(TreeNode root, int level, ArrayList list) {
        if(root == null) return;

        if(list.size() == level)
            list.add(root.val);

        rightSideView(root.right, level + 1, list);
        rightSideView(root.left, level + 1, list);
    }
}