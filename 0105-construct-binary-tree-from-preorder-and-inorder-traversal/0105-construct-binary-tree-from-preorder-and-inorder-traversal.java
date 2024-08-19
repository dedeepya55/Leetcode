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
    public int ind=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    } 
    public TreeNode build(int[] preorder, int[] inorder,int i,int j){
        if(i>j){
            return null;
        }
     TreeNode root=new TreeNode(preorder[ind++]);
     int o=0;
        for(int k=0;k<inorder.length;k++){
            if(inorder[k]==root.val){
                o=k;
                break;
            }
        }
        root.left=build(preorder,inorder,i,o-1);
        root.right=build(preorder,inorder,o+1,j);
        return root;
    }
}