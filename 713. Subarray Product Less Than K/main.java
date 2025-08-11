class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int windowStart = 0;
        int prod = 1;
        int ans = 0;
        for(int windowEnd = 0; windowEnd < nums.length; windowEnd++){
            prod *= nums[windowEnd];

            while(prod >= k){
                prod /= nums[windowStart];
                windowStart++;
            }

            ans += (windowEnd - windowStart) + 1;
        }

        return ans;
    }
}
