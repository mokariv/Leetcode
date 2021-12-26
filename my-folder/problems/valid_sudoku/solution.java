class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for(int i =0 ;i<9;i++){
            for(int j =0;j<9;j++){
                char current = board[i][j];
                if(current != '.')
                    if(!seen.add(current + "foudn in row" + i) || !seen.add( current + "foudn in column" + j) || !seen.add(current + "found in box"+ i/3 + '-' + j/3)) return false;
            
        }
    }
        return true;
}
}