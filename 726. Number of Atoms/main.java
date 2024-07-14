import java.util.regex.*;

class Solution {

    public String countOfAtoms(String formula) {
        // Every element of matcher will be a quintuple
        Matcher matcher = Pattern.compile(
            "([A-Z][a-z]*)(\\d*)|(\\()|(\\))(\\d*)"
        ).matcher(formula);
        List<String[]> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(
                new String[] {
                    matcher.group(1),
                    matcher.group(2),
                    matcher.group(3),
                    matcher.group(4),
                    matcher.group(5),
                }
            );
        }
        Collections.reverse(list);

        // Map to store the count of atoms
        Map<String, Integer> finalMap = new HashMap<>();

        // Stack to keep track of the nested multiplicities
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        // Current Multiplicity
        int runningMul = 1;

        // Parse the formula
        for (String[] quintuple : list) {
            String atom = quintuple[0];
            String count = quintuple[1];
            String left = quintuple[2];
            String right = quintuple[3];
            String multiplier = quintuple[4];

            // If atom, add it to the final map
            if (atom != null) {
                int cnt = count.length() > 0 ? Integer.parseInt(count) : 1;
                finalMap.put(
                    atom,
                    finalMap.getOrDefault(atom, 0) + cnt * runningMul
                );
            }
            // If the right parenthesis, multiply the runningMul
            else if (right != null) {
                int currMultiplier = multiplier.length() > 0
                    ? Integer.parseInt(multiplier)
                    : 1;
                runningMul *= currMultiplier;
                stack.push(currMultiplier);
            }
            // If left parenthesis, divide the runningMul
            else if (left != null) {
                runningMul /= stack.pop();
            }
        }

        // Sort the final map
        TreeMap<String, Integer> sortedMap = new TreeMap<>(finalMap);

        // Generate the answer string
        StringBuilder ans = new StringBuilder();
        for (String atom : sortedMap.keySet()) {
            ans.append(atom);
            if (sortedMap.get(atom) > 1) {
                ans.append(sortedMap.get(atom));
            }
        }

        return ans.toString();
    }
}
