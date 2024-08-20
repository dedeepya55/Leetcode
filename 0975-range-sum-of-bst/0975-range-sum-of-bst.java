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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int c=0;
        if(root.val>=low && root.val<=high){
            c+=root.val;
            System.out.println(root.val);
        }
            c+=rangeSumBST(root.left,low,high);
            c+=rangeSumBST(root.right,low,high);

        return c;
       
    }
}