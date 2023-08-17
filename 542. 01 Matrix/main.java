class Solution {
    public int[][] updateMatrix(int[][] arr) {
        int maxI=arr.length-1, maxJ=arr[0].length-1;
		
        int[] zeros = new int[(maxI+1)*(maxJ+1)*2];
        int size=0;
        for (int i=0;i<=maxI;i++) {
            for (int j=0;j<=maxJ;j++){
                if (arr[i][j]==0) {zeros[size++]=i;zeros[size++]=j;} 
            }    
        }
        for (int i=0;i<=maxI;i++){
            for (int j=0;j<=maxJ;j++){
                if (arr[i][j]==0) continue; 
                int minDist=Integer.MAX_VALUE;
                for (int k=0;k<size && minDist>1;k+=2){ 
					int zeroI = zeros[k];
                    int zeroJ = zeros[k+1];
                    int newDist = Math.abs(i-zeroI)+Math.abs(j-zeroJ);
                    minDist=Math.min(minDist,newDist);
                 }
                 arr[i][j]=minDist;
            }
        }
        return arr;
    }
}
