class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if(mat.length == 0 || mat == null){
            return new int[0];
        }
        int m = mat.length;// number rows of the matrix
        int n = mat[0].length; // number  cloumn of matrix
        int dir = 1;
        int result[] = new int[m * n];
        int r =0;
        int i = 0;
        int j = 0;
        while(r < m*n){
            result[r] = mat[i][j];
            r++;
            if(dir ==1){
                if(j == n-1){
                    i++;
                    dir = -1;
                    
                    
                }else if(i ==0){
                    j++;
                    dir = -1;
                }
                else{
                    i--;
                    j++;
                }
                
            }else if(dir == -1){
                if(i == m-1){
                    dir = 1;
                    j++;
                    
                }
                else if(j ==0){
                    i++;
                    dir = 1;
                    
                }
                else{
                    i++;
                    j--;
                }
                
            }
        }
        return result;
    }
}