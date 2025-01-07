//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
         int ans=0;
        int left =0;
        int right= arr.length -1;
        
        while(left<right){
            if(arr[left]+arr[right]==target){
                ans++;
                int left1 = left+1;
                int right1 = right-1;
                
                while(left1<right){
                    
                    if(arr[left1]+arr[right]==target){
                        ans++;
                    }
                    left1++;
                }
                while(right1>left){
                    if(arr[right1]+arr[left]==target){
                        ans++;
                    }
                    
                    right1--;
                }
                
                right--;
                left++;
                
            }
            else if(arr[left]+arr[right]>target){
                right--;
            }else{
                left++;
            }
        }
        return ans;
    }
}


//{ Driver Code Starts.
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String[] inputLine = br.readLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int target = Integer.parseInt(inputLine[0]);

            Solution obj = new Solution();
            int res = obj.countPairs(arr, target);
            System.out.println(res);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends