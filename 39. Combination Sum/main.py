class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        self.ans = []
        
        def traverse(candid, arr, sum):
            if sum == target :
                self.ans.append(arr)
            if sum >= target:
            for i in range(len(candid)):
                traverse(candid[i:], arr + [candid[i]], sum + candid[i])
        traverse(candidates,[],0)
        return self.ans
        
        
        
    
