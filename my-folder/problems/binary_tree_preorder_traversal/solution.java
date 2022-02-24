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
/** recursive code
class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        preorder(root);
        return result;
        
    }
    void preorder(TreeNode root){
        if(root == null){
            return;
        }
        result.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
**/
/** Iterative Code **/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList<>();
    Stack<TreeNode> stack = new Stack<>();
        while(!stack.isEmpty() || root !=null){
            while(root != null){
                result.add(root.val);
                stack.push(root);
                root = root.left;
            }
            if(!stack.isEmpty()){
                 root = stack.pop();
                 root = root.right;
              }
        }
        return result;

}
}