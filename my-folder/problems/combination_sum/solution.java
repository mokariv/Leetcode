/*

### this is using recurssion
class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0){
            return result;
        }
        helper(candidates,0,target, new ArrayList<>());
        
        return result;
        
    }
    
    void helper(int [] candidates, int index, int target, List<Integer> path){
        
        if (target < 0) {
            return;
        }
        
        if (target == 0) {
            result.add(path);
            return;
        }
        
        for (int i = index; i<candidates.length ; i++) {
            List<Integer> list = new ArrayList<>(path);
            list.add(candidates[i]);
            helper(candidates, i, target-candidates[i], list);
        }
    }
}
*/




class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null || candidates.length == 0){
            return result;
        }
        helper(candidates,0,target, new ArrayList<>());
        
        return result;
        
    }
    
    void helper(int [] candidates, int index, int target, List<Integer> path){
        
        if (target < 0) {
            return;
        }
        
        if (target == 0) {
            result.add( new ArrayList<>(path));
            return;
        }
        
        for (int i = index; i<candidates.length ; i++) {
            path.add(candidates[i]);
            helper(candidates, i, target-candidates[i], path);
            path.remove(path.size() - 1);
        }
    }
}