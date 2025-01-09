class Solution {
    public void reverse(char[] arr){
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            char temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public void reverseString(char[] s) {
        reverse(s);
    }
}