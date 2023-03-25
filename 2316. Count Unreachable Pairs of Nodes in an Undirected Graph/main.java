class Solution {
    public static class UnionFind {
        int[] R;

        public UnionFind(int n) {
            R = new int[n];
            for (int i = 0; i < n; i++) R[i] = i;
        }

        public int findRoot(int i) {
            int root = i;
            while (R[root] != root) root = R[root];
            int tmp;
            while (R[i] != root) {
                tmp = R[i];
                R[i] = root;
                i = tmp;
            }
            return root;
        }

        public boolean isConnected(int x, int y) {
            return findRoot(x) == findRoot(y);
        }

        public void union(int a, int b) {
            int x = findRoot(a);
            int y = findRoot(b);
            R[y] = x;
        }
    }
    

    public long countPairs(int n, int[][] edges) {
        UnionFind uf = new UnionFind(n);
        for (int[] e : edges) {
            uf.union(e[0], e[1]);
        }
        long[] cnt = new long[n];

        for (int i = 0; i < n; i++) {
            cnt[uf.findRoot(i)]++;
        }
        long ans = 0, sum = n;

        for (long c : cnt) {
            ans += c * (sum - c);
            sum -= c;
        }
        return ans;
    }
}
