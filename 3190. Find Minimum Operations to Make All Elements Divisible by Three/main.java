class Solution {
    public int minimumOperations(int[] nums) {
        int steps = 0;
        for(int n : nums){
            if(n % 3 != 0){
                steps++;
            }
        }
        return steps;
    }
}
