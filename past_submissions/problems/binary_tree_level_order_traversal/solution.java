class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;  
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root); 
        while (!q.isEmpty()) {
            int levelSize = q.size();
            List<Integer>Level = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                     TreeNode curr = q.remove();
                     Level.add(curr.val);  
                    if (curr.left != null)  q.add(curr.left);
                     if (curr.right != null) q.add(curr.right);
            }
            result.add(Level);
        }
        return result;  
    }
}