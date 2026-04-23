class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> result = new ArrayList<>();
      Queue<TreeNode> q = new LinkedList<>();
      if(root == null) return result;
      q.add(root);
      while(!q.isEmpty()) {
        int size = q.size();
        List<Integer> lt = new ArrayList<>();
        for(int i=0;i<size;i++) {
            TreeNode curr = q.remove();
            lt.add(curr.val);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        result.add(lt);
      }
      return result;
    }
}