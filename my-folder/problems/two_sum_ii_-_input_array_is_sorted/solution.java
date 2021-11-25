class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right = numbers.length -1;
        int newarr[] = new int[2];
        while(left < right ){      
            if(numbers[left] + numbers[right] == target){
                newarr[0] =left+1;
                newarr[1] = right+1;
                return newarr;
            }
            else if(numbers[left] + numbers[right] > target){
                right --;
            }
            else
                left++;
        }
        
        return newarr;
    }
}