class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      Queue<TreeNode> q = new LinkedList<>();
      if(root == null) return result;
      q.add(root);
      while(!q.isEmpty()) {
        int sizeOfLevel = q.size();
        List<Integer> level = new ArrayList<>();
        for(int i = 0;i<sizeOfLevel; i++) {
            TreeNode curr = q.remove();
            level.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
        result.add(level);
      }
      return result;
    }
}