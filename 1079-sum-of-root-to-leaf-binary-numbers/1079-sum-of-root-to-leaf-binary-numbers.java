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
    int ts=0;
    public void sumRootToLeaf2(TreeNode n,int c){
        if(n==null){
            return;
        }
        c=c*2+n.val;
        if(n.left==null && n.right==null){
            ts=ts+c;
            System.out.println(ts);
        }
    //    System.out.println(c);
        sumRootToLeaf2(n.left,c);
        sumRootToLeaf2(n.right,c);
    }
    public int sumRootToLeaf(TreeNode root) {
        sumRootToLeaf2(root,0);
        return ts;
    }
}