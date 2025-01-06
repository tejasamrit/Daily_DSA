//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Main {
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            Node head1 = null, tail1 = null;
            Node head2 = null, tail2 = null;

            String input1 = sc.nextLine();
            String[] elems1 = input1.split(" ");
            for (String elem : elems1) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head1 == null) {
                    head1 = newNode;
                    tail1 = newNode;
                } else {
                    tail1.next = newNode;
                    tail1 = newNode;
                }
            }

            String input2 = sc.nextLine();
            String[] elems2 = input2.split(" ");
            for (String elem : elems2) {
                Node newNode = new Node(Integer.parseInt(elem));
                if (head2 == null) {
                    head2 = newNode;
                    tail2 = newNode;
                } else {
                    tail2.next = newNode;
                    tail2 = newNode;
                }
            }

            Solution obj = new Solution();

            Node result = obj.mergeResult(head1, head2);
            printList(result);
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    Node mergeResult(Node list1, Node list2) {
       ArrayList<Integer> li= new ArrayList<>();
        
        while(list1!=null){
            li.add(list1.data);
            list1= list1.next;
        }
        
        while(list2!=null){
            li.add(list2.data);
            list2= list2.next;
        }
        Collections.sort(li); 
      Node lis=new Node(0);
     Node a =lis;
     for (int i = li.size()-1;i>=0 ;i--) {
            Node node = new Node(li.get(i));
           a.next=node;
           a=a.next;
        }

        return lis.next;
    }
}
