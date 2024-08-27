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
    public void tree(TreeNode r,List<String>l,String path){
        if(r==null){
            return;
        }
        if(path.length()>0){
            path+="->";
        }
        path+=r.val;
        if(r.left==null && r.right==null){
            l.add(path);
        }
       tree(r.left,l,path);
       tree(r.right,l,path);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> l=new ArrayList<>();
        tree(root,l,"");
        return l;
    }
}