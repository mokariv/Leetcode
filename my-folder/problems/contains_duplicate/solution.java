class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums == null || nums.length == 0){
            return false;
        }
        for(int n : nums){
            if(map.containsKey(n)){
                return true;
            }else{
            map.put(n,n);
            }
        }
        return false;

        
    }
}