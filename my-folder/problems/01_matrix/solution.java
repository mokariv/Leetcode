class Solution {
    public int[][] updateMatrix(int[][] mat) {
        if(mat == null){
            return mat;
        }
        int m = mat.length;
        int n = mat[0].length;
        int dir [][] = new int[][] {{1,0},{-1,0},{0,1},{0,-1}};
        Queue<int[]> q = new LinkedList<>();
        for(int i =0; i<m ;i++){
            for(int j =0 ; j<n ;j ++){
                if(mat[i][j] == 0 ){
                    q.add(new int[]{i,j});
                }else{
                    mat[i][j] = -1;
                }
                
            }
        }
        int level = 0;
        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i =0 ;i<size ; i++){
                int [] current = q.poll();
                int current_row = current[0];
                int current_column = current[1];
                for(int present []: dir){
                    int peresnt_row =  present[0]+current_row;
                    int present_column = present[1]+current_column;
                    if(peresnt_row >= 0 && present_column >= 0 && peresnt_row < m && 
                    present_column < n && mat[peresnt_row][present_column] == -1){
                        mat[peresnt_row][present_column] = level;
                        q.add(new int[]{peresnt_row, present_column});
                    }
                }     
            }
        }
    
        return mat;
        
    }
}