class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int minCost = prices[0] + prices[1];

        if(minCost <= money){
            return money - minCost;
        }else{
            return money;
        }
    }
}
