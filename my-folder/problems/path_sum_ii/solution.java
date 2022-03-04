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
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return new ArrayList<>();
        }
        result = new ArrayList<>();
        
        helperBacktrack (root, targetSum, 0, new ArrayList<>());
        return result;
        
    }
   void  helperBacktrack (TreeNode root, int targetSum , int sum, List<Integer> path){
        if (root == null) {
            return;
        }
        sum = sum + root.val;
        path.add(root.val);
        if (root.left == null && root.right == null){
            if(targetSum == sum){
                result.add(new ArrayList<>(path));
            }
        }
       //logic
       helperBacktrack (root.left, targetSum, sum,  path);
       helperBacktrack (root.right, targetSum, sum,  path);
       path.remove(path.size() - 1);
       
    }
}