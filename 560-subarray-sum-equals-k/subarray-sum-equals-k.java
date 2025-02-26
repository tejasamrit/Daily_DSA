class Solution {
    public int subarraySum(int[] arr, int k) {
        int n=arr.length;
        int count=0,sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            int rem=sum-k;
            count+=map.getOrDefault(rem,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;     
    }
}