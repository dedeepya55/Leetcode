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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=levelOrder(root);
        for(int i=1;i<res.size();i+=2){
            Collections.reverse(res.get(i));
        }
        return res;
    }
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        treeTraversal(root,0,res);
        return res;
    }
    public void treeTraversal(TreeNode root,int level,List<List<Integer>> res){
        if(root==null){
            return;
        }
        if(res.size()<=level){
            res.add(new ArrayList<>());
        }

        res.get(level).add(root.val);

        treeTraversal(root.left,level+1,res);
        treeTraversal(root.right,level+1,res);
    }
}