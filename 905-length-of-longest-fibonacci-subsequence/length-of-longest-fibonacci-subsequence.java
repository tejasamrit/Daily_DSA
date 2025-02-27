class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        HashSet<Integer>set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int prev=arr[j];
                int curr=arr[i]+arr[j];
                int len=2;
                while(set.contains(curr)){
                    int temp=curr;
                    curr=curr+prev;
                    prev=temp;
                    max=Math.max(max, ++len);
                }
            }
        }
        return max;
    }
}