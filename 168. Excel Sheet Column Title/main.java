class Solution {
    public String convertToTitle(int n) {
        StringBuffer result = new StringBuffer();
        char ch;
        while (n > 0) {
            ch = (char)((int)'A' + (n-1) % 26);
            n = (n-1)/26;
            result.append(ch);
        }
        return new String(result.reverse());
    }
}
