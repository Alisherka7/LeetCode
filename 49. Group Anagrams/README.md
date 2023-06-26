# Group Anagram
주어진 ``` strs = ["eat","tea","tan","ate","nat","bat"] ```배열을 애너그램으로 그룹화화여 반환합니다.


```java
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length == 0){
            return res;
        }

        HashMap<String, List<String>> hm = new HashMap<>();
        for(String str : strs){
            int[] hash = new int[26];
            // create key
            for(char c : str.toCharArray()){
                hash[c - 'a']++;
            }
            // array to string
            String key = new String(Arrays.toString(hash));
            hm.computeIfAbsent(key, k -> new ArrayList<>());
            hm.get(key).add(str);
        }
        res.addAll(hm.values());
        return res;
    }
}
```
