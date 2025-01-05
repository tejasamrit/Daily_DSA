//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
         String arr [] = s.split ("\\.");
        
        if (arr.length != 4) return false;
        
        for (String str : arr) {
            if (str.isEmpty() || ((str.length() > 1) && str.charAt(0) == '0')) {
                return false;
            }
            
            else {
                int num = Integer.parseInt (str);
                if (num < 0 || num > 255) {
                    return false;
                }
            }
        }
        
        return true;
    }
}