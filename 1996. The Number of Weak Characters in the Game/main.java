class Solution {
public int numberOfWeakCharacters(int[][] properties) {
    int count = greedyApproach (properties);
    return count;
}

private int greedyApproach (int[][] properties) {
    int count = 0;
    
    int maxAttack = 0;
    for (int[] character: properties) {
        maxAttack = Math.max (character[0], maxAttack);
    }
    
    int[] maxDefense = new int[maxAttack + 2];
    
    for (int[] character: properties) {
        int attack = character[0];
        maxDefense[attack] = Math.max (maxDefense[attack], character[1]);
    }
    
    for (int attack = maxAttack - 1; attack >= 0; attack--) {
        maxDefense[attack] = Math.max (maxDefense[attack], maxDefense[attack + 1]);
    }
    for (int[] character: properties) {
        int attack = character[0];
        int defense = character[1];
        if (defense < maxDefense[attack + 1])
            count++;
    }
    
    return count;
    
}

private int sortingApproach (int[][] properties) {
    Arrays.sort (properties, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
    
    int max = 0;
    int count = 0;
    
    for (int[] character: properties){
        if (character[1] < max)
            count++;
        max = Math.max (max, character[1]);
    }
    
    return count;
}
}
