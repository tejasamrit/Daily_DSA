//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int a;
            a = Integer.parseInt(br.readLine());

            int b;
            b = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            int[] ans = obj.lcmAndGcd(a, b);
            System.out.println(ans[0] + " " + ans[1]);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends

// User function Template for Java

class Solution {
    public static int[] lcmAndGcd(int a, int b) {
                int gcd = findGCD(a, b);
        int lcm = a*b/gcd;
        return new int[]{lcm, gcd};
    }
    
    static int findGCD(int a, int b){
        while(a!=0 && b!=0){
            if(a>b){
                a = a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a!=0){
            return a;
        }
        else{
            return b;
        }
}
}

//{ Driver Code Starts.

// } Driver Code Ends