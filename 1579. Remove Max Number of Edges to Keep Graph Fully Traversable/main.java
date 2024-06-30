class DSU {
    int[] parent;
    int[] rank;

    public DSU(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }
    public int find(int x) {
        if (parent[x] == x) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }
    
    public boolean union(int x, int y) {
        int xl = find(x); 
        int yl = find(y);
        if(xl == yl)return false;  

        if (rank[xl] < rank[yl]) {
            parent[xl] = yl;
            return true;
        } 
        if (rank[xl] > rank[yl]) {
            parent[yl] = xl;
            return true;
        }     
        parent[xl] = yl;
        rank[yl]++;
        return true;
    }
}


class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {

        Arrays.sort(edges, (a, b) -> b[0]-a[0]); 
        DSU alice = new DSU(n+1);
        DSU bob = new DSU(n+1);
        int redundant = 0;
        int aliceEdges = 0;
        int bobEdges = 0;

        for (int[] edge : edges) {
            if (edge[0]==1){
                if (alice.union(edge[1], edge[2])) {
                    aliceEdges++;
                } else {
                    redundant++;
                }
            }
            else if (edge[0] == 2) {
                if (bob.union(edge[1], edge[2])) {
                    bobEdges++;
                } 
                else {
                    redundant++;
                }
            } 
            else{
                if(alice.union(edge[1], edge[2])) {
                    bob.union(edge[1], edge[2]); 
                    aliceEdges++;
                    bobEdges++;
                } 
                else {
                    redundant++;
                }
            }
        }
        return (bobEdges == n - 1 && aliceEdges == n - 1) ? redundant : -1;
    }
}
