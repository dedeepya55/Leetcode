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
    boolean p=true;
    public void tree(TreeNode n,Set<Integer>l){
        if(n==null){
            return;
        }
        l.add(n.val);
        tree(n.left,l);
        tree(n.right,l);
        if(l.size()>1){
            p=false;
        }
       
    }
    public boolean isUnivalTree(TreeNode root) {
        Set<Integer> l=new HashSet<>();
        tree(root,l);
        return p;
    }
}