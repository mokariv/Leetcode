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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result;
        result = new ArrayList<>();
                if(root == null){
            return result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int max = Integer.MIN_VALUE;
            int size = q.size();
            for(int i =0 ; i<size ;i++){
                TreeNode temp = q.poll();
                if(temp.val > max){
                    max = temp.val;
                }
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }    
            }
            result.add(max);
            
        }
        return result;
        
    }
}