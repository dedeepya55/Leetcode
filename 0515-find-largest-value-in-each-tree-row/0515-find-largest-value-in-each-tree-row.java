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
     public  void levelOrderRec(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) return;
        if (res.size() <= level) 
            res.add(new ArrayList<>());
        res.get(level).add(root.val);
        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }
    public List<Integer> largestValues(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<res.size();i++){
            List<Integer> l=new ArrayList<>();
            l=res.get(i);
            Collections.sort(l);
            ans.add(l.get(l.size()-1));
        }
        return ans;
    }
}