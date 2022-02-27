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
    public List<List<Integer>> verticalOrder(TreeNode root) {
    Queue<TreeNode> queue = new LinkedList<>();
    Queue<Integer> columns = new LinkedList<>();
    Map<Integer,List<Integer>> map = new HashMap<>();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
        List<List<Integer>> result = new ArrayList<>();
        if(root != null){
            queue.add(root);
            columns.add(0);
            min = 0;
            max = 0;
        }
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            int col = columns.poll();
            if(map.containsKey(col)){
                map.get(col).add(temp.val);
            }else{
                map.put(col,new ArrayList<>());
                map.get(col).add(temp.val);
            }
            
            if(temp.left != null){
                queue.add(temp.left);
                columns.add(col-1);
                min = Math.min(min, col-1);
                
            }
            if(temp.right != null){
                queue.add(temp.right);
                columns.add(col+1); 
                max = Math.max(max, col+1);
            } 
        }
        
        for(int i = min ; i<=max ; i++){
            result.add(map.get(i));
        }
        return result;
        
          
    }
}