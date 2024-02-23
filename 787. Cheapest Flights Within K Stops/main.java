class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int path[]=new int[n];
        Arrays.fill(path,Integer.MAX_VALUE);
        path[src]=0;
        for(int i=0;i<=k;i++){
            int temp[]=Arrays.copyOf(path,n);
            for(int arr[]:flights){
                int u=arr[0];
                int v=arr[1];
                int wt=arr[2];
                if(path[u]==Integer.MAX_VALUE) continue;
                temp[v]=Math.min(temp[v],path[u]+wt);
            }
            path=temp;
        }
        return path[dst]==Integer.MAX_VALUE ? -1:path[dst];
    }
}
