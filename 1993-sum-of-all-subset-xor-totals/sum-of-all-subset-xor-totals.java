class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }
    private int dfs(int[] nums, int index, int currentXOR) {
        if (index == nums.length) {
            return currentXOR;
        }
        // Include nums[index]
        int withCurrent = dfs(nums, index + 1, currentXOR ^ nums[index]);
        // Exclude nums[index]
        int withoutCurrent = dfs(nums, index + 1, currentXOR);
        return withCurrent + withoutCurrent;
    }
}