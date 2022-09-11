class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] ps = new int[n][2];
        for (int i = 0; i < n; i++) {
            ps[i][0] = speed[i];
            ps[i][1] = efficiency[i];
        }
        Arrays.sort(ps, (x, y) -> Integer.compare(x[1], y[1]));
        PriorityQueue<Integer> maxk = new PriorityQueue<>();
        long ksum = 0L;
        long best = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxk.offer(ps[i][0]);            
            long cur = (ksum + ps[i][0]) * ps[i][1];
            ksum += ps[i][0];
            best = Math.max(best, cur);
            if (maxk.size() > k - 1) {
                ksum -= maxk.poll();
            }
        }
        return (int) (best % 1000000007);
    }
}
