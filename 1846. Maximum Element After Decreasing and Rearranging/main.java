class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int maxVal = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal += 1;
            }
        }

        return maxVal;        
    }
}
