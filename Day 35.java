class Solution {
  public int goodNodes(TreeNode root) {
    return goodNodes(root, Integer.MIN_VALUE);
  }
  private int goodNodes(TreeNode root, int a)
  {
    if (root == null)
    {
      return 0;
    }
    int x = Math.max(a, root.val);
    return (root.val >= a ? 1 : 0) + goodNodes(root.left, x) + goodNodes(root.right, x);
  }
}
