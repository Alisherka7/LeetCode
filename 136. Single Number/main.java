class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> numF = new HashMap<>();
        
        for(int i = 0; i<nums.length; i++){
            if(!numF.containsKey(nums[i])){
                numF.put(nums[i], 1);
            }else{
                numF.put(nums[i], numF.get(nums[i]) + 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : numF.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value == 1){
                return key;
            }
        }
        return -1;
    }
}
