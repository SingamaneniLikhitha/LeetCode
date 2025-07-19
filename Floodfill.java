class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int oldcolor = image[sr][sc];
        if(oldcolor != color){
            dfs(image , sr, sc, color, oldcolor);
        }
        return image;
    }

    public void dfs(int[][] image, int r, int c, int color, int oldcolor){

        if(r < 0 || c < 0 || r >= image.length || c >= image[2].length){
            return;
        }

        

        if(image[r][c] != oldcolor){
            return;
        }
        image[r][c] = color;

        dfs(image , r-1, c, color, oldcolor);
         dfs(image , r+1, c, color, oldcolor);
         dfs(image , r, c-1, color, oldcolor);
         dfs(image , r, c+1, color, oldcolor);
         
         
    }
}