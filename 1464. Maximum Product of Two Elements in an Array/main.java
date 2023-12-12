class Solution {
    public int maxProduct(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        int first_max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;

        while(left <= right){
            if(nums[left] > first_max){
                second_max = first_max;
                first_max = nums[left];
            }else if(nums[left] > second_max){
                second_max = nums[left];
            }
            
            if(left != right){
                if(nums[right] > first_max){
                    second_max = first_max;
                    first_max = nums[right];
                }else if(nums[right] > second_max){
                    second_max = nums[right];
                }
            }

            left += 1;
            right -= 1;
        }
        return (first_max - 1) * (second_max - 1);
    }
}
