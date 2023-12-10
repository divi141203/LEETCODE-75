class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int a = 0, b = nums.length - 1;
        int res = 0;
        while (a < b) 
        {
            int sum = nums[a] + nums[b];
            if (sum == k) {
                res++;
                a++;
                b--;
            } 
            else if (sum > k) 
            {
                b--;
            } 
            else 
            {
                a++;
            }
        }
        return res;
    }
}
