//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    public void sortedMerge(int[] arr1, int[] arr2, int[] res) {
         Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k++]=arr1[i];
                i++;
            }
            else{
                res[k++]=arr2[j];
                j++;
            }
        }
        while(i<arr1.length){
            res[k++]=arr1[i++];
        }
        while(j<arr2.length){
            res[k++]=arr2[j++];
        }
    }
}

//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String line = sc.nextLine();
            String[] arr1Str = line.split(" ");
            int[] arr1 = new int[arr1Str.length];
            for (int i = 0; i < arr1Str.length; i++) {
                arr1[i] = Integer.parseInt(arr1Str[i]);
            }

            line = sc.nextLine();
            String[] arr2Str = line.split(" ");
            int[] arr2 = new int[arr2Str.length];
            for (int i = 0; i < arr2Str.length; i++) {
                arr2[i] = Integer.parseInt(arr2Str[i]);
            }

            int n = arr1.length;
            int m = arr2.length;
            int[] res = new int[n + m]; // Initialize res array of size n + m

            Solution ob = new Solution();
            ob.sortedMerge(arr1, arr2, res);
            for (int i = 0; i < n + m; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends