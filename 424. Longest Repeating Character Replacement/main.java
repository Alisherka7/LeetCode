class Solution {
    public int characterReplacement(String s, int k) {
        int maxSubstring = 0;
        int maxFreq = 0;
        int windowStart = 0;

        Map<Character, Integer> map = new HashMap<>();

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++){
            char in = s.charAt(windowEnd);
            int currFreq = map.getOrDefault(in, 0) + 1;
            map.put(in, currFreq);
            maxFreq = Math.max(maxFreq, currFreq);
            
            while((windowEnd - windowStart) + 1 - maxFreq > k){
                char out = s.charAt(windowStart);
                map.put(out, map.get(out) - 1);
                if(map.get(out) == 0){
                    map.remove(out);
                }
                windowStart++;
            }
            maxSubstring = Math.max(maxSubstring, (windowEnd - windowStart) + 1);
        }

        return maxSubstring;
    }
}
