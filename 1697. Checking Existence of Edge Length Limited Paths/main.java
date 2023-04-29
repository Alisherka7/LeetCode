class Solution {
    int[] up;
    public boolean[] distanceLimitedPathsExist(int n, int[][] edgeList, int[][] queries) {
        up = new int[n];
        Arrays.fill(up, -1);
        
        boolean[] res = new boolean[queries.length];
        Arrays.sort(edgeList, new arrComparator());
        int[][] temp = new int[queries.length][4];
        for (int i = 0; i < temp.length; i++) {
            temp[i][0] = queries[i][0];
            temp[i][1] = queries[i][1];
            temp[i][2] = queries[i][2];
            temp[i][3] = i;
        }
        queries = temp;
        Arrays.sort(queries, new arrComparator());
        
        int limit = 0;
        int j = 0;
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            if (q[2] > limit) {
                limit = q[2];
                while (j < edgeList.length && edgeList[j][2] < limit) {
                    int x = edgeList[j][0];
                    int y = edgeList[j][1];
                    if (find(x) != find(y)) union(find(x), find(y));
                    j++;
                }
            }
            res[q[3]] = find(q[0]) == find(q[1]);
        }
        return res;
    }
    
    private int find(int x) {
        int r = x;
        while (up[r] >= 0) {
            r = up[r];
        }
        
        if (r == x) return r;
        
        int p = up[x];
        while (p >= 0) {
            up[x] = r;
            x = p;
            p = up[x];
        }
        return r;
    }
    
    private void union(int x, int y) {
        if (up[x] > up[y]) {
            up[y] += up[x];
            up[x] = y;
        } else {
            up[x] += up[y];
            up[y] = x;
        }
    }
    
    class arrComparator implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            return a[2] - b[2];
        } 
    }
}
