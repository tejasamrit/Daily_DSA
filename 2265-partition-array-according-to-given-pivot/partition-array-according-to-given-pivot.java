class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int lcount=0,pcount=0,gcount=0;
        for(int i:nums){
            if(i<pivot)lcount++;
            else if(i>pivot)gcount++;
            else pcount++;
        }
        int res[]=new int[nums.length];
        int i=0,j=lcount,k=lcount+pcount;
        for(int num:nums){
            if(num<pivot){
                res[i++]=num;
            }else if(num>pivot){
                res[k++]=num;
            }else{
                res[j++]=num;
            }
        }
        return res;
    }
}