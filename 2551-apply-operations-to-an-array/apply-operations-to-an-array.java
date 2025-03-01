class Solution {
    public int[] applyOperations(int[] arr) {
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }
        int nonzero=0,zero=n-1;
        int res[]=new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                res[nonzero]=arr[i];
                nonzero++;
            }else{
                res[zero]=arr[i];
                zero--;
            }
        }
        return res;
    }
}