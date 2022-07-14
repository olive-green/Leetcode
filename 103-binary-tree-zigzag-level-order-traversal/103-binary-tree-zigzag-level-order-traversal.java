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
//     public void getAns(TreeNode root,List<Integer> level,List<List<Integer>> ans,boolean zigzag){
//         if(root==null)
//         {
//             ans.add(new ArrayList<>(level));
//             return;
//         }
        
//         for(int i=0;)
//     }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        if(root==null)
            return ans;
        boolean zigzag=false;
        
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            
            int size=q.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode top=q.poll();
                if (zigzag) {
                    level.add(0, top.val);
                    
                }
                else {
                    level.add(top.val);
                }
                
                if (top.left != null) {
                    q.add(top.left);
                }
                if (top.right != null) {
                    q.add(top.right);
                }
                
            }
            ans.add(level);
            zigzag=!zigzag;
        }
        return ans;
    }
}