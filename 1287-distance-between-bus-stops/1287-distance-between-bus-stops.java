class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int front = 0, back = 0, n = distance.length;
        for(int i=start; i != destination; i=(i+1)%n ) front += distance[i];
        for(int j=destination; j != start; j=(j+1)%n ) back += distance[j];
        return Math.min(front, back);
    }
}