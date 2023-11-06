class SeatManager {

    private final Queue<Integer> seats;
    private int smallest;

    public SeatManager(int n) {
        seats = new PriorityQueue<>();
        smallest = 0;
    }

    public int reserve() {
        return seats.isEmpty() ? ++smallest : seats.poll();
    }

    public void unreserve(int seatNumber) {
        seats.offer(seatNumber);
    }
}

/**
 * Your SeatManager object will be instantiated and called as such:
 * SeatManager obj = new SeatManager(n);
 * int param_1 = obj.reserve();
 * obj.unreserve(seatNumber);
 */
