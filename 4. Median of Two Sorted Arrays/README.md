### 4. Median of Two Sorted Arrays

Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

### Example 1:
```
Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
```

### Example 2:
```
Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
```

### Constraints:
```
nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6
```

# Java Solution
```java
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
```
