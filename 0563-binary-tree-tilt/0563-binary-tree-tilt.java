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
    private int totalSum = 0;
    public  int tree(TreeNode n) {
        if (n == null) {
            return 0;
        }
        int leftSum = tree(n.left);
        int rightSum = tree(n.right);
        int s = Math.abs(leftSum - rightSum);
        totalSum += s;
        return leftSum + rightSum + n.val;
    }
    public int findTilt(TreeNode root) {
        tree(root);
        return totalSum;
    }
}
