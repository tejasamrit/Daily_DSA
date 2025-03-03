class Solution {
    public void sortColors(int[] arr) {
        int n=arr.length;
        int red=0,white=0,blue=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)red++;
            else if(arr[i]==1)white++;
            else{
                blue++;
            }
        }
        int res[]=new int[n];
        int j=0;
        while(red>0){
            arr[j++]=0;
            red--;
        }
        while(white>0){
            arr[j++]=1;
            white--;
        }
        while(blue>0){
            arr[j++]=2;
            blue--;
        }
    }
}