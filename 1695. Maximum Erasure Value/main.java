class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length; // Total number of elements
        boolean[] seen = new boolean[10001]; // seen[k] == true if k is in the current window
                                            // we use size 1001 because 0 <= nums[i] <= 1000
        int left = 0; // left end of our  window
        int currentSum = 0; // sum of nums[left...right-1]
        int maxSum = 0; // Best sum seen so far

        for(int right=0; right<n; right++){
            // if nums[right] is already in window, shrink from the left
            while(seen[nums[right]]){
                currentSum -= nums[left]; // Remove nums[left] from our running sum
                seen[nums[left]] = false; // mark it as no longer in the window
                left++; // move left end rightward
            }

            // Now nums[right] is unique in the window
            currentSum += nums[right]; // Include it in our sum
            seen[nums[right]] = true; // Mark it present
            maxSum = Math.max(maxSum, currentSum);
        }


        return maxSum;
        // Time complexity: O(n) becasue left and right each move forward at most n steps
        // Space complexity: O(1) if you view the 1001-sized array as a constant bound, or O(u) with u = max possible value + 1
    }
}
