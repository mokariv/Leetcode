class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix == null || matrix.length <= 0){
            return -1;
        }
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        while(low < high){
            int mid = low+(high- low)/2;
            int count = helper(matrix, mid);
            if(count >= k){
                high = mid;
            }else if(count < k){
                low = mid+1;
            }  
        }
        return low;
        
    }
    
    private int helper(int[][] matrix, int val) {
        int res = 0;
        int n = matrix.length, i = n - 1, j = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] > val) i--;
            else {
                res += i + 1;
                j++;
            }
        }
        return res;
    }
}