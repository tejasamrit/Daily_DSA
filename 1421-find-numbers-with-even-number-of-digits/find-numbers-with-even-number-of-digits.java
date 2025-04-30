class Solution {
    public boolean isEven(int num){
        int len=0;
        while(num>0){
            int rem=num%10;
            len++;
            num=num/10;
        }
        if(len%2==0)return true;
        return false;
    }
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(isEven(nums[i])){
                ans++;
            }
        }
        return ans;
    }
}