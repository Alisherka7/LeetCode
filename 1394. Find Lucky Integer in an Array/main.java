class Solution {
    public int findLucky(int[] arr) {
        int[] freq = new int[501]; // Since 1 <= arr[i] <= 500

        // Count frequency of each number
        for (int num : arr) {
            freq[num]++;
        }

        // Check from largest to smallest
        for (int i = 500; i >= 1; i--) {
            if (freq[i] == i) {
                return i;
            }
        }

        return -1; // No lucky integer found
    }
}
