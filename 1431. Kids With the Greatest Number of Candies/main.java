class Solution {
   static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       
        ArrayList<Boolean> bool = new ArrayList<Boolean>(4);
        int max_value = candies[0];
        
        for(int i = 0; i < candies.length; i++){
            max_value = Math.max(max_value, candies[i]);
            candies[i] = candies[i] + extraCandies;
        }
        for(int j = 0; j < candies.length ; j ++){
            if(candies[j] < max_value){
                bool.add(false);
            }
            else{
                bool.add(true);
            }
        }
        return bool;
    }
}
