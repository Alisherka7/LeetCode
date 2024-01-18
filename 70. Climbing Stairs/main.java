class Solution {
    public int climbStairs(int n) {
        int[] m = new int[n+1];
        return climbSt(n, m);
    }

    private int climbSt(int n, int[] m){
        if(n == 1){
            m[1] = 1;
        }
        if(n == 2){
            m[2] = 2;
        }
        if(m[n] > 0) return m[n];
        return m[n] = climbSt(n-1, m) + climbSt(n-2, m);
    }
}
