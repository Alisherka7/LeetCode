class Solution {
    public int numberOfMatches(int n) {
        int roundSum = 0;
        int currentRound = 0;
        while(n > 1){
            if(n % 2 == 0){
                roundSum += (n / 2);
                n = n - (n / 2);
            }else{
                roundSum += ((n-1)/2);
                n = n - ((n-1)/2);
            }

            System.out.println("sum round" + roundSum);
        }
        return roundSum;
    }
}
