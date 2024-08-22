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
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode r1=new TreeNode(0);
        cur=r1;
        inorder(root);
        return r1.right;
    }
    public void inorder(TreeNode node){
        if(node==null){
            return;
        }
        inorder(node.left);
        node.left=null;
        cur.right=node;
        cur=node;
        inorder(node.right);
    }
}