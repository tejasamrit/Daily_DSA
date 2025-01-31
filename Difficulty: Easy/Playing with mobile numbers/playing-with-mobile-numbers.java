//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.is_valid(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public int is_valid(String s)
    {
         if(s.length()==10 && (s.startsWith("7") || s.startsWith("8") || s.startsWith("9"))){
            return 1;
        }else if(s.length()==11 && (s.startsWith("07") || s.startsWith("08") || s.startsWith("09"))){
            return 1;
        }else if(s.length()==12 && (s.startsWith("917") || s.startsWith("918") || s.startsWith("919"))){
            return 1;
        }
        return 0;
    }
}