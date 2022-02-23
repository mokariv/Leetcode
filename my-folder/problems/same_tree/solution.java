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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        validate( p, q);
        return isValid;
        
    }
    
    void validate(TreeNode a, TreeNode b){
        if(a == null && b == null){
            return;
        }
        if(a != null && b== null){
            isValid = false;
            return;
        }
        if(b != null && a== null){
            isValid = false;
            return;
        }
        if(a.val != b.val){
            isValid = false;
            return;
        }
        validate(a.left, b.left);
        validate(a.right,b.right);
    }
}