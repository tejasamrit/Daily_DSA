class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int i=1;
        int j=n-2;
        
        int left=height[0];
        int right=height[n-1];
        
        int ans=0;
        
        while(i<=j){
            if(right>=left){
                ans += Math.max(0, left-height[i]);
                left=Math.max(left,height[i]);
                i++;
            }
            else{
                ans += Math.max(0, right-height[j]);
                right= Math.max(right, height[j]);
                j--;
            }
        }
        return ans;
    }
}