class Solution {
    public boolean isUgly(int n) {
        if(n<=0){
            return false;
        }
        int[] div = {2,3,5};
        for(int d : div){
            while(n % d == 0){
                n/=d;
            }
        }
        return n == 1;
    }
}
