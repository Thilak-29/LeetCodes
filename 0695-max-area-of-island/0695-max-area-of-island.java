class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for(int r = 0;r<grid.length;r++){
            for(int c =0 ;c<grid[0].length;c++){
                if(grid[r][c]==1){
                    maxArea = Math.max(maxArea,dfs(grid,r,c));
                }
            }
        }
            return maxArea;
        }
       private int dfs(int[][] grid, int r, int c) {
        // FIXED: Changed > to >= and added check for water/visited (== 0)
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) {
            return 0;
        }
        
        grid[r][c] = 0; // Mark as visited
        
        return 1 + dfs(grid, r + 1, c) 
                 + dfs(grid, r - 1, c) 
                 + dfs(grid, r, c + 1) 
                 + dfs(grid, r, c - 1);
    }
}
