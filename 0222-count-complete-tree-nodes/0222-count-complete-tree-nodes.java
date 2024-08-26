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
    int c=0;
    public void tree(TreeNode n){
        if(n==null){
            return;
        }
       c=c+1;
       System.out.println(c);
        tree(n.left);
        tree(n.right);
    }
    public int countNodes(TreeNode root) {
        // int c=0;
        tree(root);
        return c;
    }
}