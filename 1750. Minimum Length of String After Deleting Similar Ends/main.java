class Solution {
    public int minimumLength(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right && s.charAt(left) == s.charAt(right)){
            char c = s.charAt(left);
            // delete similar ends until the ends differ or they meet in the middle
            while (left <= right && s.charAt(left) == c) {
                left++;
            }

            // delete consicutive occurences of c from suffix
            while (right > left && s.charAt(right) == c) {
                right--;
            }
        }

        return right - left + 1;
    }
}
