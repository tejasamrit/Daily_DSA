class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;
        int currPosSum=0,currNegSum=0;
        for(int i:nums){
            currPosSum+=i;
            maxSum=Math.max(maxSum,currPosSum);
            if(currPosSum<0){
                currPosSum=0;
            }
            currNegSum+=i;
            minSum=Math.min(minSum,currNegSum);
            if(currNegSum>0){
                currNegSum=0;
            }
        }
        return Math.max(maxSum, Math.abs(minSum));
    }
}