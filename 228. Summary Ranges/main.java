class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> ans = new ArrayList<>();
        
        
        for(int i=0;i<nums.length;i++)
        {
            int start=nums[i];
            while(i+1<nums.length && nums[i]+1 == nums[i+1])
            {
                i++;
            }
            
            //This ensures that in our range there is more than one element.
            if(start!=nums[i])
            {
                ans.add("" + start + "->"+nums[i]);  
            }
            else
            {
                ans.add(""+start);
            }
        }
        return ans;
    }
}
