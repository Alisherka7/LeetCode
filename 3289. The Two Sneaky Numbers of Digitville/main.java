class Solution {

    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length - 2;
        double sum = 0;
        double squaredSum = 0;
        for (int x : nums) {
            sum += x;
            squaredSum += x * x;
        }
        double sum2 = sum - (n * (n - 1)) / 2.0;
        double squaredSum2 = squaredSum - (n * (n - 1) * (2 * n - 1)) / 6.0;
        int x1 = (int) ((sum2 - Math.sqrt(2 * squaredSum2 - sum2 * sum2)) / 2);
        int x2 = (int) ((sum2 + Math.sqrt(2 * squaredSum2 - sum2 * sum2)) / 2);
        return new int[] { x1, x2 };
    }
}
