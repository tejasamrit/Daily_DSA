//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.HashMap;


// } Driver Code Ends
class Solution {

    // Function to find the first negative integer in every window of size k
    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        ArrayList<Integer>list=new ArrayList<>();
        int n=arr.length;
        Queue<Integer>q=new LinkedList<>();
        int index=0;
        while(index<k){
            if(arr[index]<0){
                q.add(arr[index]);
            }
            index++;
        }
        if(q.isEmpty()){
            list.add(0);
        }
        else{
            list.add(q.peek());
        }
        for(int i=1;i<n-k+1;i++){
            if(arr[i-1]<0){
                q.poll();
            }
            if(arr[i+k-1]<0){
                q.add(arr[i+k-1]);
            }
            if(q.isEmpty()){
            list.add(0);
        }
            else{
            list.add(q.peek());
        }
        }
        return list;
    }
}

//{ Driver Code Starts.
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
            // Create Solution object and find closest sum
            Solution ob = new Solution();
            List<Integer> ans = ob.FirstNegativeInteger(arr, k);

            // Print the result as a space-separated string
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println(); // New line after printing the results
            System.out.println("~");
        }
    }
}

// } Driver Code Ends