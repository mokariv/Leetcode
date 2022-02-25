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
    List<TreeNode> pathp;
    List<TreeNode> pathQ;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return root;
        }
        backtrack(root, p, q, new ArrayList<>());
        if(pathp == null || pathQ== null){
            return null;
        }
        for( int i = 0; i<pathp.size(); i++){
            if(pathp.get(i) != pathQ.get(i)){
               return pathp.get(i-1);
            }
        }
        return null;  
    }
    void backtrack(TreeNode root, TreeNode p, TreeNode q, List<TreeNode> path){
        if(root == null){
            return;
        }
        path.add(root);
        if(root == p){
            pathp = new ArrayList<>(path);
            pathp.add(p);
        }
        if(root == q){
            pathQ = new ArrayList<>(path);
            pathQ.add(q);
        }
        backtrack(root.left,  p, q, path);
        backtrack(root.right, p, q, path);
        path.remove(path.size() - 1);
        
    }
}