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
    public int sumOfLeftLeaves(TreeNode root) {
        return sum(root,false);
    }
    public int sum(TreeNode n,Boolean v){
        if(n==null){
            return 0;
        }
        if(n.left==null && n.right==null){
            if(v){
                return n.val;
            }
            else{
                return 0;
            }
        }
        int l=sum(n.left,true);
        int r=sum(n.right,false);
        return l+r;
    }
}