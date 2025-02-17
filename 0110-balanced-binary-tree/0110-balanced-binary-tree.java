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
    public int balan(TreeNode root){
       if(root==null) return 0;
       int leftH=balan(root.left);
       int rightH=balan(root.right);
       if(leftH==-1 || rightH==-1 || (Math.abs(leftH-rightH)>1)){
        return -1;
       }
       return Math.max(leftH,rightH)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        return balan(root) !=-1;
    }
}