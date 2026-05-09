class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> result = new ArrayList<>();
     if(root == null) return result;
     Queue<TreeNode> q = new LinkedList<>();
     q.add(root);
     while(!q.isEmpty()){
        int level = q.size();
        List<Integer> lt =  new ArrayList<>();
        for(int i =0; i<level; i++) {
           TreeNode curr = q.remove();
            lt.add(curr.val);
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }
         result.add(lt);
     }
      return result;
    }
}