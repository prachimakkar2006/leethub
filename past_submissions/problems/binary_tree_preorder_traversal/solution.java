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
    public void preorder(TreeNode node,List<Integer> lt){
        if(node == null) return;
        lt.add(node.val);
        preorder(node.left,lt);
        preorder(node.right,lt);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> lt = new ArrayList<>();
        preorder(root,lt);
        return lt;
        
    }
}