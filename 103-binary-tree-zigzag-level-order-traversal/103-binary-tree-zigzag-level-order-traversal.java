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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<List<Integer>>() {{}};
        //to track from which side we have to print we keeps a flag variable
        //it is a level order traversal 
        Queue<TreeNode> q=new LinkedList<>();
        //adding root node
        q.add(root);
        boolean flag=true;//true reperesent from left to right;
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        while(!q.isEmpty()){
            
            int size=q.size();
            List<Integer> tempAns=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode frontNode=q.poll();
                if(flag)
                tempAns.add(frontNode.val);
                else
                   tempAns.add(0,frontNode.val); 
                //now push left and right child of root node
                if(frontNode.left!=null)
                    q.add(frontNode.left);
                if(frontNode.right!=null)
                    q.add(frontNode.right);
            }
            //reverse flag direction
            flag=!flag;
           ans.add(tempAns);
            
        }
        return ans;
    }
}