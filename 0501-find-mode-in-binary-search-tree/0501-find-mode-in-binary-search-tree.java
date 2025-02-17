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
    Map<Integer,Integer> m=new HashMap<>();
    public void goo(TreeNode root){
        if(root==null) return;
        m.put(root.val,m.getOrDefault(root.val,0)+1);
        goo(root.left);
        goo(root.right);
    }
    public int[] findMode(TreeNode root) {
        if(root==null) return null;
        if(root.left==null && root.right==null) return new int[]{root.val};
        goo(root);
            int maxFrequency = 0;
        Map<Integer, List<Integer>> m1 = new TreeMap<>();
        
        for (Map.Entry<Integer, Integer> ele : m.entrySet()) {
            int frequency = ele.getValue();
            m1.computeIfAbsent(frequency, k -> new ArrayList<>()).add(ele.getKey()); 
            maxFrequency = Math.max(maxFrequency, frequency); 
        }
        List<Integer> modes = m1.get(maxFrequency);
        
        int[] arr = new int[modes.size()];
        for (int i = 0; i < modes.size(); i++) {
            arr[i] = modes.get(i);
        }
        return arr;
    }
}