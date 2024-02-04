class Solution {
  public int minFlips(int a, int b, int c) {
    int x = 30;
    int y = 0;
    for (int i = 0; i < x; i++)
    {
      if ((c >> i & 1) == 1)
      {
        y += ((a >> i & 1) == 0 && (b >> i & 1) == 0) ? 1 : 0;
      }
      else
      {
        y += ((a >> i & 1) == 1 ? 1 : 0) + ((b >> i & 1) == 1 ? 1 : 0);
      }
    }
    return y;
  }
}
