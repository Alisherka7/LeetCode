class Solution {
    public int countHomogenous(String s) {
        int ans=0, count=0, mod = (int)1e9+7;
        char last='0';
        for(char ch: s.toCharArray()){
            if(last=='0'){
                count=0;
                ans+= ++count;
                last = ch;
            }
            else if(last==ch){
                ans+= ++count;
            }
            else{
                ans+=1;
                count =1;
                last=ch;
            }
            ans%=mod;
        }
        return ans;
    }
}
