class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        boolean visited[][] = new boolean[n][m];
        int dir[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j]=='1'){
                    count++;
                    q.offer(new int[]{i,j});
                    grid[i][j] ='0';
               

        
        while(!q.isEmpty()){
             int arr[]= q.poll();
                for(int d[] : dir)
                {
                   int x = arr[0] + d[0]; 
                    int y = arr[1] + d[1];

                    if(x<0 || x>=n || y<0 || y>=m || grid[x][y]!='1' )
                        continue;
                    
                   
                    grid[x][y] = '0';
                    q.offer(new int[]{x,y});
                }
        }
         }
            }
        }
        return count;
    }
}