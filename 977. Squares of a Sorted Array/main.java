class Solution {
    public int[] sortedSquares(int[] nums) {

        // O(n)
        for(int i = 0; i<nums.length; i++){
            nums[i] = Math.abs(nums[i] * nums[i]);
        }

        // O(n log n) - Dual-Pivot Quicksort 
        Arrays.sort(nums);

        // o(n)
        return nums;
    }
}
