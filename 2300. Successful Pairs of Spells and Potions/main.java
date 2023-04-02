class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        for(int i = 0; i < spells.length; i++){
            long target = (success + spells[i] - 1) / spells[i];
            int left = 0;
            int right = potions.length - 1;

            while(left < right) {
                int mid = (right + left) / 2;
                if(potions[mid] < target) left = mid + 1;
                else right = mid;
            }

            if(potions[left] < target) left++;
            spells[i] = potions.length - left;
        }

        return spells;
    }
}
