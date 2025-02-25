class Solution {
    public int numOfSubarrays(int[] arr) {
        int psum=0;
        int evenCount=1;
        int oddCount=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(psum%2==0){
                res+=oddCount;
                evenCount++;
            }
            else{
                res+=evenCount;
                oddCount++;
            }
            res=res%1000000007;
        }
        return res;
    }
}