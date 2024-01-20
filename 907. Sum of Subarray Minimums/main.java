class Solution {
    public int sumSubarrayMins(int[] arr) {
       int MOD = 1000000007;
        Stack<Integer> st = new Stack<>();
        long sumOfMin = 0;
        for(int i =0; i<=arr.length; i++){
            while(!st.empty() && (i == arr.length || arr[st.peek()] >= arr[i])){
                int mid = st.pop();
                int leftBound = st.empty() ? -1 : st.peek();
                int rightBound = i;
                
                long count = (mid - leftBound) * (rightBound - mid) % MOD;
                sumOfMin += (count * arr[mid]) % MOD;
                sumOfMin %= MOD;
            }
            st.push(i);
        }
        return(int) (sumOfMin);
    }
}
