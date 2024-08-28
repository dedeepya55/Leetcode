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
    public void tree(TreeNode n,List<Integer> l){
        if(n==null){
            return;
        }
        l.add(n.val);
        tree(n.left,l);
        tree(n.right,l);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> l=new ArrayList<>();
        tree(root,l);
        for(int i=0;i<l.size();i++){
            for(int j=i+1;j<l.size();j++){
                if(l.get(i)+l.get(j)==k){
                    return true;
                }
            }
        }
        return false;
    }
}