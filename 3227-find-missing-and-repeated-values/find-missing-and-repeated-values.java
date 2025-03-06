class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int ans[]=new int[2];
        int sq=n*n;
        int currSum=0;
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(set.contains(grid[i][j])){
                    ans[0]=grid[i][j];
                }
                else{
                    set.add(grid[i][j]);
                    currSum+=grid[i][j];
                }
            }
        }
        int totalSum=0;
        for(int i=1;i<=sq;i++){
            totalSum+=i;
        }
        ans[1]=totalSum-currSum;
        return ans;
    }
}