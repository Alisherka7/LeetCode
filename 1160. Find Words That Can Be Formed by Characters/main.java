class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> counts = new HashMap();
        for (Character c : chars.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        int ans = 0;
        for (String word : words) {
            Map<Character, Integer> wordCount = new HashMap();
            for (Character c : word.toCharArray()) {
                wordCount.put(c, wordCount.getOrDefault(c, 0) + 1);
            }
            
            boolean good = true;
            for (Character c : wordCount.keySet()) {
                if (counts.getOrDefault(c, 0) < wordCount.get(c)) {
                    good = false;
                    break;
                }
            }
            
            if (good) {
                ans += word.length();
            }
        }
        
        return ans;
    }
}
