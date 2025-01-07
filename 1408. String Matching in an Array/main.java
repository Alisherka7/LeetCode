class Solution {
    public List<String> stringMatching(String[] words) {
        
        List<String> res = new ArrayList<>();
        Arrays.sort(words, (a, b) -> Integer.compare(b.length(), a.length()));
        for(int i =0; i<words.length; i++){
            for(int j = i+1; j<words.length; j++){
                if(words[i].indexOf(words[j]) >= 0 && !res.contains(words[j])){
                    res.add(words[j]);
                }
            }
        }

        return res;
    }
}
