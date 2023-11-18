class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left=0, right=0;
        long total = 0, ans =0;
        for(right=0; right<nums.length; right++){
            total += nums[right];

            while((nums[right]*(right-left+1)) > (total+k)){
                total -= nums[left];
                left++;
            }
            ans = Math.max(ans, right-left+1);
        }
        return (int)ans;
    }
}
