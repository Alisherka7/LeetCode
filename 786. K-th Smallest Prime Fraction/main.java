class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        // Create a priority queue to store pairs of fractions
        PriorityQueue<double[]> pq = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        // Push the fractions formed by dividing each element by
        // the largest element into the priority queue
        for (int i = 0; i < arr.length; i++) {
            pq.offer(new double[] {
                -1.0 * arr[i] / arr[arr.length - 1], 
                i, 
                arr.length - 1
            });
        }

        // Iteratively remove the top element (smallest fraction) 
        // and replace it with the next smallest fraction
        while (--k > 0) {
            double[] cur = pq.poll();
            int numeratorIndex = (int) cur[1];
            int denominatorIndex = (int) cur[2] - 1;
            if (denominatorIndex > numeratorIndex) {
                pq.offer(new double[] {
                        -1.0 * arr[numeratorIndex] / arr[denominatorIndex], 
                        numeratorIndex, 
                        denominatorIndex
                });
            }
        }

        // Retrieve the kth smallest fraction from 
        // the top of the priority queue
        double[] result = pq.poll();
        return new int[]{arr[(int) result[1]], arr[(int) result[2]]};
    }
}
