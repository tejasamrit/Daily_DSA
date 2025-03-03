class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int left=0,right=n-1;
        int res[]=new int[n];
        int j=n-1;
        while(left<=right){
            int leftSq=arr[left]*arr[left];
            int rightSq=arr[right]*arr[right];
            if(leftSq>rightSq){
                res[j]=leftSq;
                left++;
            }else{
                res[j]=rightSq;
                right--;
            }
            j--;
        }
        return res;
    }
}