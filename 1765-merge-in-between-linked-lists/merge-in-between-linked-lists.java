/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prevA=list1;
        ListNode nodeB=list1;
        for(int i=0;i<b;i++){
            if(i==a-1){
                prevA=nodeB;
            }
            nodeB=nodeB.next;
        }
        ListNode list2End=list2;
        while(list2End.next!=null){
            list2End=list2End.next;
        }
        prevA.next=list2;
        list2End.next=nodeB.next;
        nodeB.next=null;
        return list1;
    }
}