/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
     public int findInMountainArray(int target, MountainArray mountainArr) {
        int firstTry = orderAgnosticBS(target,mountainArr,0,peakInMountain(mountainArr));

        if (firstTry != -1){
            return firstTry;
        }
            return orderAgnosticBS(target, mountainArr,peakInMountain(mountainArr) + 1,mountainArr.length() - 1);    
    }

    public int peakInMountain(MountainArray mountainArr){
            int start = 0;
            int end = mountainArr.length() - 1;

            while (start < end){
                int mid = start + (end - start)/2;
                int middleEle = mountainArr.get(mid);
                int middleEleplusone = mountainArr.get(mid + 1);

                if (middleEle > middleEleplusone){
                    end = mid;
                }

                else if (middleEle < middleEleplusone){
                    start = mid + 1;
                }
            }
            return start;
        }

     public int orderAgnosticBS(int target, MountainArray mountainArr,int start, int end){
            boolean isAsc = mountainArr.get(start) < mountainArr.get(end);

            while (start <= end){
                int mid = start + (end - start)/2;
                int middleEle = mountainArr.get(mid);

                if (middleEle == target){
                    return mid;
                }

                else if (isAsc){
                    if (target < middleEle){
                        end = mid - 1;
                    }
                    else {
                        start = mid + 1;
                    } 
                }

                else {
                    if (target < middleEle){
                        start = mid + 1;
                    } 
                    else {
                        end = mid - 1;
                    } 
                }
            }
        return -1;
    }
}
