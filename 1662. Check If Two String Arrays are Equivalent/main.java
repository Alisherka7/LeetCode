class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder word1Combined = new StringBuilder();
        for (String s : word1) {
            word1Combined.append(s);
        }
        
        StringBuilder word2Combined = new StringBuilder();
        for (String s : word2) {
            word2Combined.append(s);
        }

        return word1Combined.compareTo(word2Combined) == 0;
    }
}
