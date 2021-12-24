class Solution {
    int clr;
    int m, n;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(sr> image.length || sr < 0  || sc>image[0].length || image[sr][sc] == newColor){
            return image;
        }
        clr = image[sr][sc];
        m = image.length;
        n = image[0].length;
        dfs(image, sr, sc ,newColor);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc ,int newColor){
        //base 
        if(sr < 0 || sc < 0 || sr == m || sc == n || image[sr][sc] != clr){
            return;
        }
    else{
            image[sr][sc] = newColor;
            dfs(image, sr+1, sc,   newColor);
            dfs(image, sr-1, sc,   newColor);
            dfs(image, sr,   sc+1, newColor);
            dfs(image, sr,   sc-1, newColor);
        }
    }
}