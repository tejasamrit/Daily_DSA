//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        int n=arr.length;
        int sec=-1;
        int larg=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]==larg){
                continue;
            }
            if(arr[i]>larg ){
                sec=larg;
                larg=arr[i];
            }
            else if(arr[i]>=sec){
                sec=arr[i];
            }
            
            
        }
        return sec;
        
    }
}