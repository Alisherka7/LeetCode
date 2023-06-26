class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0){
            return res;
        }

        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            int[] hash = new int[26];
            for(char c : s.toCharArray()){
                hash[c - 'a']++;
            }
            String key = new String(Arrays.toString(hash));
            hm.computeIfAbsent(key, k -> new ArrayList<>());
            hm.get(key).add(s);
        }
        res.addAll(hm.values());
        return res;
    }
}
