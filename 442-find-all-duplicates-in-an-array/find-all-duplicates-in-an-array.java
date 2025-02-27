class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                list.add(arr[i]);
            }
        }
        return list;
    }
}