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
    public int maxAncestorDiff(TreeNode root) {
        int min = root.val;
        int max = root.val; 
        diff(root, min, max);
        return maxDiff;
    }
    
    public int maxDiff = 0;
    
    public void diff(TreeNode root, int min, int max) {
        if(root == null) {
            return;
        }
        maxDiff = Math.max(maxDiff, Math.max(Math.abs(max - root.val), Math.abs(min - root.val)));
        min = Math.min(min, root.val);
        max = Math.max(max, root.val);
        
        diff(root.left, min, max);
        diff(root.right, min, max);
    }
}