class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length < 2)
            return false;
        Arrays.sort(arr);
        int k = arr[1] - arr[0];
        for(int i=1; i+1 < arr.length; i++){
            if(arr[i+1]-arr[i] != k)
                return false;
        }
        return true;
    }
}
