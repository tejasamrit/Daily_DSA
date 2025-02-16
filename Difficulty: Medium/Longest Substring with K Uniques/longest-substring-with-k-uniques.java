//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        int n=s.length();
        int fre[]=new int[26];
        int dist=0;
        int st=0,end=0,len=0;
        int maxLen=Integer.MIN_VALUE;
        
        while(end<n){
            int index=s.charAt(end)-97;
            if(fre[index]==0){
                dist++;
                fre[index]++;
            }
            else{
                fre[index]++;
            }
            if(dist==k){
                len=end-st+1;
                maxLen=Math.max(maxLen,len);
            }
            else if(dist>k){
                while(st<end && dist>k){
                    index=s.charAt(st)-97;
                    st++;
                    fre[index]--;
                    if(fre[index]==0){
                        dist--;
                    }
                }
            }
            end++;
        }
        return (maxLen==Integer.MIN_VALUE)?-1:maxLen;
    }
}