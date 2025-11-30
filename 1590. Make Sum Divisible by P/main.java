public class Solution {

    public int minSubarray(int[] nums, int p) {
        int n = nums.length;
        long totalSum = 0;

        // Calculate the total sum
        for (int num : nums) {
            totalSum += num;
        }

        // If the total sum is already divisible by p, no subarray needs to be removed
        if (totalSum % p == 0) return 0;

        int minLen = n; // Initialize minLen to the size of the array

        // Try removing every possible subarray
        for (int start = 0; start < n; ++start) {
            long subSum = 0; // Initialize subarray sum
            for (int end = start; end < n; ++end) {
                subSum += nums[end]; // Calculate the subarray sum

                // Check if removing this subarray makes the remaining sum divisible by p
                long remainingSum = (totalSum - subSum) % p;

                if (remainingSum == 0) {
                    minLen = Math.min(minLen, end - start + 1); // Update the smallest subarray length
                }
            }
        }

        // If no valid subarray is found, return -1
        return minLen == n ? -1 : minLen;
    }
}
