// class Solution {
//     public int findPeakElement(int[] nums) {

//         int low =0;
//         int high = nums.length-1;
//         int mid;
//         int size = nums.length-1;
//         while(low <= high){
//         mid = low + (high-low)/2;
//         if(mid>0 && mid<high){
//         if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
//             return mid;
//         }
//         if(nums[mid-1]>nums[mid]){
//             high = mid-1;
//         }
//         if(nums[mid +1]> nums[mid]){
//             low = mid+1;
//         }
//         }else if(mid == 0){
//             if(nums[0] > nums[1]){
//                 return 0;
//             }else{
//                 return 1;
//             }       
//         }else if(mid == size-1){
//             if(nums[size-1] > nums[size-2]){
//                 return size-1;
//             }else{
//                 return size-2;
//             }
//         }
//         }
//     return 0;
        
// }
// }


public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
}