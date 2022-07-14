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
    public static HashMap<Integer,Integer> mp=new HashMap<>();
    public static int preIndex;
    public TreeNode getAns(int[] preorder, int[] inorder ,int preStart,int preEnd,int instart,int inend){
        //base case
        if(instart>inend || preStart>preEnd)
            return null;
        
        int preElement=preorder[preStart];
        TreeNode newNode=new TreeNode(preElement);
        
    
        //find index in inorder
        int inIndex=0;
        if(mp.containsKey(preElement))
            inIndex=mp.get(preElement);
        
        int numsLeft=inIndex-instart;
        newNode.left=getAns(preorder,inorder,preStart+1,preStart+numsLeft,instart,inIndex-1);
        newNode.right=getAns(preorder,inorder,preStart+numsLeft+1,preEnd,inIndex+1,inend);
        
        return newNode;
        
        
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // TreeNode root=new TreeNode();/
        
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        TreeNode root=getAns(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
        return root;
    }
}