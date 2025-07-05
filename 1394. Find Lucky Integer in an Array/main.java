class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLuckyInt = -1;

        // Count frequency of each number
        for(int i : arr){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find Lucky numbers
        for(int i : arr){
            int freq = map.get(i);
            if(freq == i){
                maxLuckyInt = Math.max(i, maxLuckyInt); 
            }
        }

        return maxLuckyInt;
    }
}
