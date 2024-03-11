class Solution {
    public String customSortString(String order, String s) {
        StringBuilder sb = new StringBuilder("");

        char[] strS = s.toCharArray();

        // Step1: count the frequence of each character in s
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for (char c : strS) {
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            }
            else {
                hm.put(c, 1);
            }
        }

        // Step2 create the result string based on the order
        char[] strOrder = order.toCharArray();
        for (char c : strOrder) {
            if (hm.containsKey(c) && hm.get(c) > 0) {
                int count = hm.get(c);
                for (int i = 0; i < count; i++) {
                    sb.append(c);
                }
                hm.put(c, 0);
            }
        }

        /// Step 3: Add remaining characters from str not in order
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > 0) {
                for (int i = 0; i < entry.getValue(); i++) {
                    sb.append(entry.getKey());
                }
            }
        }

        return sb.toString();

    }
}
