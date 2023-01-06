class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int[] count = new int[100001];
        for(int i = 0 ; i < costs.length ; i++){ 
            count[costs[i]]++;
        }
        int answer = 0;
        
        for(int i = 1 ; i < 100001 ; i++) {
            if(count[i] > 0) {
                int use = Math.min(coins / i, count[i]);
                coins -= use * i;
                answer += use;
            }
        }
        return answer;
    }
}
