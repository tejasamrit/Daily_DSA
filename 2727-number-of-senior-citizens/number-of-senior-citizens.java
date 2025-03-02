class Solution {
    public int countSeniors(String[] arr) {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            String age1=arr[i].substring(11,13);
            int age=Integer.parseInt(age1);
            if(age>60){
                count++;
            }
        }
        return count;
    }
}