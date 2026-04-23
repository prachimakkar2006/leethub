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
    public void postorder(TreeNode node,List<Integer> lt) {
        if(node == null) return;
        postorder(node.left,lt);
        postorder(node.right,lt);
         lt.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> lt = new ArrayList<>();
        postorder(root,lt);
        return lt;
        
    }
}