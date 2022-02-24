/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode result;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    if(root == null){
        return root;
    }
    lcf(root, p,q);
     return result;
    }

    void lcf(TreeNode root, TreeNode p , TreeNode q){
        if(root == null){
            return;
        }
        if(root.val >= p.val && root.val <= q.val){
            result = root;
            return;
        }
        if(root.val <= p.val && root.val >= q.val){
            result = root;
            return;
        }
        // if(root.val == p.val || root.val == q.val){
        //     result = root;
        //      return;
        //  }
        if(root.val < p.val && root.val < q.val){
            lcf(root.right, p, q);
        }else{
         lcf(root.left, p, q);
    }
    }
}