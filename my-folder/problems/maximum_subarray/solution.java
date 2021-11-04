class Solution {
    public int maxSubArray(int[] nums) {
        int maximumsofar = nums[0];
        int maximumTillhere = 0;
        for(int i =0; i<nums.length ; i++){
            maximumTillhere =  maximumTillhere + nums[i];
            if(maximumsofar<maximumTillhere){
               maximumsofar = maximumTillhere;
            }
            if(maximumTillhere < 0){
                maximumTillhere = 0;
            }
            
        }
        return maximumsofar;
    }
}