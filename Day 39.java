class Solution {
  public List<Integer> rightSideView(TreeNode root) {
    if (root == null)
    {
      return new ArrayList<>();
    }
    List<Integer> a = new ArrayList<>();
    Queue<TreeNode> b = new ArrayDeque<>(Arrays.asList(root));
    while (!b.isEmpty())
    {
      final int size = b.size();
      for (int i = 0; i < size; i++)
      {
        TreeNode n = b.poll();
        if (i == size - 1)
          a.add(n.val);
        if (n.left != null)
          b.offer(n.left);
        if (n.right != null)
          b.offer(n.right);
      }
    }
    return a;
  }
}
