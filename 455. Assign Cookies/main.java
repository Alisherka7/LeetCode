class Solution {
    public int findContentChildren(int[] g, int[] s) {
        // Sort the array g (greed factors) in ascending order.
        Arrays.sort(g);
        // Sort the array s (sizes of cookies) in ascending order.
        Arrays.sort(s);

        // Initialize the count of content children to 0.
        int contentChildren = 0;
        // Initialize the index for iterating over the cookie array to 0.
        int cookieIndex = 0;

        // Iterate while there are cookies and children left.
        while(cookieIndex < s.length && contentChildren < g.length){
            // Check if the current cookie is enough to satisfy the current child's greed.
            if (s[cookieIndex] >= g[contentChildren]){
                // If yes, increment the count of content children.
                contentChildren++;
            }
            // Move to the next cookie.
            cookieIndex++;
        }

        // Return the total count of content children.
        return contentChildren;

        // Time complexity - O(n * logn + m * log m) where n is the size of the array g and n is the size of array s.
        // Space Complexity - O(m + n) or O(log m + log n)
    }
}
