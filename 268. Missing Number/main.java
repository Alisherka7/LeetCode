class Solution {
    public int missingNumber(int[] nums) {
        int[] db = new int[nums.length+1];
        for(int i =0; i<nums.length; i++){
            db[nums[i]] = 1;
        }
        for(int i =0; i<db.length; i++){
            if(db[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
