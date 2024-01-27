class Solution {
  public int rob(int[] nums) {
    int x = 0;
    int y = 0;
    for (int num : nums)
    {
        int a = Math.max(x, y + num);
        y = x;
        x = a;
    }
    return x;
  }
}
