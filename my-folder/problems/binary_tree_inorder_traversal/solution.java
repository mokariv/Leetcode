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
/*
class Solution {
public List<Integer> inorderTraversal(TreeNode root) {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode cur = root;
    List<Integer> list = new ArrayList<>();

    while(cur!=null || !stack.isEmpty()){
        while(cur!=null){
            stack.push(cur);
            cur = cur.left;
        }
        cur = stack.pop();
        list.add(cur.val);
        cur = cur.right;
    }

    return list;
}
}
   */


class Solution {
    List<Integer> list = new ArrayList<>();
public List<Integer> inorderTraversal(TreeNode root) {
    if(root == null){
          return list;
        }
    inorderTraversal(root.left);
    list.add(root.val);
    inorderTraversal(root.right);
    return list;
    }
}