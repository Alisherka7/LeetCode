import java.util.Map;
import java.util.HashMap;



// Time Complexity: Big O(n) We traverse the list containing n elements only once. Each lookup in the table costs only O(1) time.
// Space complexity: Big O(n) The extra space requred depends on the number of items stored in the hash table, which stores at most n elements
public class twoSum {
    public static int[] tSum(int[] nums, int target) throws IllegalAccessException{
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[] {map.get(comp)+1, i+1};
            }
            map.put(nums[i], i);
        }
        throw new IllegalAccessException("no match found");
        
    }
    
// BruteForce approach 
// Time complexity: Big O(n^2) For each element, we try to find its complement by loopoing through the rest of the array which takes O(n) time. Therefore, the time complexity is O(n^2)
// Space complexity: Big O(1) the space required does not depend on the size of the input array, so only constant space is used
    public static int[] twoS(int[] nums, int target){
        for(int i =0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i,j};
                }
            }
        }
        // if unable to get return empty array
        return new int[]{};
    }

    public static void main(String[] args) throws IllegalAccessException{
        int[] nums = {2,7,12,31,54,66};
        int target = 19;
        int[] res = twoS(nums, target);
        for(int n: res ){
            System.out.print(n + "");
        }
    }
}
