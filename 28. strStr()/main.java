class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        String ans = "";
        if(n > h){
            return -1;
        }else if(n == 0){
            return 0;
        }
        for(int i=0; i<=h-n; i++){
            ans = haystack.substring(i, n+i);
            if(ans.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
