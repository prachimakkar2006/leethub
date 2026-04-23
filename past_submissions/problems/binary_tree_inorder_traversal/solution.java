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
 *         this.right = right;i9
 *     }
 * }
 */
class Solution {
    public void inorder(TreeNode node,List<Integer> lt){
        if(node == null) return;
        inorder(node.left,lt);
        lt.add(node.val);
        inorder(node.right,lt);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lt = new ArrayList<>();
        inorder(root,lt);
        return lt;
    }
}