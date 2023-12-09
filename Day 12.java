class Solution {
  public int maxArea(int[] height) {
    int ans = 0,a = 0;
    int b = height.length - 1;
    while (a < b) 
    {
      int minHeight = Math.min(height[a], height[b]);
      ans = Math.max(ans, minHeight * (b - a));
      if (height[a] < height[b])
      {
        a++;
      }
      else
      {
        b--;
      }
    }
    return ans;
  }
}
