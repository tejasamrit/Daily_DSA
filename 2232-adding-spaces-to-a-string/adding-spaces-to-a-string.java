class Solution {
    public String addSpaces(String s, int[] arr) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        int m=arr.length;
        int space=0;
        for(int i=0;i<n;i++){
            if(space<m && arr[space]==i){
                sb.append(' ');
                space++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}