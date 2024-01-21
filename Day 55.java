class Solution {
  public int findPeakElement(int[] nums) {
    int a = 0;
    int b = nums.length - 1;
    while (a < b)
    {
      int m = (a + b) / 2;
      if (nums[m] >= nums[m + 1])
      {
        b = m;
      }
      else
      {
        a = m + 1;
      }
    }
    return a;
  }
}
