import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxSize = 1;
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);

                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int currentSize = maxSize;
        int currentGcd = nums[maxIndex];

        for (int i = maxIndex; i >= 0; i--) {
            if (currentGcd % nums[i] == 0 && dp[i] == currentSize) {
                result.add(nums[i]);
                currentGcd = nums[i];
                currentSize--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = {1, 2, 3};
        System.out.println(solution.largestDivisibleSubset(nums1));

        int[] nums2 = {1, 2, 4, 8};
        System.out.println(solution.largestDivisibleSubset(nums2));
    }
}
