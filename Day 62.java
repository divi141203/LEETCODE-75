class Solution {
  public int numTilings(int n) {
    int a = 1_000_000_007;
    long[] b = new long[1001];
    b[1] = 1;
    b[2] = 2;
    b[3] = 5;
    for (int i = 4; i <= n; i++)
    {
      b[i] = (2 * b[i - 1] + b[i - 3]) % a;
    }
    return (int) b[n];
  }
}
