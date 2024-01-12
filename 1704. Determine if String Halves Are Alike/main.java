class Solution {
    private static final Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
    
    public boolean halvesAreAlike(String s) {
        int mid = s.length()/2;
        int count = 0;
        int l = mid-1,r=mid;
        while(l>=0){
            if(vowels.contains(s.charAt(l--))) count++;
            if(vowels.contains(s.charAt(r++))) count--;
        }
        return count==0;
    }
}
