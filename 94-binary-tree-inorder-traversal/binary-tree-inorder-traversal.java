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
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer>list=new ArrayList<>();
        if(root==null)return list;
        TreeNode curr=root;
        list.addAll(inorderTraversal(curr.left));
        list.add(curr.val);
        list.addAll(inorderTraversal(curr.right));
        return list;
    }
}