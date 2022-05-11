class Solution {
    public int[] solve(int n) {
        if(n==1) {
            return new int[] {1,1,1,1,1};
        }
        int[] temp = solve(n-1);
        for(int i=3; i>=0; i--) {
            temp[i] += temp[i+1];
        }
        return temp;
    }
    
    public int countVowelStrings(int n) {
        int[] ans = solve(n);
        int sum = 0;
        for(int num: ans) {
            sum += num;
        }
        return sum;
    }
}
