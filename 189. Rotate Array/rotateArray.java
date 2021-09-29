public class rotateArray {
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        int[] aux = new int[n*2];
        k %= n;

        // make the aux array be twice the original array
        // nums: [1,2,3] -> aux: [1,2,3,1,2,3]

        for(int i = 0; i<n*2; ++i){
            aux[i]  = nums[i%n];
        }

        //start where the rotation should end in the aux array
        // and iterate copy values to nums[]
        for(int i=0; i<n; ++i){
            nums[i] = aux[(n-k+i) % n];
        }
    }
    public static void main(String[] args){
        int[] nums = {2,3,1,4,5,6,75};
        int k = 3;
        rotate(nums, k);
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}
