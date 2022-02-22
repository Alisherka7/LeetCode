class Solution {
    public int titleToNumber(String columnTitle) {
        int colNumber = 0;
        for(int i = 0; i<columnTitle.length(); i++){
            colNumber = colNumber * 26 + columnTitle.charAt(i) - 'A' + 1;
        }
        return colNumber;
    }
}
