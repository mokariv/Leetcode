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
    TreeNode prev =null;
    List<Integer> list = new ArrayList<>();
    int count = 1;
    int max = 0;
    public int[] findMode(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        inorder(root);
        int i = 0;
        int array[] = new int[list.size()];
        for(int a : list){
            array[i]= a;
            i++;
        }
        return array;
        
    }
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        
        if(prev!= null && prev.val == root.val){
            count++;
        }else{
            count = 1;
        }
        if(count>max){
            max =count;
            list.clear();
            list.add(root.val);
        }
        else if(count == max){
            list.add(root.val);
        }
        prev = root;
        inorder(root.right);
    }    
    }