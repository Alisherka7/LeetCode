class Solution {
    public boolean rotateString(String s, String goal) {
        // check if lengths are dirrent
        if(s.length() != goal.length()) return false;

        String doubledString = s + s;

        return doubledString.contains(goal);
        
    }
}
