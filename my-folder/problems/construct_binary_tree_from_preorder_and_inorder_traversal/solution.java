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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int rootIndex = -1;
        for(int i= 0 ;i<inorder.length; i++){
            if(preorder[0] == inorder[i]){
                rootIndex=i;
                break;
            }
        }
        int []inorderLeft = Arrays.copyOfRange(inorder,0 ,rootIndex);
        int []inorderRight =Arrays.copyOfRange(inorder,rootIndex+1,inorder.length);
        int [] preorderLeft = Arrays.copyOfRange(preorder,1,rootIndex+1);
        int [] preorderRight = Arrays.copyOfRange(preorder,rootIndex+1, preorder.length);
        
        root.left = buildTree(preorderLeft,inorderLeft);
        root.right = buildTree(preorderRight,inorderRight);
        
        return root;
        
        
    }
}