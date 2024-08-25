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
    public void tree(ArrayList<Integer> n,TreeNode n1){
        if(n1==null){
            return;
        }
        if(n1.left==null && n1.right==null){
            n.add(n1.val);
        }
        tree(n,n1.left);
        tree(n,n1.right);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l=new ArrayList<>();
         ArrayList<Integer> l1=new ArrayList<>();
        tree(l,root1);tree(l1,root2);
        return l.equals(l1);
    }
}