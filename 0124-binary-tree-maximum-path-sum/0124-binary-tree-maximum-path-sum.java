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
    public int max=-10000000;
    public int maxPathSum(TreeNode root) {
        maxPathSumm(root);
        return max;
    }
    public int maxPathSumm(TreeNode root){
        if(root==null){
            return 0;
        }

        int lH=Math.max(0,maxPathSumm(root.left));
        int rH=Math.max(0,maxPathSumm(root.right));

        max=Math.max(max,root.val+lH+rH);

        return Math.max(lH,rH)+root.val;
    }
}