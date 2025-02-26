//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.decToBinary(n));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static String decToBinary(int n) {
        if(n==0) return "0";
        if(n==1) return "1";
        return decToBinary(n/2) + n%2;
    }
}