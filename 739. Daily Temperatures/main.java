class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> monoStack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int currTemp = temperatures[i];
            while (!monoStack.isEmpty() && temperatures[monoStack.peek()] < currTemp) {
                int ind = monoStack.pop();
                res[ind] = i - ind;
            }
            monoStack.push(i);
        }

        return res;
    }
}
