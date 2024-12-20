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
    public void reverse(TreeNode left,TreeNode right,int level){
        if(left==null){
            return;
        }
        if(level%2==1){
        int temp=left.val;
        left.val=right.val;
        right.val=temp;
        }
        level++;
        reverse(left.left,right.right,level);
        reverse(left.right,right.left,level);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        if(root==null){
            return root;
        }
        int level=1;
        reverse(root.left,root.right,level);
        return root;
    }
}