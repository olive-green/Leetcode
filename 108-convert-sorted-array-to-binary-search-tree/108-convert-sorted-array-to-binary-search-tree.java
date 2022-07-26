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
    public TreeNode createBst(int[] nums,int i,int j){
        if(i==j) return new TreeNode(nums[i]);
        if(i>j)  return null;
        int mid=(i+j)/2;
        //now this mid is root node
        TreeNode root=new TreeNode(nums[mid]);
        root.left=createBst(nums,i,mid-1);
        root.right=createBst(nums,mid+1,j);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
           TreeNode ans=createBst(nums,0,nums.length-1);
        return ans;
    }
}