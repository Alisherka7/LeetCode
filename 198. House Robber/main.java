class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int rob(int[] nums) {
        return calculate(nums.length - 1, nums);
    }
    
    private int calculate(int n, int[] nums) {
        if (n == 0) {
            return nums[0];
        } if (n == 1) {
            return Math.max(nums[0], nums[1]);
        }
        
        if (!cache.containsKey(n)) {
            int val = Math.max(nums[n] + calculate(n - 2, nums), calculate(n - 1, nums));
            cache.put(n, val);
        }
        return cache.get(n);
    }
}
