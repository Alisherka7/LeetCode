class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }
        
        Set<Integer> frSet = new HashSet<>(freq.values());
        return freq.size() == frSet.size();
    }
}
