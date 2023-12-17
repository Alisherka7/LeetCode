class FoodRatings {
    private Map<String, Pair<String, Integer>> foodInfo = new HashMap<>();
    private Map<String, SortedSet<Pair<Integer, String>>> sortedCuisine = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodInfo.put(food, new Pair<>(cuisine, rating));
            sortedCuisine
                .computeIfAbsent(cuisine, k -> new TreeSet<>(Comparator
                    .<Pair<Integer, String>, Integer>comparing(Pair::getKey)
                    .reversed()
                    .thenComparing(Pair::getValue)))
                .add(new Pair<>(rating, food));
        }        
    }
    
    public void changeRating(String food, int newRating) {
        Pair<String, Integer> info = foodInfo.get(food);
        String cuisine = info.getKey();
        int oldRating = info.getValue();

        SortedSet<Pair<Integer, String>> sortedList = sortedCuisine.get(cuisine);
        sortedList.remove(new Pair<>(oldRating, food));
        sortedList.add(new Pair<>(newRating, food));

        foodInfo.put(food, new Pair<>(cuisine, newRating));        
    }
    
    public String highestRated(String cuisine) {
        SortedSet<Pair<Integer, String>> sortedList = sortedCuisine.get(cuisine);
        return sortedList.isEmpty() ? "" : sortedList.first().getValue();        
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */
