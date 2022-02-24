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
    int count;
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        return inorder(root);
        
        
    }
    int inorder(TreeNode root){
        if(root == null){
            return 0;
        }
       int h1 = inorder(root.left);
       int h2 = inorder(root.right);
        return (h1 == 0 || h2 == 0) ? h1 + h2 + 1: Math.min(h1,h2) + 1;
        
       
    }
}