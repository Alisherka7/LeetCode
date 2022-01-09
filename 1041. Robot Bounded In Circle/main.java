class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] dist = new int[4];
        int direction = 0;
        for(char ch : instructions.toCharArray()){
            if(ch == 'G'){
                dist[direction]++;
            }else if(ch == 'L'){
                direction = (direction + 3) % 4;
            }else{
                direction = (direction + 1) % 4;
            }
        }

        int h = Math.abs(dist[0] - dist[2]);
        int v = Math.abs(dist[1] - dist[3]);

        return (direction != 0) || (h==0 && v==0);
    }

}
