class Solution {
    int rows;
    int cols;
    public void dfs(int row,int col,char[][]grid,boolean visited[][]){
        if(row<0 || row>=rows || col<0 || col>=cols || visited[row][col] || grid[row][col]=='0'){
            return;
        }
        visited[row][col]=true;
        int adjList[][]={{row-1,col},{row,col+1},{row+1,col},{row,col-1}};
        for(int neighbour[]:adjList){
            dfs(neighbour[0],neighbour[1],grid,visited);
        }
    }
    
    public int numIslands(char[][] grid) {
        rows=grid.length;
        cols=grid[0].length;
        int ans=0;
        boolean visited[][]=new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    dfs(i,j,grid,visited);
                    ans++;
                }
            }
        }
        return ans;
    }
}