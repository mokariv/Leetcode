class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix == null || matrix.length == 0){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        int left =0;
        int right =n-1;
        int top = 0;
        int bottom = m-1;
        while(left<= right && top <= bottom){
            for(int i = left; i<=right; i++){
                result.add(matrix[top][i]);  
            }
            top++;
            if(left<= right && top <= bottom){
                for(int j = top ; j<=bottom;j++){
                    result.add(matrix[j][right]);
                }
                right--;
            }
            if(left<= right && top <= bottom){
                for(int k = right; k>= left ;k--){
                    result.add(matrix[bottom][k]);
                }
                bottom--;
            }
            if(left<= right && top <= bottom){
                for(int l = bottom ;l>=top ; l--){
                    result.add(matrix[l][left]);
                }
                left++;
            }
        }
       return result; 
    }
}