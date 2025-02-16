//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String txt = br.readLine().trim();
            String pat = br.readLine().trim();

            int ans = new Solution().search(pat, txt);

            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        int k=pat.length();
        int patfre[]=new int[26];
        for(int i=0;i<k;i++){
            int index=pat.charAt(i)-97;
            patfre[index]++;
        }
        int n=txt.length();
        int txtfre[]=new int[26];
        for(int i=0;i<k;i++){
            int index=txt.charAt(i)-97;
            txtfre[index]++;
        }
        int count=0;
        if(Arrays.equals(patfre,txtfre)){
            count++;
        }
        for(int i=1;i<n-k+1;i++){
            int removedcharindex=txt.charAt(i-1)-97;
            int addedcharindex=txt.charAt(i+k-1)-97;
            txtfre[addedcharindex]++;
            txtfre[removedcharindex]--;
            if(Arrays.equals(patfre,txtfre)){
            count++;
            }
        }
        return count;
    }
}