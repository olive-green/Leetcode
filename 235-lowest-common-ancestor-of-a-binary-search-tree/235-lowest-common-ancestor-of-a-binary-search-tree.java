/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public List<TreeNode> path(TreeNode root,TreeNode n){
        ArrayList<TreeNode> ans=new ArrayList<>();
        if(root==null)
            return ans;
        if(root==n)
        {
            ans.add(root);
            return ans;
        }
        if(root.val>n.val){
            List<TreeNode> left=path(root.left,n);
            if(left.size()>0){
                left.add(root);
                return left;
            }
        }
        else{
            List<TreeNode> right=path(root.right,n);
            if(right.size()>0){
                right.add(root);
                return right;
            }
        }
        return ans;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<TreeNode> l1=path(root,p);
         List<TreeNode> l2=path(root,q);
        int i=0;
        int min=Math.min(l1.size(),l2.size());
        System.out.println(l1);
        System.out.println(l2);
        TreeNode ans=null;
        while(i<min){
            if(l1.get(l1.size()-1-i)==l2.get(l2.size()-1-i)){
                ans= l2.get(l2.size()-1-i);
            }
            i++;
        }
        return ans;
    }
}