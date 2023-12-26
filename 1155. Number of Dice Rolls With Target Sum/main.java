class Solution {
    HashMap<String, Integer> vis;
    int MOD = 1000000000 + 7;
    public int numRollsToTargetHelper(int n, int sum, int k, int target, int dice) {
        if (dice == n) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }
        String key = sum + "," + dice;
        if (vis.containsKey(key)) {
            return vis.get(key);
        }
        int count = 0;
        for (int i = 1; i <= k; i++) {
            if (i + sum > target) {
                break;
            }
            count = (count + numRollsToTargetHelper(n, sum + i, k, target, dice + 1)) % MOD;
        }
        vis.put(key, count);
        return count;
    }
    public int numRollsToTarget(int n, int k, int target) {
        this.vis = new HashMap<String, Integer>();
        return numRollsToTargetHelper(n, 0, k, target, 0);
    }
}
