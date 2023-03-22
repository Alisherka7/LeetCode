class DSA {
    int n;
    int[] parents, values;
    public DSA(int num) {
        n = num+1;
        parents = new int[num+1];
        values = new int[num+1];
        
        for (int i = 0; i <= num; ++i) {
            parents[i] = i;
            values[i] = Integer.MAX_VALUE;
        }
    }
    public int find(int x) {
        if (parents[x] != x) {
            parents[x] = find(parents[x]);
        }
        return parents[x];
    }
    public void unionfind(int a, int b, int edge) {
        int pa = find(a);
        int pb = find(b);
        
        if (pa == pb) {
            if (values[pa] > edge) {
                values[pa] = edge;
            }
        } else if (pa < pb) {
            values[pa] = Math.min(values[pa], values[pb]);
            parents[pb] = pa;
            
            values[pa] = Math.min(values[pa], edge);
        } else {
            values[pb] = Math.min(values[pa], values[pb]);
            parents[pa] = pb;
            
            values[pb] = Math.min(values[pb], edge);
        }
    }
    
    public int GetValue(int x) {
        return values[x];
    }
}


class Solution {
    public int minScore(int n, int[][] roads) {
        DSA dsa = new DSA(n);
        
        for (int[] road : roads) {
            dsa.unionfind(road[0], road[1], road[2]);
        }
        
        return dsa.GetValue(1);
    }
}
