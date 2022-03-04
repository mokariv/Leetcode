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
    // int currentsum = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
     return helper(root, 0);   
    }
    int helper(TreeNode root, int currentsum) {
        if(root == null) {
            return 0;
        }
        currentsum = currentsum * 10 + root.val;
        if(root.left == null && root.right == null) {
            return currentsum;
        }
        int leftsum = helper(root.left, currentsum);
        int rightsum = helper(root.right, currentsum);
        return leftsum + rightsum;
        
    }
}