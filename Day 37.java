class Tree {
  public int a;
  public int b;
  public int x;
  public Tree(int a, int b, int x)
  {
    this.a = a;
    this.b = b;
    this.x = x;
  }
}
class Solution {
  public int longestZigZag(TreeNode root) {
    return path(root).x;
  }
  private Tree path(TreeNode root){
    if (root == null)
      return new Tree(-1, -1, -1);
    Tree left = path(root.left);
    Tree right = path(root.right);
    int l = left.b + 1;
    int r = right.a + 1;
    int sub = Math.max(Math.max(l, r), Math.max(left.x, right.x));
    return new Tree(l, r, sub);
  }
}
