class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
        int[] intArray = new int[2];
        
        for(int i = 0 ; i < nums.length ; i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                intArray[0] = map.get(num);
                intArray[1] = i;
                return intArray;   
            }
            else{
                map.put(nums[i], i);
            }
        }
        return intArray;
    }
}