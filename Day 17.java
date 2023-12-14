class Solution {
  public int longestSubarray(int[] nums) {
    int ans = 0;
    int count = 0;
    for (int l = 0, r = 0; r < nums.length; r++) 
    {
      if (nums[r] == 0)
      {
        count++;
      }
      while (count == 2)
      {
        if (nums[l++] == 0)
        {
          count--;
        }
      }
      ans = Math.max(ans, r - l);
    }
    return ans;
  }
}
