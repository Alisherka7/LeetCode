class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] a = new int[n*2];
        k %= n;
        for(int i=0; i<n*2; ++i){
            a[i] = nums[i%n];
            System.out.print(a[i]);
        }
        for(int i=0; i<n; ++i){
            nums[i] = a[(n-k+i)%n];
        }
    }
}
