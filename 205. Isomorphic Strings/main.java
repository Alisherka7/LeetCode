class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] mappingDictS = new int[256];
        Arrays.fill(mappingDictS, -1); // filling all S -1

        int[] mappingDictT = new int[256];
        Arrays.fill(mappingDictT, -1); // filling all T -1

        for(int i =0; i<s.length(); ++i){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // case 1 - no mapping exists in either of the dictionaries
            if(mappingDictS[c1] == -1 && mappingDictT[c2] == -1){
                mappingDictS[c1] = c2;
                mappingDictT[c2] = c1;
            }

            else if (!(mappingDictS[c1] == c2 && mappingDictT[c2] == c1)){
                return false;
            }
        }

        return true;
    }
}
