class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int count = 0;
        int[] remcount = new int[60];

        for(int t : time) {
            int remainder = t % 60;
            int complement = (60 - remainder) % 60;

            count += remcount[complement];
            remcount[remainder]++;

        }
        return count;
    }
}