//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            // First array input
            String[] str1 = br.readLine().trim().split(
                " "); // Read the first line and split by spaces
            int n = str1.length;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str1[i]); // Convert each element to an integer
            }

            // Second array input
            String[] str2 = br.readLine().trim().split(
                " "); // Read the second line and split by spaces
            int m = str2.length;
            int[] b = new int[m];
            for (int i = 0; i < m; i++) {
                b[i] = Integer.parseInt(str2[i]); // Convert each element to an integer
            }

            Solution obj = new Solution();
            ArrayList<Integer> res = obj.countEleLessThanOrEqual(a, b);
            for (int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
            System.out.println();
        }
    }
}

// } Driver Code Ends


// Complete the function given below
class Solution {
    public static ArrayList<Integer> countEleLessThanOrEqual(int a[], int b[]) {
          // Sort array b
        Arrays.sort(b);
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < a.length; i++) {
            // Use binary search to find the count of elements in b less than or equal to a[i]
            int count = binarySearch(b, a[i]);
            list.add(count);
        }
        
        return list;
    }
    
    private static int binarySearch(int[] b, int target) {
        int low = 0, high = b.length;
        
        while (low < high) {
            int mid = (low + high) / 2;
            if (b[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    
    }
}