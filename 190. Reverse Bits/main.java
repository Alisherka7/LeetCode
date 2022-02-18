public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        System.out.println(n);
        for(int i = 0; i<32; i++){
            res += n & 1;
            n >>>= 1;
            if(i < 31){
                res <<= 1;
            }
        }
        System.out.println(res);
        return res;
    }
}
