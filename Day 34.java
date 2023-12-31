class Solution {
  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    List<Integer> a = new ArrayList<>();
    List<Integer> b = new ArrayList<>();
    lst(root1, a);
    lst(root2, b);
    return a.equals(b);
  }
  public void lst(TreeNode n, List<Integer> x)
  {
    if (n == null)
    {
      return;
    }
    if (n.left == null && n.right == null)
    {
      x.add(n.val);
      return;
    }
    lst(n.left, x);
    lst(n.right, x);
  }
}
