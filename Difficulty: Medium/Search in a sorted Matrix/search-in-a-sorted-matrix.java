//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int matrix[][] = new int[rows][columns];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();

            Solution x = new Solution();

            if (x.searchMatrix(matrix, target))
                System.out.println("true");
            else
                System.out.println("false");
            t--;

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // int n=mat.length;
        // int m=mat[0].length;
        // int r=0,c=m-1;
        // while(r<n&&c>=0){
        //     if(mat[r][c]==x){
        //         return true;
        //     }else if(mat[r][c]>x){
        //         c--;
        //     }else{
        //         r++;
        //     }
        // }
        // return false;
         int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==x)
                {
                    return true;
                }
            }
        }
        return false;
    }
}
