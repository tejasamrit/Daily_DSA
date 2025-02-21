class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        cycleSort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                list.add(i+1);
            }
        }
        return list;
    }
    public void cycleSort(int arr[]){
        int n=arr.length;
        int i=0;
        while(i<n){
            int ele=arr[i];
            int correctPosition= ele-1;
            if(arr[i]!=arr[correctPosition]){
                swap(arr,i,correctPosition);
            }else{
                i++;
            }
        }
    }
    public void swap(int arr[],int i,int j){
        int temp=arr[i]; arr[i]=arr[j]; arr[j]=temp;
    }
}