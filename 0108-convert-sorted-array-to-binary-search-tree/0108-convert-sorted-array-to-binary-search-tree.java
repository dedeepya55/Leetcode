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
    public TreeNode tree(int[] nums,int left,int right){
        if(left>right){
            return null;
        }
        int mid=(left+right)/2;
        TreeNode n=new TreeNode(nums[mid]);
        n.left=tree(nums,left,mid-1);
        n.right=tree(nums,mid+1,right);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
       return tree(nums,0,nums.length-1);
    }
}