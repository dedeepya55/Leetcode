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
    ArrayList<Integer> l=new ArrayList<>();
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int c=0;
        tree(root,c);
        Collections.sort(l);
        return l.get(0)+1;
    }
    public void tree(TreeNode r,int c){
        if(r==null){
            return;
        }
        if (r.left == null && r.right == null) {
            l.add(c);
            return;
        }
        tree(r.left,c+1);
        tree(r.right,c+1);
    }
}