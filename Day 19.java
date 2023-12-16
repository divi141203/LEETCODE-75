class Solution {
    public int pivotIndex(int[] nums) {
        int l = 0, r = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) 
        {
            r = r - nums[i];
            if (l == r) {
                return i;
            }
            l = l + nums[i];
        }
        return -1;
    }
}
