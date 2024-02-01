class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int[][] res = new int[n / 3][3];
        for (int i = 0; i < n; i++) {
            res[i / 3][i % 3] = nums[i];
            if (i % 3 == 2 && nums[i] - nums[i - 2] > k) return new int[][]{};
        }
        return res;
    }
}
