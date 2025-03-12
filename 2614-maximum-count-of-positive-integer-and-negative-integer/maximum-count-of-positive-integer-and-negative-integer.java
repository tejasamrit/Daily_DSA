class Solution {
    public int maximumCount(int[] nums) {
        int neg=0,pos=0;
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)continue;
            if(nums[i]<0){
                neg++;
            }
            else{
                pos++;
            }
            max=Math.max(neg,pos);
        }
        return max;
    }
}