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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<Integer> l1 = new ArrayList<>();
        if(root == null){
            new ArrayList<>();
        }
        if(root != null){
            result.add(new ArrayList<>(Arrays.asList(root.val)));
            if(root.left != null){
                s1.push(root.left);
            }
            if(root.right!=null){
                 s1.push(root.right);
            }  
        }
        while(!s1.isEmpty() || !s2.isEmpty())
        {        
            while(!s1.isEmpty()){
               TreeNode r1 = s1.pop();
                l1.add(r1.val);
                if(r1.right!=null){
                    s2.push(r1.right);
                }
                if(r1.left!=null){
                    s2.push(r1.left);
                    } 
            }
            if(!l1.isEmpty()){
            result.add(new ArrayList<>(l1));
             l1.clear();
            }
            while(!s2.isEmpty()){
               TreeNode r2 = s2.pop();
                l1.add(r2.val);
                if(r2.left!=null){
                    s1.push(r2.left);
                }
                if(r2.right!=null){
                    s1.push(r2.right);
                    } 
            }
            if(!l1.isEmpty()){
             result.add(new ArrayList<>(l1));
             l1.clear();
            }
            
        }
        
        return result;
         
    }
}