class Solution {
    public int findMaxK(int[] nums) {
        int ans = -1;

        BitSet seen  = new BitSet(2048);

        for(int num : nums){
            int absNum = Math.abs(num);

            if(absNum > ans && seen.get(-num + 1024)){
                ans = absNum;
            }

            seen.set(num+1024);
        }

        return ans;
    }
}
