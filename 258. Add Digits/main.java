class Solution {
    public int addDigits(int num) {
        int digitRoot = 0;
        while(num>0){
            digitRoot += num % 10;
            num = num/10;
            if(num == 0 && digitRoot > 9){
                num = digitRoot;
                digitRoot =0;
            }
        }
        return digitRoot;
    }
}
