class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length <=0){
            return false;
        }
        int rows = matrix.length-1;
        int colums = matrix[0].length-1;
        System.out.println(rows);
        for(int i=0 ;i<=rows; i++){
            for(int j = colums ; j>=0 ; j--){
                if(matrix[i][j] == target){
                    return true;
                }
                else if(target<matrix[i][j]){
                    continue;
                }
                else{
                    break;
                }  
            }
        }
        return false;
    }
}