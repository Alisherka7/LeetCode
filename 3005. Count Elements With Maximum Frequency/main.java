class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int n : nums){
            h.put(n, h.getOrDefault(n, 0)+1);
        }

        int maxFrequency = 0;
        for(int frequency : h.values()){
            maxFrequency = Math.max(maxFrequency, frequency);
        }

        int fqOfMax = 0;
        for(int frequency : h.values()){
            if(frequency == maxFrequency){
                fqOfMax++;
            }
        }

        
        return fqOfMax * maxFrequency;
    }
}
