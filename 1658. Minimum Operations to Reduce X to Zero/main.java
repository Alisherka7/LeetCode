class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for(int i : nums){
            total+=i;
        }

        int sum = total-x;
        int left =0;
        int right =0;
        int n = nums.length;
        int sum2=0;
        int result = Integer.MIN_VALUE;

        if(sum==0){
            return n;
        }


        while(right < n){
            sum2 += nums[right];
            while(left <= right && sum2 > sum){
                sum2 -= nums[left];
                left++;
            }

            right++;
            if(sum == sum2){
                result = Math.max(result, right - left);
            }
        }

        return result == Integer.MIN_VALUE?-1:n-result;
    }
}
