class Solution {
    public boolean closeStrings(String w1, String w2) {  
        int l1, l2;
        if ((l1 = w1.length()) != (l2 = w2.length()))
            return false;
        byte[] b1 = w1.getBytes(), b2 = w2.getBytes();
        int[] c1 = new int[26], c2 = new int[26];
        method(b1, c1, l1);
        method(b2, c2, l2);
        for (int i = 0; i < 26; i++)
            if (c1[i] > 0 ^ c2[i] > 0)
                return false;
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
        
    }

    void method(byte[] b, int[] c, int l) {
        while (l-- > 0)
            c[b[l] - 97]++;
    }

}
