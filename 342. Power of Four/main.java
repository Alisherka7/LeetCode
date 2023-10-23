class Solution {
    public boolean isPowerOfFour(int n) {
        int m = (int)(Math.sqrt(n));
        for(int i =0; i<=m; i++){
            if(Math.pow(4,i) == n){
                return true;
            }
        }
        return false;
    }
}
