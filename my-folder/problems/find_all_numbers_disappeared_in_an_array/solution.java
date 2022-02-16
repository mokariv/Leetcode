class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        for(int i =0 ; i<nums.length ; i++){
            int num = Math.abs(nums[i]) - 1;
            if(nums[num] > 0){
                nums[num] = -1 * nums[num];
            }
        }
        
        for(int j = 0 ; j< nums.length ; j++){
            if(nums[j]>0){
                result.add(j+1);
            }          
        }
        return result;
        
    }
}