class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k == 0) return 0;
        double logK = Math.log(k);
        int m = nums.length + 1;
        double[] logsPrefixSum = new double[m];
        
        // Calculate prefix sum of logarithms of elements
        for (int i = 0; i < nums.length; i++) {
            logsPrefixSum[i + 1] = logsPrefixSum[i] + Math.log(nums[i]);
        }

        int totalCount = 0;
        // Calculate subarray count with product less than k
        for (int currIdx = 0; currIdx < m; currIdx++) {
            int low = currIdx + 1, high = m;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (logsPrefixSum[mid] < logsPrefixSum[currIdx] + logK - 1e-9) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            totalCount += low - currIdx - 1;
        }
        return totalCount;
    }
}
