class Solution {
    public void rotate(int[] nums, int k) {
             int i =0; 
             int n = nums.length;
            k = k % nums.length;
        System.out.println(k);
            nums = reverse(nums,i,n-1);
            nums = reverse(nums, i, k-1);
            nums = reverse(nums,k,n-1);
                  
    }
    public int[] reverse(int array[], int start , int end){
            while(start <= end){
                int temp = array[end];
                array[end] =array[start];
                array[start] = temp;
                start++;
                end--;
            }
            return array;
        }
}