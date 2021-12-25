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
    boolean isValid  = true;
    public boolean isSymmetric(TreeNode root) {
        if( root == null){
            return isValid;
        }
        dfs(root.left, root.right);
        return isValid;
        
    }
    private void dfs(TreeNode n1 , TreeNode n2 ){
        
        if(n1 == null && n2 == null){
            return;
        }
        if(n1 == null || n2 == null || n1.val != n2.val){
            isValid = false;
            return;
        }
        dfs(n1.left, n2.right);
        dfs(n1.right, n2.left);
    }
    
    
}