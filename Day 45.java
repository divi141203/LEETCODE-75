class Solution {
  public int minReorder(int n, int[][] connections) {
    List<Integer>[] a = new List[n];
    for (int i = 0; i < n; i++)
      a[i] = new ArrayList<>();
    for (int[] b : connections) {
        int c = b[0];
        int d = b[1];
        a[c].add(d);
        a[d].add(-c); 
    }
    return dfs(a, 0, -1);
  }
  private int dfs(List<Integer>[] a, int c, int x) {
    int ch = 0;
    for (int d : a[c]) {
      if (Math.abs(d) == x)
        continue;
      if (d > 0)
        ch++;
      ch += dfs(a, Math.abs(d), c);
    }
    return ch;
  }
}
