class Solution {
    public int pivotInteger(int n) {
        if(n == 1){
            return 1;
        }

        int left = 1;
        int right = n;

        int sumLeft = left;
        int sumRight = right;
        while(left < right){
            if(sumLeft < sumRight){
                sumLeft += ++left;
            }else{
                sumRight += --right;
            }

            if(sumLeft == sumRight && left + 1 == right - 1){
                return left + 1;
            }
        }
        return -1;
    }
}
