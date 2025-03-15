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
    public int rob(TreeNode root) {
        int[] r=robb(root);
        return Math.max(r[0],r[1]);
    }
    public int[] robb(TreeNode node){
        if(node==null){
            return new int[2];
        }

        int[] leftResult=robb(node.left);
        int[] rightResult=robb(node.right);

        int robCurrentNode=node.val+leftResult[1]+rightResult[1];

        int notrobCurrentNode=Math.max(leftResult[0],leftResult[1])+Math.max(rightResult[0],rightResult[1]);
        return new int[]{robCurrentNode,notrobCurrentNode};
    }
}