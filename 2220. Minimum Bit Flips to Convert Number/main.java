class Solution {

    public int minBitFlips(int start, int goal) {
        // XOR to find differing bits
        int xorResult = start ^ goal;
        int count = 0;
        // Brian Kernighans algorithm to count 1s
        while (xorResult != 0) {
            xorResult &= (xorResult - 1); // Clear the lowest set bit
            count++;
        }
        return count;
    }
}
