//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());

        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] = Integer.parseInt(numsStr[i]);
            }

            int key = Integer.parseInt(read.readLine().trim());

            Solution ob = new Solution();
            int ar[] = ob.findIndex(nums, key);
            System.out.println(ar[0] + " " + ar[1]);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find starting and end index
    static int[] findIndex(int arr[], int key) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                res[0]=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==key){
                res[1]=i;
                break;
            }
        }
        return res;
    }
}