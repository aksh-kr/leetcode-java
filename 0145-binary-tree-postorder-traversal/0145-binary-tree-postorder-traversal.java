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
    List<Integer> postOrder = new LinkedList();
    
    public List<Integer> postorderTraversal(TreeNode root) {
        post(root);
        return postOrder;
    }
    
    private void post(TreeNode root) {
        if(root == null) {
            return;
        }
        post(root.left);
        post(root.right);
        postOrder.add(root.val);
    }
}