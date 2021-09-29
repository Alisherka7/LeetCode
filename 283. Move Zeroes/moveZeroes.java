

// Given an integer array nums, move all  0's to the end of it while maintaining the relative order of
// then non-zero elements;
// nums = [0,1,0,3,12]
// output: [1,3,12,0,0]


class moveZeroes{
    public static void moveZ(int[] nums){
        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for(int i = index; i<nums.length; i++){
            nums[i] = 0;
        }
    }


    public static void main(String[] args){
        int[] nums = {0,2,1,3,0,5,0,23};
        moveZ(nums);
        for(int i : nums){
            System.out.print(i + " ");
        }
    }

}
