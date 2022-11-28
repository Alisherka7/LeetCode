class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] lossCount = new int[100001];
        Arrays.fill(lossCount, -1); // O(n)
        for(int[] m : matches){
            int win = m[0], loser = m[1];
            if(lossCount[win] == -1){
                lossCount[win] = 0;
            }
            if(lossCount[loser] == -1){
                lossCount[loser] = 1;
            }else{
                lossCount[loser]++;
            }
        }
        
        List<List<Integer>> res = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        for(int i =0; i<100001; ++i){
            if(lossCount[i] == 0){
                res.get(0).add(i);
            }else if(lossCount[i] == 1){
                res.get(1).add(i);
            }
        }
        return res;
    }
}
