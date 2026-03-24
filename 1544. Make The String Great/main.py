class Solution:
    def makeGood(self, s: str) -> str:
        res = list(s)
        i = 0
        
        while i < len(res) - 1:
            if res[i] != res[i + 1] and res[i].lower() == res[i + 1].lower():
                res.pop(i)
                res.pop(i)
                i = 0
                continue
            
            i += 1
        
        return ''.join(res)
