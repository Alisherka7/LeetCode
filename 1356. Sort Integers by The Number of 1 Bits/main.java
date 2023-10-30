class Solution {
    public int[] sortByBits(int[] arr) {
	return Arrays.stream(arr)
			.boxed()
			.sorted(Comparator.comparing(Integer::bitCount).thenComparing(Integer::intValue))
			.mapToInt(i -> i)
			.toArray();
}
}
