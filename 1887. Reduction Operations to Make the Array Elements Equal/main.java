class Solution {

    public int reductionOperations(int[] arr) {
        
        Arrays.sort(arr);

        int ans = 0;

        for(int i=arr.length-1; i>0; i--){
            if(arr[i]!=arr[i-1]){
                ans+=(arr.length-i);
            }
        }
        return ans;
    }
}
