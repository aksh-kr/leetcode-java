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
    int[] sum = new int[] {0};
    public int rangeSumBST(TreeNode root, int low, int high) {
        preOrder(root, low, high, sum);
        return sum[0];
    }
    
    public void preOrder(TreeNode root, int low, int high, int[] sum) {
        if(root == null) {
            return;
        }
        if(root.val >= low && root.val <= high) {
            sum[0] += root.val;
        }
        preOrder(root.left, low, high, sum);
        preOrder(root.right, low, high, sum);
    }
}