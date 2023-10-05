class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int nums1=-1;
        int nums2=-2;
        int n=nums.length;
        int ct1=0;
        int ct2=0;
        for(int i=0;i<n;i++){

            if(nums[i]==nums1) ct1++;
            else if(nums[i]==nums2) ct2++;

            else if(ct1==0){
                nums1=nums[i];
                ct1=1;
            }
            else if(ct2==0){
                nums2=nums[i];
                ct2=1;
            }
            else{
                ct1--;
                ct2--;
            }
        }

        List<Integer>ans=new ArrayList<>();
        ct1=0;
        ct2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==nums1){
                ct1++;
            }
            if(nums[i]==nums2){
                ct2++;
            }
        }
        if(ct1>n/3) ans.add(nums1);
        if(ct2>n/3) ans.add(nums2);
        return ans;
    }
}
