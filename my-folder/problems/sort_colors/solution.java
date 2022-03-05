class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums .length == 0){
            return;
        }
        int low = 0;
        int current = 0;
        int high = nums.length-1;
        while (current <= high) {
            if (nums[current] > 1 ) {
                int temp = nums[high];
                nums[high] = nums[current];
                nums[current] = temp;
                high--; 
            }
            else if (nums[current] < 1) {
                int temp1 = nums[low];
                nums[low] = nums[current];
                nums[current] = temp1;
                low++;
                current++;
                
            }else{
                current++;
            }
        }
        
    }
}