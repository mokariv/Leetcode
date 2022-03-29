class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat == null || mat.length ==0){
            return mat;
        }
        int m = mat.length;
        int n = mat[0].length;
        if(r*c != m*n){
            return mat;
        }
        int[][] result = new int[r][c];
        int rows = 0;
        int colums = 0;
        for(int i = 0 ;i<mat.length; i++){
            for(int j =0 ; j<mat[0].length ; j++){
                result[rows][colums] = mat[i][j];
                colums++;
                if(colums == c){
                    rows++;
                    colums =0;
                }
                }
        }
        return result;
        
        
    }
}