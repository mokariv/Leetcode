class Solution {
    List<List<Integer>> result ;
    public List<List<Integer>> threeSum(int[] nums) {
        //base
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }
        result = new ArrayList<>();
        // sort the array
       Arrays.sort(nums);
        
      for (int i = 0 ;i<nums.length-2 ; i++) {
          int low = i+1;
          int high = nums.length -1;
        if (i > 0 && nums[i] == nums[i-1]) {
                  continue;
              }
          while(low<high){
              int sum = nums[i] + nums[low] + nums[high];
              if( sum == 0) {
                 List<Integer> list = Arrays.asList(nums[i],nums[low],nums[high]);
                 result.add(list);
                  low++;
                  high--;
                  
             while (low<high && low > 0 && nums[low] == nums[low-1]) {
                  low++;
              }
              while (low<high && high < nums.length-2 && nums[high] == nums[high+1]) {
                  high--;
              }
              }
              if (sum < 0){
                  low++;
              }
              if(sum > 0){
                  high--;
              }       
          }
          
      }
      return result;  
        
    }
}