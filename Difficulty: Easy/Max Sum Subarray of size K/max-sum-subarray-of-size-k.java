//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int k = Integer.parseInt(br.readLine());

            Solution ob = new Solution();
            int ans = ob.maximumSumSubarray(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maximumSumSubarray(int[] arr, int k) {
        int n=arr.length;
        int sum=0,max=0;
        int j=0;
        while(j<n && j<k){
            sum=sum+arr[j];
            j++;
        }
        max=sum;
        for(int i=1;i<n-k+1;i++){
            int prev=arr[i-1];
            int next=arr[i+k-1];
            sum=sum-prev+next;
            max=Math.max(max,sum);
        }
        return max;
    }
}