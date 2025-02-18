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
    List<List<Integer>> l=new ArrayList<>();
    public void goo(TreeNode root,int level){
        if(root==null) return;
        if(l.size()<=level){
            l.add(new ArrayList<>());
        } 
        l.get(level).add(root.val);
        goo(root.left,level+1);
        goo(root.right,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        if(root==null) return 0;
        goo(root,0);
        return l.get(l.size()-1).get(0);
    }
}