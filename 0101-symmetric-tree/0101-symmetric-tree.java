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
    public boolean isSymmetric(TreeNode root) {
        if(root.left==null && root.right==null){
            return true;
        }
        boolean k=tree(root.left,root.right,false);
        return k;
    }
    public boolean tree(TreeNode n,TreeNode l,boolean f){
        if(n==null && l==null && f==true){
            System.out.println("hello");
            return true;
        }
        if(n==null){System.out.println("hoo");return false;} if(l==null){System.out.println("hii");return false;}
        if(n.val==l.val){
            f=true;
        }
        else{
           f=false;
        }
        // f=tree(n.left,l.right,f);
        // f=tree(n.right,l.left,f);
        return f && tree(n.left,l.right,f) && tree(n.right,l.left,f);
    }
}