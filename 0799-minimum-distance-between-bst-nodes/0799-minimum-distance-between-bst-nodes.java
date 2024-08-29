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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        tree(root,l);
        Collections.sort(l);
        int o=0;int j;int k=Integer.MAX_VALUE;
       for(int i=0;i<l.size()-1;i++){
        j=i+1;
            o=l.get(j)-l.get(i);
            k=Math.min(o,k);
       }
       return k;
    }
    public void tree(TreeNode root,ArrayList<Integer> l){
        if(root==null){
            return;
        }
        l.add(root.val);
        tree(root.left,l);
        tree(root.right,l);
    }
}