class Solution {
    public int minCostConnectPoints(int[][] points) {
        int res = 0;
        int numVisited = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        int[] minDist = new int[points.length];
        Arrays.fill(minDist, Integer.MAX_VALUE);
        pq.offer(new int[]{0, 0});
        while(numVisited < points.length) {
            int[] cur = pq.poll();
            if (minDist[cur[0]] < 0) {
                continue;
            }
            minDist[cur[0]] = -1;
            res += cur[1];
            numVisited++;
            for (int i=0; i<points.length; i++) {
                if (minDist[i] < 0) continue;
                int d = dist(i, cur[0], points);
                if (d < minDist[i]) {
                    pq.offer(new int[]{i, d});
                    minDist[i] = d;
                }
            }
        }
        return res;
    }

    private int dist(int i, int j, int[][] points) {
        return Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
    }
}
