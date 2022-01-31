class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans =0 ;
        int [] ns = new int[nums1.length + nums2.length];
        int i=0, j=0 , k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] < nums2[j]){
                ns[k]= nums1[i];
                i++;
                k++;
            }else if(nums1[i] > nums2[j]){
                ns[k] = nums2[j];
                k++;
                j++;
            }else{
                ns[k] = nums1[i];
                k++;i++;
                ns[k] = nums2[j];
                k++;
                j++;
            }
        }
        while(i!=nums1.length){
            ns[k] = nums1[i];
            k++;
            i++;
        }
        while(j!=nums2.length){
            ns[k] = nums2[j];
            k++;
            j++;
        }
        
        if((ns.length)%2 == 0){
            int mid = (ns.length)/2;
            ans = (ns[mid] + ns[mid-1])/2.0; 
            return ans;
        }
        int mid = (ns.length)/2;
        ans = ns[mid] ; 
        return ans/1.0;
    }
    
}
