/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer>list=new ArrayList<>();
        inorderTraversal(root,list);
        int st=0,end=list.size()-1;
        while(st<end){
            int sum=list.get(st)+list.get(end);
            if(sum==k)return true;
            else if(sum<k)st++;
            else end--;
        }
        return false;
    }
    public void inorderTraversal(TreeNode root,ArrayList<Integer>list){
        if(root==null)return;
        inorderTraversal(root.left,list);
        list.add(root.val);
        inorderTraversal(root.right,list);
    }
}