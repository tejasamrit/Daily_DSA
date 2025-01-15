//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Map.Entry;


// } Driver Code Ends
// User function Template for Java

class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
          HashMap<Integer,Integer> map = new HashMap<>();
    for(int i : arr) {
        map.put(i,map.getOrDefault(i,0)+1);
    }
   // System.out.println(map);
    ArrayList<Integer> list = new ArrayList<>();
    for(int i : arr) list.add(i);
    Collections.sort(list,(p1,p2)->(map.get(p1)!=map.get(p2))? map.get(p2) - map.get(p1) :
    p1 - p2 );
    return list;
    }
}

//{ Driver Code Starts.

class Driverclass {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        while (n != 0) {
            String input = sc.readLine();
            String[] inputs = input.split(" ");
            int[] arr = new int[inputs.length];

            for (int i = 0; i < inputs.length; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            ArrayList<Integer> ans = new ArrayList<Integer>();
            ans = new Solution().sortByFreq(arr);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();
            n--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends