//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());//testcases
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(reader.readLine());//input n
            //printing "1" if isLucky() returns true else "0"
            Solution s = new Solution();
            System.out.println(s.isLucky(n)? "1" : "0");
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution
{
    public static boolean isLucky(int n)
    {
        for(int i=2;i<=n;i++){
            if(n%i==0)return false;
            n=n-n/i;
        }
        return true;
    }
    
}