class Solution {
  public int maxLevelSum(TreeNode root) {
    int a = 1;
    int m = Integer.MIN_VALUE;
    Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
    for (int i = 1; !q.isEmpty(); i++){
      int s = 0;
      for (int z = q.size(); z > 0; z--){
        TreeNode node = q.poll();
        s += node.val;
        if (node.left != null){
          q.offer(node.left);
        }
        if (node.right != null){
          q.offer(node.right);
        }
      }
      if (m < s){
        m = s;
        a = i;
      }
    }
    return a;
  }
}
