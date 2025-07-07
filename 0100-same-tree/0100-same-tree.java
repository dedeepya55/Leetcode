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
    public void tree(TreeNode n,List<Character> q){
        if(n==null){
            q.add('n');
            return;
        }
        q.add((char)n.val);
        tree(n.left,q);
        tree(n.right,q);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        List<Character> l=new ArrayList<>();
        tree(p,l);
        System.out.println(l);
         List<Character> l1=new ArrayList<>();
        tree(q,l1);
        System.out.println(l1);
        return l.equals(l1);
    }
}