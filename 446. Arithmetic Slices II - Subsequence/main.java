class Solution {
    public record Key(int idx, long ln, long prevDiff, int size){}
    // ln : last number in the current arithmetic sequence
    public int solve(int[] nums, int idx, long ln, long prevDiff, int size, HashMap<Key, Integer> map){
        if(idx >= nums.length) return 0;
        else if(map.containsKey(new Key(idx, ln, prevDiff, size))){
            return map.get(new Key(idx, ln, prevDiff, size));
        }
        int count = 0;
        for(int i = idx; i < nums.length; i++){
            if(size == 0){
                count += solve(nums, i + 1, nums[i], 0, size + 1, map);
            }
            else if(size == 1){
                count += solve(nums, i + 1, nums[i], nums[i] - ln, size + 1, map);
            }
            else if(size >= 2){
                long currDiff = nums[i] - ln;
                if(currDiff == prevDiff) count += 1 + solve(nums, i + 1, nums[i], nums[i] - ln, size + 1, map);
            }
        }
        map.put(new Key(idx, ln, prevDiff, size), count);
        return count;
    }
    public int numberOfArithmeticSlices(int[] nums) {
        return solve(nums, 0, 0, 0l, 0, new HashMap<>());
    }
}
