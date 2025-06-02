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
    int Heigth(TreeNode root){
        if(root==null){
            return 1;
        }
        int lH=Heigth(root.left);
        int rH=Heigth(root.right);
        if(lH==-1||rH==-1||Math.abs(lH-rH)>1){
            return -1;
        }
        return Math.max(lH,rH)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Heigth(root)!=-1){
            return true;
        }
        else{
            return false;
        }
    }
}