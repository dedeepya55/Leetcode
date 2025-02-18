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
    class NodeInfo {
        int depth;
        TreeNode parent;

        NodeInfo(int depth, TreeNode parent) {
            this.depth = depth;
            this.parent = parent;
        }
    }
    public NodeInfo findDepthAndParent(TreeNode root, int target, int depth, TreeNode parent) {
        if (root == null) return null;
        if (root.val == target) return new NodeInfo(depth, parent);

        NodeInfo left = findDepthAndParent(root.left, target, depth + 1, root);
        if (left != null) return left;

        return findDepthAndParent(root.right, target, depth + 1, root);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        if (root == null) return false;

        NodeInfo nodeX = findDepthAndParent(root, x, 0, null);
        NodeInfo nodeY = findDepthAndParent(root, y, 0, null);
        return nodeX != null && nodeY != null && nodeX.depth == nodeY.depth && nodeX.parent != nodeY.parent;
    }
}
