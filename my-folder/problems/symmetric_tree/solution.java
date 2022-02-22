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
    boolean isValid = true;
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return isValid;
        }
    dfs(root.left, root.right);
    return isValid;
}
    void dfs(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return;
        }
        else if(left == null || right == null || left.val != right.val){
            isValid = false;
            return;
        }
        dfs(left.left, right.right);
        dfs(left.right,right.left);  
    }
}
    