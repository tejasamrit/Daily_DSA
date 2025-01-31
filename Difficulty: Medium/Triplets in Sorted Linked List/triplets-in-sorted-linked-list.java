//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedList {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            ArrayList<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            int k = Integer.parseInt(br.readLine());
            Node head = new Node(arr.get(0));
            Node tail = head;
            for (int i = 1; i < arr.size(); ++i) {
                tail.next = new Node(arr.get(i));
                tail = tail.next;
            }
            Solution ob = new Solution();
            int res = ob.countTriplets(head, k);
            System.out.println(res);
        }
    }
}
// } Driver Code Ends

class Solution {
    static int countTriplets(Node head, int x) {
        List<Integer>temp=new ArrayList<Integer>();
         while(head!=null){
             temp.add(head.data);
             head=head.next;
         }
         int count=0;
         temp.sort(null);
         int i=0;
         while(i<=temp.size()-3){
             int j=i+1;
             int k=temp.size()-1;
             while(j<k){
                 int sum=temp.get(i)+temp.get(j)+temp.get(k);
                 if(sum==x){
                     count++;}
                 if(sum>x){
                     k--;}
                 else{
                     j++;}
             }
             i++;
         }
         return count;
    }
}