class Solution {
    public char findKthBit(int n, int k) {
        int positionInSection = k & -k;

        boolean isInInvertedPart = (((k / positionInSection) >> 1) & 1) == 1;

        boolean originalBitIsOne = (k & 1) == 0;

        if (isInInvertedPart) {
            return originalBitIsOne ? '0' : '1';
        } else {
            return originalBitIsOne ? '1' : '0';
        }
    }
}
