class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int a = nums.length;
        int c =0;
        int count = 0;
        for(int i =2; i<nums.length; i++){
            if(nums[i] - nums[i -1 ] == nums[i - 1] - nums[i - 2] ){
                c+= ++count;
            }else{
                count = 0;
            }
        }
        return c;
    }
}
