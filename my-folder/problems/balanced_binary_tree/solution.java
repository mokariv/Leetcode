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
    public boolean isBalanced(TreeNode root) {
        inorder(root);
        return isValid;
    }
    private int inorder(TreeNode root){
        if(root == null){
            return 0 ;
        }
        int h1 = inorder(root.left);
        int h2 = inorder(root.right);
        
    
        
        if(Math.abs(h1-h2) >1){
            isValid = false; 
         }
          return 1+Math.max(h1,h2);
        
    }
}