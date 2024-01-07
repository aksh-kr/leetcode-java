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
    public int maxPathSum(TreeNode root) {
        int[] maximum = new int[1];
        maximum[0] = Integer.MIN_VALUE;
        height(root, maximum);
        return maximum[0];
    }
    
    public int height(TreeNode root, int[] maximum) {
        if(root == null) {
            return 0;
        }
        
        int lh = Math.max(0, height(root.left, maximum));
        int rh = Math.max(0, height(root.right, maximum));
        
        maximum[0] = Math.max(maximum[0], lh + rh+root.val);
        return Math.max(lh, rh) + root.val;
    }
}