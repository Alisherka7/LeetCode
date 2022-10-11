class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int leftMin[] = new int[n];
        int rightMax[] = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            min = Math.min(min, nums[i]);
            leftMin[i] = min;
        }
        int max = Integer.MIN_VALUE;
        for(int i = n-1;i>=0;i--){
            max = Math.max(nums[i], max);
            rightMax[i] = max;
        }
        for(int i = 0;i<n;i++){
            if(leftMin[i] < nums[i] && nums[i] < rightMax[i]){
                return true;
            }
        }
        return false;
    }
}
