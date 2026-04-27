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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result =  new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(); 
        if(root == null) return result;
        q.add(root);
        boolean ltr = true;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> lt = new ArrayList<>();
            for(int i=0;i<size;i++) {
                TreeNode curr = q.remove();
                if(ltr) {
                    lt.add(curr.val);          
                } else {
                    lt.add(0, curr.val);     
                }
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            ltr = !ltr; 
            result.add(lt);
        }

        return result;
    }
}