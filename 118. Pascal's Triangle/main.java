class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for(int rowNum=1; rowNum<numRows; rowNum++){
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);
            row.add(1);

            for (int i = 1; i<rowNum; i++){
                row.add(prevRow.get(i-1) + prevRow.get(i));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }
}
